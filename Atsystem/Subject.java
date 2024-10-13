
package atsystem;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Subject extends SubjectData implements Serializable{
    private static final long serialVersionUID = 1L;
    int mst1Marks=0;
    int mst2Marks=0;
    int mst3Marks=0;
    int semMarks=0;
    int gt=0;
    int d = 0;
    ArrayList<Character> presence;
    int days;
    String path;
    Subject(String SubjectName, String SubID, int days, String path){
        super(SubjectName, SubID, path);
        presence = new ArrayList<>();
        this.days = days;
        this.path = path+"\\"+SubjectName;
        File folder = new File(this.path);
        
        if (!folder.exists()) {
            folder.mkdir();
            
        }

    }
    int day(){
        return d;
    }
    int totalday(){
        return this.presence.size();
        
    }
    void setPresence(char p, int day) {
        presence.set(day, p); 
    }

    void addGt(){
        gt++;
    }
    void removeGt(){
        gt--;
    }
    public int totalDaysOfClasses(){
        return days-gt;
    }
    public int totalGt(){
        return gt;
    }
    void mst1Marks(int mst1Marks){
        this.mst1Marks = mst1Marks;
    }
    void mst2Marks(int mst2Marks){
        this.mst2Marks = mst2Marks;
    }
    void mst3Marks(int mst3Marks){
        this.mst3Marks = mst3Marks;
    }
    void semMarks(int semMarks){
        this.semMarks = semMarks;
    }
    int getMst1Marks(){
        return mst1Marks;
    }
    int getMst2Marks(){
        return mst2Marks;
    }
    int getMst3Marks(){
        return mst3Marks;
    }
    int getSemMarks(){
        return semMarks;
    }

    

}

