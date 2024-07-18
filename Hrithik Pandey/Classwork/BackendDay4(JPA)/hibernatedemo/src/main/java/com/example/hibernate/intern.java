package com.example.hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="intern")
public class intern{
    
    public intern(){}
    public intern(int internID, List<ceo> c) {
        this.internID = internID;
        this.c = c;
    }
    @Id
    private int internID;
    @ManyToMany
    private List<ceo> c;

    public int getInternID() {
        return internID;
    }

    public void setInternID(int internID) {
        this.internID = internID;
    }
    public List<ceo> getC() {
        return c;
    }
    public void setC(List<ceo> c) {
        this.c = c;
    }

   


}
