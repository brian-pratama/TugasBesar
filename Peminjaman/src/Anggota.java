import java.util.*;
import java.text.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Muhamad Rizal M
 */
public class Anggota extends Orang {
	private Peminjaman[] riwayatPinjaman = new Peminjaman[100];
	private String tanggal_gabung;
        private String id_anggota;
	private String nama_anggota;
	private int indeks=0;
        
        public void setIdAnggota(String id){
            id_anggota = id;
        }
        
        public String getIdAnggota(){
            return id_anggota;
        }
        
        public void setNama(String nama){
            nama_anggota = nama;
        }
        
        public String getNama(){
            return nama_anggota;
        }
        
	public void createPinjaman(String tanggal){
		
            if(indeks<riwayatPinjaman.length){
			riwayatPinjaman[indeks] = new Peminjaman() ;
			riwayatPinjaman[indeks].setTanggal(tanggal);
			indeks++;
	}
		else{
			System.out.println("DATA SUDAH PENUH!");
	}
		
		
}
	
	public Peminjaman getPeminjaman(int indeks){
		return riwayatPinjaman[indeks] ;
		
	}
	
	public Peminjaman getPeminjaman(String id_peminjaman){
		for (int i=0; i<riwayatPinjaman.length;i++){
			if  (riwayatPinjaman[i].getIdPeminjaman() == id_peminjaman){
					return riwayatPinjaman[i];
			}
		}
			return null;
	}
	
        public boolean noId(String id)
        {
            int seeker = 0;
            if ( riwayatPinjaman[0] == null )
            {
                return true;
            }
            else
            {
                while ( riwayatPinjaman[seeker + 1] != null )
                {
                    if ( riwayatPinjaman[seeker].getIdPeminjaman() == id )
                    {
                        return false;
                    }
                    else
                    {
                        seeker++;
                    }
                }
                return true;
            }
        }
        
	public void ubahStatus(String status){
		int i = 0;
                if (getPeminjaman(i) != null)
                {
                    while(getPeminjaman(i+1) != null)
                    {
                        i++;
                    }
                    getPeminjaman(i).setStatusPeminjaman(status);
                }
	}
        
        public void createPinjaman(Date tanggal)
        {
            int seeker = 0;
            
            while( riwayatPinjaman[seeker] != null && seeker <= 100 )
            {
                seeker++;
            }
            
            if( seeker > 100 )
            {
                for (int i = 0; i <= 99; i++)
                {
                    riwayatPinjaman[i] = riwayatPinjaman[i+1];
                }
                riwayatPinjaman[100] = new Peminjaman();
                int intId = 0000;
                String newId = Integer.toString(intId);
                if ( !noId( newId ) ) {
                    Random r = new Random();
                    intId = 1 + 9999 - 1 * r.nextInt();
                    newId = Integer.toString(intId);
                    while ( !noId( newId ) )
                    {
                        intId = 1 + 9999 - 1 * r.nextInt();
                        newId = Integer.toString(intId);
                    }
                }
                riwayatPinjaman[100].setIdPeminjaman(newId);
            }
            else
            {
                riwayatPinjaman[seeker] = new Peminjaman();
                int intId = 0000;
                String newId = Integer.toString(intId);
                if ( !noId( newId ) ) {
                    Random r = new Random();
                    intId = 1 + 9999 - 1 * r.nextInt();
                    newId = Integer.toString(intId);
                    while ( !noId( newId ) )
                    {
                        intId = 1 + 9999 - 1 * r.nextInt();
                        newId = Integer.toString(intId);
                    }
                }
            }
        }
}



