/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.WorkQueue.*;
import Business.VoluntaryDetails.VoluntaryDetails;
import Business.Employee.VoluntaryDonor;
import Business.Employee.VoluntaryRecipient;
import java.util.Date;

/**
 *
 * @author vs
 */
public class VoluntaryDistributorWorkRequest extends WorkRequest{
    private String testResult;
    private VoluntaryDonor voluntaryDonor;
    private VoluntaryDetails voluntaryDetails;
    private VoluntaryRecipient voluntaryRecipient;
    private Date expiryDate;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public VoluntaryDonor getVoluntaryDonor() {
        return voluntaryDonor;
    }

    public void setVoluntaryDonor(VoluntaryDonor voluntaryDonor) {
        this.voluntaryDonor = voluntaryDonor;
    }

    public VoluntaryDetails getVoluntaryDetails() {
        return voluntaryDetails;
    }

    public void setVoluntaryDetails(VoluntaryDetails voluntaryDetails) {
        this.voluntaryDetails = voluntaryDetails;
    }

    public VoluntaryRecipient getVoluntaryRecipient() {
        return voluntaryRecipient;
    }

    public void setVoluntaryRecipient(VoluntaryRecipient voluntaryRecipient) {
        this.voluntaryRecipient = voluntaryRecipient;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    
    
    
    
    
    
    
}
