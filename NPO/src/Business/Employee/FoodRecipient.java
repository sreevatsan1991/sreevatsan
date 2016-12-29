/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.FoodDetails.FoodDetailsHistory;


/**
 *
 * @author Malick
 */
public class FoodRecipient extends Employee{
    
    
    private String FoodRecipientName;
    private static int count=0;
    private int FoodRecpient_id=++count;
    private FoodDetailsHistory foodDetailsHistory;
    
    public FoodRecipient() {
        foodDetailsHistory= new FoodDetailsHistory();
    }

    public String getFoodRecipientName() {
        return FoodRecipientName;
    }

    public void setFoodRecipientName(String FoodRecipientName) {
        this.FoodRecipientName = FoodRecipientName;
    }

    public int getFoodRecpient_id() {
        return FoodRecpient_id;
    }

    public void setFoodRecpient_id(int FoodRecpient_id) {
        this.FoodRecpient_id = FoodRecpient_id;
    }

    public FoodDetailsHistory getFoodDetailsHistory() {
        return foodDetailsHistory;
    }

    public void setFoodDetailsHistory(FoodDetailsHistory foodDetailsHistory) {
        this.foodDetailsHistory = foodDetailsHistory;
    }
    
    
    
    public String toString(){
        return FoodRecipientName;
    }
    

    
}
