
package atsystem;

import static atsystem.ATframe.passDec;
import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    String id;
    String gender;
    String education;
    String password = passDec("member","",1);
    Member(String name, String id, String gender, String edu){
        this.name = name;
        this.id = id;
        this.gender = gender;
        education = edu;
    }
    void setPassword(String pass){
        password = pass;
    }
}
