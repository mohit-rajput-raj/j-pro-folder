
package atsystem;

import java.io.Serializable;


public class admin implements Serializable{
    String name;
    protected String pass;
    admin(String name, String pass){
        this.name = name;
        this.pass = pass;
    }
    void setPassword(String pass){
        this.pass = pass;
    }
    String getp(){
        return pass;
    }
}
