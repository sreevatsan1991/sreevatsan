/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodDetails;

import java.util.ArrayList;
/**
 *
 * @author Malick
 */
public class FoodDetailsHistory {
    
    private ArrayList<FoodDetails> FoodDetailsList;
    
    public FoodDetailsHistory(){
        FoodDetailsList = new ArrayList<FoodDetails>();
    }

    public ArrayList<FoodDetails> getFoodDetailsList() {
        return FoodDetailsList;
    }

    public void setFoodDetailsList(ArrayList<FoodDetails> FoodDetailsList) {
        this.FoodDetailsList = FoodDetailsList;
    }

    
 

    public FoodDetails addFoodDetails(){
        FoodDetails foodDetails = new FoodDetails();
        FoodDetailsList.add(foodDetails);
        return foodDetails;
    }
    
    public void deleteFoodDetails(FoodDetails foodDetails)
    {
        FoodDetailsList.remove(foodDetails);
        
    }
     @Override
    public String toString(){
        return "FoodDetailsHistory";
    }
    
}
