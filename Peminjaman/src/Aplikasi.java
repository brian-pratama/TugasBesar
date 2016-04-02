
import java.util.Random;

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
    
    public void addAnggota(String nama){
        jumlahAnggota++;
        daftarAnggota[jumlahAnggota-1].setNama(nama);
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
    
    public void addPetugas(String nama){
        jumlahPetugas++;
        daftarAnggota[jumlahPetugas-1].setNama(nama);
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
    
}
