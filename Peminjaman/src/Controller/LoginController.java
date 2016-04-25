/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Aplikasi;
import Model.Login;
import View.LoginView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Brian
 */
public class LoginController implements ActionListener, FocusListener{
    
    Login model = new Login();
    LoginView view = new LoginView();
    
    public LoginController(Login model, LoginView view){
      this.model = model;
      this.view = view;
    }
    
    public void setUsername(String s){
        model.setUsername(s);
    }
    
    public String getUsername(){
        return model.getUsername();
    }
    
    public void setPassword(String s){
        model.setPassword(s);
    }
    
    public String getPassword(){
        return model.getPassword();
    }
    
    public void updateView(){				
        view.
   }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusGained(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
