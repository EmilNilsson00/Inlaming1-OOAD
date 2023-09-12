package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Staff {

    private String name;
    private String gender;
    private int id;
    private String employment;
    private LocalDate startDate;

    public Staff(String name, String gender, int id, String employment, LocalDate startDate) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.employment = employment;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nGender: " + gender + "\nID: " + id + "\nEmployment: " + employment + "\nstartDate (yy-mm-dd): " + startDate;
    }

    public int getId() {
        return id;
    }
}
