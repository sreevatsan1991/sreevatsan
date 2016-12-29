/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BloodDetails.BloodDetails;
import Business.Employee.BloodDonor;
import Business.Employee.BloodRecipient;
import java.util.Date;

/**
 *
 * @author vs
 */
public class BloodDistributorWorkRequest extends WorkRequest{
    private String testResult;
    private BloodDonor BloodDonor;
    private BloodDetails bloodDetails;
    private BloodRecipient bloodRecipient;
    private Date expiryDate;

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public BloodRecipient getBloodRecipient() {
        return bloodRecipient;
    }

    public void setBloodRecipient(BloodRecipient bloodRecipient) {
        this.bloodRecipient = bloodRecipient;
    }
    
    

 

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public BloodDonor getBloodDonor() {
        return BloodDonor;
    }

    public void setBloodDonor(BloodDonor donor) {
        this.BloodDonor = donor;
    }

    public BloodDetails getBloodDetails() {
        return bloodDetails;
    }

    public void setBloodDetails(BloodDetails bloodDetails) {
        this.bloodDetails = bloodDetails;
    }
}
