/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peminjaman;

/**
 *
 * @author Muhamad Rizal M
 */
public class Anggota extends Orang {
	private Peminjaman[] riwayatPinjaman = new Peminjaman[100];
	private String tanggal_gabung;
	private String nama_anggota;
	private int indeks=0;
	
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
			if  (riwayatPinjaman[i].getidPeminjaman()== id_peminjaman){
					return riwayatPinjaman[i];
			}
		}
			return null;
	}
	
	public void ubahStatus(){
		
	}
}



