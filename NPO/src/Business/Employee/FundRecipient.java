/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.FundDetails.FundDetailsHistory;

/**
 *
 * @author Malick
 */
public class FundRecipient extends Employee{
    
    private String FundRecipientName;
    private static int count=0;
    private int FundRecpient_id=++count;
    private FundDetailsHistory fundDetailsHistory;

    public FundRecipient() {
        fundDetailsHistory= new FundDetailsHistory();
    }

    public String getFundRecipientName() {
        return FundRecipientName;
    }

    public void setFundRecipientName(String FundRecipientName) {
        this.FundRecipientName = FundRecipientName;
    }

    public int getFundRecpient_id() {
        return FundRecpient_id;
    }

    public void setFundRecpient_id(int FundRecpient_id) {
        this.FundRecpient_id = FundRecpient_id;
    }

    public FundDetailsHistory getFundDetailsHistory() {
        return fundDetailsHistory;
    }

    public void setFundDetailsHistory(FundDetailsHistory fundDetailsHistory) {
        this.fundDetailsHistory = fundDetailsHistory;
    }
    
    
    public String toString(){
        return FundRecipientName;
    }
    
    
}
