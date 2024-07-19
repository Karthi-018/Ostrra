package org.yourcompany.yourproject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class intern{
    
    private String manager;
    @Id
    private int internID;
    @ManyToOne
    private ceo c;
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getInternID() {
        return internID;
    }

    public void setInternID(int internID) {
        this.internID = internID;
    }

    public ceo getC() {
        return c;
    }

    public void setC(ceo c) {
        this.c = c;
    }


}
