
package atsystem;

import java.util.ArrayList;
import java.io.*;
public class Teacher extends Member implements Serializable{
    private static final long serialVersionUID = 1L;
    String path;
    
    ArrayList<SubjectData> ExpertIn = new ArrayList<>();
    
    Teacher(String n, String id, String edu, String gender, String path) {
        super(n, id, gender,edu );
        
        this.path = path+"\\"+"teachers";
        File folder = new File(this.path);
        
        if (!folder.exists()) {
            folder.mkdir();
            
        }
        this.path = this.path+"\\"+n;
        folder = new File(this.path);
        
        if (!folder.exists()) {
            folder.mkdir();
            
        }
        
    }
    void addExperiencedSubject(String sub, String id){
        ExpertIn.add(new SubjectData(sub, id,path ));
    }
    
}
