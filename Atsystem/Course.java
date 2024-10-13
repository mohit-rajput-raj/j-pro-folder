package atsystem;

import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class Course implements Serializable{
    static int c=1;
    private static final long serialVersionUID = 1L;
    String CourseName;
    String id;
    List<Branch> branches;
    int totalStudents;
    String path;
    String tag;
    Course(String CourseName, String id,String tag, String path){
        this.id = id;
        this.tag = tag;
        this.CourseName = CourseName;
        branches = new ArrayList<>();
        
        this.path = path +"\\"+"Courses";
        File folder = new File(this.path);
        
        if (!folder.exists()) {
            folder.mkdir();
            
        }
        this.path = this.path+"\\"+CourseName;
        folder = new File(this.path);
        
        if (!folder.exists()) {
            folder.mkdir();
            
        }
        
        
    }


    void addBranches(String name, String code, int Student) {
        String k="";
        if(c<10){
            k = "0"+String.valueOf(c);
        }else{
            k = String.valueOf(c);
        }
        String en=tag+k;
        branches.add(new Branch(name, code, Student,en, path));
        totalStudents = totalStudents + Student;
        c++;
    }

    int getTotalstudents() {
        return totalStudents;
    }

}
