
package atsystem;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Branch implements Serializable  {
    static int b=1001;
    private static final long serialVersionUID = 1L;
    int totalStudent;
    String BranchName;
    String code;
    List<SubjectData> subjects;
    List<Student> student;
    String path;
    String tag;
    Branch(String BranchName, String Id, int totalStudent,String tag, String path){
        this.BranchName= BranchName;
        this.totalStudent = totalStudent;
        this.code = Id;
        this.tag = tag;
        subjects = new ArrayList<>();
        this.path = path+"\\"+BranchName;
        File folder = new File(this.path);
        student = new ArrayList<Student>();
        if (!folder.exists()) {
            folder.mkdir();
        }

    }
    void addSubject(String name,String id ){
        
        
        subjects.add(new SubjectData(name, id, path));
        

    }
    void addStudent(String name, String id, String gender, String edu, String sess){
        String en=tag+sess.substring(2)+String.valueOf(b);
        student.add(new Student(name, id, gender, edu,en, this.path));
        b++;
    }
    
}
