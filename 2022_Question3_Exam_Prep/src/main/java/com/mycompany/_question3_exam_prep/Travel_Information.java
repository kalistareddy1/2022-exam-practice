/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._question3_exam_prep;

/**
 *
 * @author kalis
 */
class Travel_Information {
    //Data fields
    private String startLocation;
    private String endLocation;
    private String travelType;
    
    //Generatiing a constructor for the start locaation, end location, and travel type data fields
    public Travel_Information(String startLocation, String endLocation, String travelType) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.travelType = travelType;
    }
    
    //Implementing GETTERS
    public String getStartLocation() {
        return startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public String getTravelType() {
        return travelType;
    }
}
