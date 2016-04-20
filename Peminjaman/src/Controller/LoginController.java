/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Aplikasi;
import View.Login;
import javax.swing.JFrame;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Brian
 */
public class LoginController {
    
    Aplikasi model;
    Login view;
    
    public LoginController(Aplikasi model, Login view){
      this.model = model;
      this.view = view;
    }
   
    public void setUsername(String username){
        view.setUsername(username);
    }
    
    public void setPassword(String password){
        view.setPassword(password);
    }
    
    public void btnMasukClicked(){
        
        if (Login(model.Login(view.getUsername(), view.getPassword())) == true){
            model
        }
    }
    
    
    
    public void updateView(String username, String password){
        view = new Login(username, password);
    }
    
}
