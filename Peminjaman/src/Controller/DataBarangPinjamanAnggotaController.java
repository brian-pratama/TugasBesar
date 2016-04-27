/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.DataBarangPinjamanAnggotaView;
import View.MenuAnggotaView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Brian
 */
public class DataBarangPinjamanAnggotaController implements ActionListener {
    
    Aplikasi model;
    DataBarangPinjamanAnggotaView view;
    
    public DataBarangPinjamanAnggotaController(Aplikasi model){
      this.model = model;
      view = new DataBarangPinjamanAnggotaView();
      view.setVisible(true);
      view.addListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source.equals(view.getBtnCari())){
            
        }
    }
    
}
