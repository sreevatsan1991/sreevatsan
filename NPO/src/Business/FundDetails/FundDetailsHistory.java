/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundDetails;

import java.util.ArrayList;
/**
 *
 * @author Malick
 */
public class FundDetailsHistory {
    
    
    private ArrayList<FundDetails> FundDetailsList;
    
    public FundDetailsHistory(){
        FundDetailsList = new ArrayList<FundDetails>();
    }

    public ArrayList<FundDetails> getFundDetailsList() {
        return FundDetailsList;
    }

    public void setFundDetailsList(ArrayList<FundDetails> FundDetailsList) {
        this.FundDetailsList = FundDetailsList;
    }

    
    
   
    public FundDetails addFundDetails(){
        FundDetails fundDetails = new FundDetails();
        FundDetailsList.add(fundDetails);
        return fundDetails;
    }
    
    public void deletFundDetails(FundDetails fundDetails)
    {
        FundDetailsList.remove(fundDetails);
        
    }
     @Override
    public String toString(){
        return "FundDetailsHistory";
    }
    
    
}
