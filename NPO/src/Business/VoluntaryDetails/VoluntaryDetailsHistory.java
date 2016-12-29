/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VoluntaryDetails;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class VoluntaryDetailsHistory {
    
    private ArrayList<VoluntaryDetails> VoluntaryDetailsList;
    
    public VoluntaryDetailsHistory(){
        VoluntaryDetailsList = new ArrayList<VoluntaryDetails>();
    }

    public ArrayList<VoluntaryDetails> getVoluntaryDetailsList() {
        return VoluntaryDetailsList;
    }

    public void setVoluntaryDetailsList(ArrayList<VoluntaryDetails> VoluntaryDetailsList) {
        this.VoluntaryDetailsList = VoluntaryDetailsList;
    }

    
    
    
    
    public VoluntaryDetails addVoluntaryDetails(){
        VoluntaryDetails voluntaryDetails = new VoluntaryDetails();
        VoluntaryDetailsList.add(voluntaryDetails);
        return voluntaryDetails;
    }
    
    public void deletVoluntaryDetails(VoluntaryDetails voluntaryDetails)
    {
        VoluntaryDetailsList.remove(voluntaryDetails);
        
    }
     @Override
    public String toString(){
        return "VoluntaryDetailsHistory";
    }
    
    
    
}
