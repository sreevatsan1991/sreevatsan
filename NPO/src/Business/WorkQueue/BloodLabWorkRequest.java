/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BloodDetails.BloodDetails;
import Business.Employee.BloodDonor;
import java.util.Date;

/**
 *
 * @author Malick
 */
public class BloodLabWorkRequest extends WorkRequest{
    
    private String testResult;
    private BloodDonor donor;
    private Date processDate;
    private Integer Qty;

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer Qty) {
        this.Qty = Qty;
    }

 

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public BloodDonor getDonor() {
        return donor;
    }

    public void setDonor(BloodDonor donor) {
        this.donor = donor;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
