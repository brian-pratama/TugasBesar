/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Brian
 */
public class Login {
    Aplikasi app = new Aplikasi();
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean Login(String username, String password){
        if (!app.noUsernameAnggota(username)){
            return app.getAnggota(username).getPassword() == null ? password == null : app.getAnggota(username).getPassword().equals(password);
        }else{
            return false;
        }
    }
}
