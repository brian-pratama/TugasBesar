
import View.LoginView;
import static sun.security.jgss.GSSUtil.login;
import Controller.LoginController;
import Model.Aplikasi;
import java.awt.event.MouseEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginView loginView = new LoginView();
        Aplikasi appModel = new Aplikasi();
        
        LoginController loginCon = new LoginController();
        
        loginView.getBtnMasuk().addActionListener(MouseEvent me){
            appModel.Login(loginView.getUsername(), loginView.getPassword());
        }
    }
    
}
