/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.WorkQueue.*;
import Business.Employee.FoodDonor;

/**
 *
 * @author Malick
 */
public class FoodAssistWorkRequest extends WorkRequest{
    
    private String testResult;
    private FoodDonor foodDonor;
    private Integer Qty;

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer Qty) {
        this.Qty = Qty;
    }

    public FoodDonor getFoodDonor() {
        return foodDonor;
    }

    public void setFoodDonor(FoodDonor foodDonor) {
        this.foodDonor = foodDonor;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
