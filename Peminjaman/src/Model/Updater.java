/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import structures.Peminjaman;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brian
 */
public class Updater {
    public static JTable updateTablePeminjaman(JTable table, Peminjaman[] peminjaman){
        DefaultTableModel model = new DefaultTableModel(0, 0);
        model.addRow(peminjaman);
        table.setModel(model);
        return table;
    }
}
