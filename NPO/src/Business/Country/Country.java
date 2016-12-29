/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Country;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class Country {
    private String countryName;
    private ArrayList<String> stateNames;
    public Country(String name){
        stateNames = new ArrayList<>();
        this.countryName = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public ArrayList<String> getStateNames() {
        return stateNames;
    }

    public void setStateNames(ArrayList<String> stateNames) {
        this.stateNames = stateNames;
    }
    
}
 