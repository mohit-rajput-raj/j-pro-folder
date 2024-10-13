
package atsystem;

import java.io.File;
import java.io.Serializable;

public class SubjectData implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    String SubjectName;
    String SubID;
    String path;
    
    SubjectData(String SubjectName, String SubID, String path){
        this.SubjectName = SubjectName;
        this.SubID = SubID;
//        this.path = path +"\\SUBJECTDATA";
//        File folder = new File(this.path);
//        
//        if (!folder.exists()) {
//            folder.mkdir();
//            
//        }
//        folder = new File(this.path+"\\"+this.SubjectName);
//        
//        if (!folder.exists()) {
//            folder.mkdir();
//            
//        }
    }
    
}
