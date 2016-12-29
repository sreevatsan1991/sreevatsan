/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;



import Business.WorkQueue.*;
import Business.FundDetails.FundDetails;
import Business.Employee.FundDonor;

/**
 *
 * @author vs
 */
public class FundRecipientWorkRequest extends WorkRequest{
      private String testResult;
    private FundDonor fundDonor;
    private FundDetails fundDetails;

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

    public FundDetails getFundDetails() {
        return fundDetails;
    }

    public void setFundDetails(FundDetails fundDetails) {
        this.fundDetails = fundDetails;
    }

    

    
}
