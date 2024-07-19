package org.yourcompany.yourproject;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class emp {
    @Id
    protected int empid;
    private String empname;
    public emp(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("emp{");
        sb.append("empid=").append(empid);
        sb.append(", empname=").append(empname);
        sb.append('}');
        return sb.toString();
    }

}
