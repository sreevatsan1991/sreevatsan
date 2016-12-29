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
public class FoodDonor extends Employee{
    
    private String FoodDonorName;
    private static int count=0;
    private int FoodDonor_id=++count;
    private FoodDetailsHistory foodDetailsHistory; 
    //private EmployeeDirectory employeeDirectory;
    
    
     public FoodDonor() {
       foodDetailsHistory = new FoodDetailsHistory();
    }

    public String getFoodDonorName() {
        return FoodDonorName;
    }

    public void setFoodDonorName(String FoodDonorName) {
        this.FoodDonorName = FoodDonorName;
    }

    public int getFoodDonor_id() {
        return FoodDonor_id;
    }

    public void setFoodDonor_id(int FoodDonor_id) {
        this.FoodDonor_id = FoodDonor_id;
    }

    public FoodDetailsHistory getFoodDetailsHistory() {
        return foodDetailsHistory;
    }

    public void setFoodDetailsHistory(FoodDetailsHistory foodDetailsHistory) {
        this.foodDetailsHistory = foodDetailsHistory;
    }
    
     
     
     public String toString(){
        return FoodDonorName;
    } 
     
     
     
     
}
