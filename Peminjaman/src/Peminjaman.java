
import java.util.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class Peminjaman {
    private String idPeminjaman;
    private Barang[] pinjaman;
    private Date tanggal;
    private int jumlah_barang;
    private String status_peminjaman;
    
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    public void setIdPeminjaman( String id )
    {
        idPeminjaman = id;
    }
    
    public String getIdPeminjaman()
    {
        return idPeminjaman;
    }
    
    public int getJumlahBarang()
    {
        return jumlah_barang;
    }
    
    public Barang getBarangPinjamanByIndex(int I)
    {
        return Barang[I];
    }
    
    public Barang getBarangPinjamanById(int Id)
    {
        int i = 0;
        while ( i <= jumlah_peminjaman && Barang[i].idPeminjaman == Id )
        {
            i++;
        }
        
        if (Barang[i].idPeminjaman == Id)
        {
            return Barang[i];
        }
        else
        {
            return null;
        }
    }
    
    public void addPinjaman(Barang b)
    {
        jumlah_barang++;
        Barang[jumlah_barang] = b;
    }
    
    public void setTanggal(String tanggal)
    {
        try {
            this.tanggal = DateFormat.parse(tanggal);
        } catch (ParseException ex) {
            System.out.println("Format tanggal salah"); 
        }
    }
    
    public Date getTanggal()
    {
        return tanggal;
    }
    
    public void setStatusPeminjaman(String status)
    {
        status_peminjaman = status;
    }
    
    public String getStatusPeminjaman()
    {
        return status_peminjaman;
    }
    
    //remove barang by id
    public void removeBarang(id)
    {
         int i = 0;
        while ( i <= jumlah_peminjaman && Barang[i].idPeminjaman == Id )
        {
            i++;
        }
        
        if (Barang[i].idPeminjaman == Id)
        {
            for(int j = i; j <= jumlah_barang - 1; j++)
            {
                Barang[j] = Barang[j+1]
            }
            jumlah_barang--;
        }
    }
    
}
