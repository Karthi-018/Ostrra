package org.yourcompany.yourproject;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ceo{
    @Id
    private int ceoID;
    @OneToMany(mappedBy="manager")
    List<intern> interns;

    public List<intern> getInterns() {
        return interns;
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
