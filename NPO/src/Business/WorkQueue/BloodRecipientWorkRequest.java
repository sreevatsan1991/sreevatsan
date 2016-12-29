/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.BloodDetails.BloodDetails;
import Business.Employee.BloodDonor;

/**
 *
 * @author vs
 */
public class BloodRecipientWorkRequest extends WorkRequest{
      private String testResult;
    private BloodDonor donor;
    private BloodDetails bloodDetails;

    public BloodDetails getBloodDetails() {
        return bloodDetails;
    }

    public void setBloodDetails(BloodDetails bloodDetails) {
        this.bloodDetails = bloodDetails;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public BloodDonor getDonor() {
        return donor;
    }

    public void setDonor(BloodDonor donor) {
        this.donor = donor;
    }

    
}
