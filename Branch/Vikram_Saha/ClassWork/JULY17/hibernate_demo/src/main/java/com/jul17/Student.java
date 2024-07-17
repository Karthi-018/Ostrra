package com.jul17;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Entity
public class Student {
    @Id
    int id;
    String sname;
    @OneToOne
    Grade grade;
    @OneToMany(mappedBy = "student")
    List<Library> books;
}
