package Model;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class Aplikasi {
    //*** daftar array ***
    private Anggota[] daftarAnggota = new Anggota[99];
    private Petugas[] daftarPetugas = new Petugas[9];
    private int jumlahAnggota = 0;
    private int jumlahPetugas = 0;
    
    //*** method ***
    /*
        + addPetugas( ..[parameter Petugas]...)
        + addAnggota( ...[parameter Anggota]...)
        + getAnggota( id ) : Anggota
        + deleteAnggota( id )
    */
    
    public boolean Login(String username, String password){
        if (!noUsernameAnggota(username)){
            if (getAnggota(username).getPassword() == password){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    //cek apakah id anggota sudah ada
    public boolean noIdAnggota(String id){
        int i;
        for ( i = 0; i<jumlahAnggota; i++ ){
            if ( daftarAnggota[i].getIdAnggota() == id ){
                return false;
            }
        }
        return true;
    }
    
    //cek apakah username Anggota sudah ada
    public boolean noUsernameAnggota(String username){
        int i;
        for ( i = 0; i<jumlahAnggota; i++ ){
            if ( daftarAnggota[i].getUsername() == username ){
                return false;
            }
        }
        return true;
        
    }
    
    //cek apakah id anggota sudah ada
    public boolean noIdPetugas(String id){
        int i;
        for ( i = 0; i<jumlahPetugas; i++ ){
            if ( daftarPetugas[i].getIdPetugas() == id ){
                return false;
            }
        }
        return true;
    }
    
    //cek apakah username Petugas sudah ada
    public boolean noUsernamePetugas(String username){
        int i;
        for ( i = 0; i<jumlahPetugas; i++ ){
            if ( daftarPetugas[i].getUsername() == username ){
                return false;
            }
        }
        return true;
        
    }
    
    //buat id anggota baru secara random(100 <= id <= 199)
    public String randomIdAnggota() {
		Random r = new Random();
		int i = 1 + (199 - 100) * r.nextInt();
                return Integer.toString(i);
    }
    
    //buat id anggota baru secara random(200 <= id <= 209)
    public String randomIdPetugas() {
		Random r = new Random();
		int i = 1 + (209 - 200) * r.nextInt();
                return Integer.toString(i);
    }
    
    public void addAnggota(String nama, String username, String password){
        jumlahAnggota++;
        daftarAnggota[jumlahAnggota-1].setNama(nama);
        daftarAnggota[jumlahAnggota-1].setUsername(username);
        daftarAnggota[jumlahAnggota-1].setUsername(password);
        //secara otomatis buat id
        String id = randomIdAnggota();
        while ( !noIdAnggota(id) ) {
            id = randomIdAnggota();
        }
        daftarAnggota[jumlahAnggota-1].setIdAnggota(id);
    }
    
    public Anggota getAnggota( int i ){
        if ( i < jumlahAnggota ) {
            return daftarAnggota[i];
        }
        else
            return null;
    }
    
    public Anggota getAnggota( String username ){
        for ( int i = 0; i < jumlahAnggota ; i++ ) {
            if(daftarAnggota[i].getUsername() == username){
                return daftarAnggota[i];
            }
        }
        return null;
    }
    
    public int getIndeksAnggota( String username ){
        if (jumlahAnggota == 0){
            return 999;
        }
        else{
            int i;
            for ( i = 0; i<jumlahAnggota; i++ ){
                if( daftarAnggota[i].getUsername() == username ){
                    return i;
                }
            }
            return 999;
        }
    }
    
    //mencari anggota berdasarkan id dan mengembalikan indeksnya
    public int findIndeksAnggota( String id ){
        if (jumlahAnggota == 0){
            return 999;
        }
        else{
            int i;
            for ( i = 0; i<jumlahAnggota; i++ ){
                if( daftarAnggota[i].getIdAnggota() == id ){
                    return i;
                }
            }
            return 999;
        }
    }
    
    public void deleteAnggota( String id ){
        if ( findIndeksAnggota(id) != 999 ){
            for( int i = findIndeksAnggota(id); i<jumlahAnggota-1; i++ ){
                daftarAnggota[i] = daftarAnggota[i+1];
            }
            jumlahAnggota--;
        }
    }
    
    public void addPetugas(String nama, String username, String password){
        jumlahPetugas++;
        daftarPetugas[jumlahPetugas-1].setNama(nama);
        daftarPetugas[jumlahPetugas-1].setUsername(username);
        daftarPetugas[jumlahPetugas-1].setUsername(password);
        //secara otomatis buat id
        String id = randomIdPetugas();
        while ( !noIdPetugas(id) ) {
            id = randomIdPetugas();
        }
        daftarAnggota[jumlahAnggota-1].setIdAnggota(id);
    }
    
    public Petugas getPetugas( int i ){
        if ( i < jumlahAnggota ) {
            return daftarPetugas[i];
        }
        else
            return null;
    }
    
    public int getIndeksPetugas( String username ){
        if (jumlahPetugas == 0){
            return 999;
        }
        else{
            int i;
            for ( i = 0; i<jumlahAnggota; i++ ){
                if( daftarPetugas[i].getUsername() == username ){
                    return i;
                }
            }
            return 999;
        }
    }
    
    //mencari petugas berdasarkan id dan mengembalikan indeksnya
    public int findIndeksPetugas( String id ){
        if (jumlahAnggota == 0){
            return 999;
        }
        else{
            int i;
            for ( i = 0; i<jumlahPetugas; i++ ){
                if( daftarPetugas[i].getIdPetugas() == id ){
                    return i;
                }
            }
            return 999;
        }
    }
    
    public void deletePetugas( String id ){
        if ( findIndeksPetugas(id) != 999 ){
            for( int i = findIndeksPetugas(id); i<jumlahPetugas-1; i++ ){
                daftarPetugas[i] = daftarPetugas[i+1];
            }
            jumlahPetugas--;
        }
    }
    
    //*** menu ***
    
    Scanner input = new Scanner(System.in);
    
    //*** tambah anggota ***
    
    //menu tambah anggota
    public void tambahAnggota() {
        
        System.out.println("Nama    : ");
        String nama = input.nextLine();
        
        System.out.println("Username: ");
        String username = input.nextLine();
        //input ulang jika username sudah ada
        while ( !noUsernamePetugas(username) ){
            System.out.println("Username sudah ada.");
            System.out.print("Username: ");
            username = input.nextLine();
        }
        
        System.out.println("Password: ");
        String pass = input.nextLine();
        
        addAnggota(nama, username, pass);
    };
    
    //menu tambahPetugas
    public void tambahPetugas() {
        
        System.out.print("Nama    : ");
        String nama = input.nextLine();
        
        System.out.print("Username: ");
        String username = input.nextLine();
        //input ulang jika username sudah ada
        while ( !noUsernamePetugas(username) ){
            System.out.println("Username sudah ada.");
            System.out.print("Username: ");
            username = input.nextLine();
        }
        
        System.out.print("Password: ");
        String pass = input.nextLine();
        
        addPetugas(nama, username, pass);
    };
    
    public void searchAnggota() {
        
        System.out.print("Username: ");
        String username = input.nextLine();
        
        if (getIndeksAnggota(username) != 999){
            System.out.println("Nama: " + daftarAnggota[getIndeksAnggota(username)].getNama());
            System.out.println("Id  : " + daftarAnggota[getIndeksAnggota(username)].getIdAnggota());
        }
        else{
            System.out.println("Maaf, anggota dengan username tersebut tidak ditemukan");
        }
    };
    
    public void searchPetugas() {
        
        System.out.print("Username: ");
        String username = input.nextLine();
        
        if (getIndeksPetugas(username) != 999){
            System.out.println("Nama: " + daftarPetugas[getIndeksPetugas(username)].getNama());
            System.out.println("Id  : " + daftarPetugas[getIndeksPetugas(username)].getIdPetugas());
        }
        else{
            System.out.println("Maaf, anggota dengan username tersebut tidak ditemukan");
        }
    };
    
    public void deleteAnggota(){
        System.out.print("ID: ");
        String id = input.nextLine();
        
        deleteAnggota(id);
    }
    
    public void deletePetugas(){
        System.out.print("ID: ");
        String id = input.nextLine();
        
        deletePetugas(id);
    }
    
    public void mainMenu(){
        System.out.println("Main Menu");
        System.out.println("1. Tambah Anggota.");
        System.out.println("2. Cari Anggota.");
        System.out.println("3. Hapus Anggota.");
        System.out.println("4. Tambah Petugas.");
        System.out.println("5. Cari Petugas.");
        System.out.println("6. Hapus Petugas.");
        System.out.print("Pilih salah satu: ");
        int pilihan = Integer.parseInt(input.nextLine());
        
        switch (pilihan) {
            case 1:  tambahAnggota(); break;
            case 2:  searchAnggota(); break;
            case 3:  deleteAnggota(); break;
            case 4:  tambahPetugas(); break;
            case 5:  searchPetugas(); break;
            case 6:  deletePetugas(); break;
            default: break;
        }
    }
}
