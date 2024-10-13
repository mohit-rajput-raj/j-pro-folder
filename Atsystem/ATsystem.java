package atsystem;

import static atsystem.ATframe.passDec;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class College implements Serializable {
    private static final long serialVersionUID = 1L;
    static int o=1;
    String name;
    String id;
    List<Course> course;
    List<Teacher> teacher;
    String path;
    admin adm;

    College(String name, String id, String path) {
        this.id = id;
        this.name = name;
        this.path = path + "\\" + name;
        course = new ArrayList<>();
        teacher = new ArrayList<>();
        File folder = new File(this.path);

        if (!folder.exists()) {
            folder.mkdirs(); 
        }
        
        this.adm = new admin("admin", passDec("admin","",1));
    }

    void addCourse(String name, String id) {
        String k="";
        if(o<10){
            k = "0"+String.valueOf(o);
        }else{
            k = String.valueOf(o);
        }
        String en=this.id+k;
        course.add(new Course(name, id, en, this.path));
        o++;
    }
    
    void addTeacher(String name, String id, String education, String gender){
        teacher.add(new Teacher(name, id, education, gender, this.path));
    }
}

public class ATsystem {
    
    public static College getif(String path) {
        String filename = "college.txt";
        String filePath = path + "\\" + filename;
        File file = new File(filePath);
        
        if (file.exists() && file.length() > 0) {
        College ll = null;
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
             
            ll = (College) ois.readObject();  
            System.out.println("Object loaded successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ll;
    }
        
        College c = new College("sgsits", "08", path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(c); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return c;
    }
    

    public static void main(String[] args) {
        String path = "C:" + "\\" + "COLLEGE";
        File folder = new File(path);

        if (!folder.exists()) {
            folder.mkdirs();
        }
        
        College c = getif(path);
        
        ATframe rme = new ATframe(c);
        rme.setVisible(true);
        
//                c.course.get(0).branches.get(0).student.get(0).password = passDec("mohit","",1);
    }
}  
