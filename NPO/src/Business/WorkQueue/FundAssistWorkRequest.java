/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.WorkQueue.*;
import Business.Employee.FundDonor;

/**
 *
 * @author Malick
 */
public class FundAssistWorkRequest extends WorkRequest{
    
    private String testResult;
    private FundDonor fundDonor;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public FundDonor getFundDonor() {
        return fundDonor;
    }

    public void setFundDonor(FundDonor fundDonor) {
        this.fundDonor = fundDonor;
    }

    
    
    
}
