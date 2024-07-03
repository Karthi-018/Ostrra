
import java.io.Serializable;

public class Student implements Serializable {
    private int sId;
    private String sNAme;
    private String course;

    public Student(int sId,String sName,String course) {
        this.sId = sId;
        this.sNAme = sName;
        this.course = course;


    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setsNAme(String sNAme) {
        this.sNAme = sNAme;
    }

    public String getCourse() {
        return course;
    }

    public int getsId() {
        return sId;
    }

    public String getsNAme() {
        return sNAme;
    }

    @Override
    public String toString() {
        return "sId" + " " + sId + " " + "sName" + " " + sNAme + " " + "course" + " " + course; 
    }
    
    

    


    
    
}
