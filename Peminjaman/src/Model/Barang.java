package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class Barang {
    private String id;
    private String status_pinjam;
    private String status_kondisi;
    
    public void setIdBarang(String id)
    {
        this.id = id;
    }
    
    public String getIdBarang(){
        return id;
    }
    
    public void setStatusKondisi(String k)
    {
        status_kondisi = k;
    }
    
    public String getStatusKondisi(){
        return status_kondisi;
    }
    
    public void setStatusPinjam(String k)
    {
        status_pinjam = k;
    }
    
    public String getStatusPinjam(){
        return status_pinjam;
    }
}
