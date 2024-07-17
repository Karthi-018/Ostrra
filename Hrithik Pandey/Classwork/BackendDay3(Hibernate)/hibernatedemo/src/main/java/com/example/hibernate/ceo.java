package com.example.hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ceo")
public class ceo{
    @Id
    public int ceoID;
    @ManyToMany(mappedBy="c")
    List<intern> interns;

    public List<intern> getInterns() {
        return interns;
    }

    public ceo() {
    }

    public ceo(int ceoID, List<intern> interns) {
        this.ceoID = ceoID;
        this.interns = interns;
    }

    public void setInterns(List<intern> interns) {
        this.interns = interns;
    }

    public int getCeoID() {
        return ceoID;
    }

    public void setCeoID(int ceoID) {
        this.ceoID = ceoID;
    }
   

}
