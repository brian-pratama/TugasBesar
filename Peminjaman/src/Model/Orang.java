package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Muhamad Rizal M
 */
public class Orang {
	private String nama ;
	private String password;
	
	public void setNama (String nama){
		this.nama = nama;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setPassword (String password){
		this.password = password;
	}
	
	public String getPassword (){
		return password;
	}
}
