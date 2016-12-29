/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BloodDetails;


import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class BloodDetailsHistory {
    private ArrayList<BloodDetails> BloodDetailsList;
    
    public BloodDetailsHistory(){
        BloodDetailsList = new ArrayList<BloodDetails>();
    }

    public ArrayList<BloodDetails> getBloodDetailsList() {
        return BloodDetailsList;
    }

    public void setBloodDetailsList(ArrayList<BloodDetails> BloodDetailsList) {
        this.BloodDetailsList = BloodDetailsList;
    }
    public BloodDetails addBloodDetails(){
        BloodDetails bloodDetails = new BloodDetails();
        BloodDetailsList.add(bloodDetails);
        return bloodDetails;
    }
    
    public void deletBloodDetails(BloodDetails bloodDetails)
    {
        BloodDetailsList.remove(bloodDetails);
        
    }
     @Override
    public String toString(){
        return "BloodDetailsHistory";
    }
}
