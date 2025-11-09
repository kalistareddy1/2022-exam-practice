/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._question1_exam_prep;

/**
 *
 * @author kalis
 */
class Hospital_Inspection {
    //Data fields
    private String name;
    private String location;
    private String years;

    //Generatiing a constructor for the name, locaation, and years data fields
    public Hospital_Inspection(String name, String location, String years) {
        this.name = name;
        this.location = location;
        this.years = years;
    }

    //Implementing GETTERS
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getYears() {
        return years;
    }
}
