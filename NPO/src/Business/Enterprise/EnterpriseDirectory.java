/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList();
    }

    //create Enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.NPOBLOOD){
        enterprise = new NPOBloodDonationEnterprise(name);
        enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.NPOFOOD){
        enterprise = new NPOFoodDonationEnterprise(name);
        enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.NPOVOLUNTARY){
        enterprise = new NPOVolunteerDonationEnterprise(name);
        enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.NPOFUND){
        enterprise = new NPOFundDonationEnterprise(name);
        enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise e) {
        enterpriseList.remove(e);

    }
    
    

}
