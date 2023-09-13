package org.example;

import java.time.LocalDate;

public class Trainee extends Staff{

    private LocalDate endDate;
    private String wittyWords;

    public Trainee(String name, String gender, int id, String employment, LocalDate startDate, LocalDate endDate, String wittyWords) {
        super(name, gender, id, employment, startDate);
        this.endDate = endDate;
        this.wittyWords = wittyWords;
    }
    @Override
    public String toString() {
        return super.toString() + "\nEnd date (yyyy-mm-dd): " + endDate + "\nWitty words: " + wittyWords;
    }
}
