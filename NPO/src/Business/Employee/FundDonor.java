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
public class FundDonor extends Employee{
    
    private String FundDonorName;
    private static int count=0;
    private int FundDonor_id=++count;
    private FundDetailsHistory fundDetailsHistory; 
    //private EmployeeDirectory employeeDirectory;

    public FundDonor() {
       fundDetailsHistory = new FundDetailsHistory();
    }

    public String getFundDonorName() {
        return FundDonorName;
    }

    public void setFundDonorName(String FundDonorName) {
        this.FundDonorName = FundDonorName;
    }

    public int getFundDonor_id() {
        return FundDonor_id;
    }

    public void setFundDonor_id(int FundDonor_id) {
        this.FundDonor_id = FundDonor_id;
    }

    public FundDetailsHistory getFundDetailsHistory() {
        return fundDetailsHistory;
    }

    public void setFundDetailsHistory(FundDetailsHistory fundDetailsHistory) {
        this.fundDetailsHistory = fundDetailsHistory;
    }

    
    
    
    public String toString(){
        return FundDonorName;
    } 
    
    
    
    
}
