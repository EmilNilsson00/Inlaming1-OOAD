package org.example;

import java.util.ArrayList;

public class MenuStructure {

    private String description;
    private ArrayList<String> options;

    public MenuStructure(String description, ArrayList<String> options) {
        this.description = description;
        this.options = options;
    }
    //Skapa method för att skriva ut Menyn.


    public String getDescription() {
        return description;
    }

    public ArrayList<String> getOptions() {
        return options;
    }
}

