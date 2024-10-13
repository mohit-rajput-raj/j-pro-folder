
package atsystem;


import java.util.*;
import java.io.*;
public class Student extends Member implements Serializable{
    private static final long serialVersionUID = 1L;
    
    List<Subject> subject;
    String path;
    String courseid;
    
    String enrolmentnumber;
    Student(String name, String id, String g, String edu,String tag, String path) {
        super(name, id, g, edu);
        this.path = path +"\\STUDENTS";
        this.enrolmentnumber = tag;
        this.subject = new ArrayList<>();
        File folder = new File(this.path);
        
        if (!folder.exists()) {
            folder.mkdir();
            
        }
        this.path = this.path+"\\"+name+id;
        folder = new File(this.path);
        
        if (!folder.exists()) {
            folder.mkdir();
            
        }
        
    }
    
    void addSubject(String sName, String sId, int totalClass){
        this.subject.add(new Subject(sName, sId, totalClass, path));
        
    }
    
    
}

