
import java.io.Serializable;



public class Employee implements Serializable {
    public int eid;
    public String ename;
    public String dept;

    public Employee(int eid, String ename,String dept) {
        this.eid=eid;
        this.ename=ename;
        this.dept=dept;
        
    }

    
}

