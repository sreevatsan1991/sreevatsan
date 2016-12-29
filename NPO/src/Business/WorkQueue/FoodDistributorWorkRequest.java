/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.WorkQueue.*;
import Business.FoodDetails.FoodDetails;
import Business.Employee.FoodDonor;
import Business.Employee.FoodRecipient;
import java.util.Date;

/**
 *
 * @author vs
 */
public class FoodDistributorWorkRequest extends WorkRequest{
    private String testResult;
    private FoodDonor foodDonor;
    private FoodDetails foodDetails;
    private FoodRecipient foodRecipient;
    private Date expiryDate;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public FoodDonor getFoodDonor() {
        return foodDonor;
    }

    public void setFoodDonor(FoodDonor foodDonor) {
        this.foodDonor = foodDonor;
    }

    public FoodDetails getFoodDetails() {
        return foodDetails;
    }

    public void setFoodDetails(FoodDetails foodDetails) {
        this.foodDetails = foodDetails;
    }

    public FoodRecipient getFoodRecipient() {
        return foodRecipient;
    }

    public void setFoodRecipient(FoodRecipient foodRecipient) {
        this.foodRecipient = foodRecipient;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


    
    
    
    
    
    
    
    
}
