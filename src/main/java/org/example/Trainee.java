package org.example;

import java.time.LocalDate;

public class Trainee extends Staff{

    private LocalDate endDate;

    public Trainee(String name, String gender, int id, String employment, LocalDate startDate, LocalDate endDate) {
        super(name, gender, id, employment, startDate);
        this.endDate = endDate;
    }
    @Override
    public String toString() {
        return super.toString() + "\nEndDate (yy-mm-dd): " + endDate;
    }
}
