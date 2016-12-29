/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Organization.BloodDonation.BloodDistributorOrganization;
import Business.Organization.BloodDonation.BloodLabOrganization;
import Business.Organization.BloodDonation.BloodRecipientOrganization;
import Business.Organization.BloodDonation.BloodDonorOrganization;
import Business.Organization.BloodDonation.BloodDonationAdminOrganization;
import Business.Organization.FoodDonation.FoodAssistOrganization;
import Business.Organization.FoodDonation.FoodDistributorOrganization;
import Business.Organization.FoodDonation.FoodDonationAdminOrganization;
import Business.Organization.FoodDonation.FoodDonorOrganization;
import Business.Organization.FoodDonation.FoodRecipientOrganization;
import Business.Organization.FundDonation.FundAssistOrganization;
import Business.Organization.FundDonation.FundDistributorOrganization;
import Business.Organization.FundDonation.FundDonationAdminOrganization;
import Business.Organization.FundDonation.FundDonorOrganization;
import Business.Organization.FundDonation.FundRecipientOrganization;
import Business.Organization.Organization.Type;
import Business.Organization.VoluntaryDonation.VoluntaryAssistOrganization;
import Business.Organization.VoluntaryDonation.VoluntaryDistributorOrganization;
import Business.Organization.VoluntaryDonation.VoluntaryDonationAdminOrganization;
import Business.Organization.VoluntaryDonation.VoluntaryDonorOrganization;
import Business.Organization.VoluntaryDonation.VoluntaryRecipientOrganization;
import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.BloodDonationAdmin.getValue())){
            organization = new BloodDonationAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FoodDonationAdmin.getValue())){
            organization = new FoodDonationAdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FundDonationAdmin.getValue())){
            organization = new FundDonationAdminOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.VoluntaryDonationAdmin.getValue())){
            organization = new VoluntaryDonationAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BloodDonor.getValue())){
            organization = new BloodDonorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BloodRecipient.getValue())){
            organization = new BloodRecipientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BloodLab.getValue())){
            organization = new BloodLabOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.BloodDistributor.getValue())){
            organization = new BloodDistributorOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.FoodDonor.getValue())){
            organization = new FoodDonorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FoodRecipient.getValue())){
            organization = new FoodRecipientOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FoodDistributor.getValue())){
            organization = new FoodDistributorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FoodAssist.getValue())){
            organization = new FoodAssistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.VoluntaryDonor.getValue())){
            organization = new VoluntaryDonorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.VoluntaryRecipient.getValue())){
            organization = new VoluntaryRecipientOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.VoluntaryDistributor.getValue())){
            organization = new VoluntaryDistributorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.VoluntaryAssist.getValue())){
            organization = new VoluntaryAssistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FundDonor.getValue())){
            organization = new FundDonorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FundRecipient.getValue())){
            organization = new FundRecipientOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FundDistributor.getValue())){
            organization = new FundDistributorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FundAssist.getValue())){
            organization = new FundAssistOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    public void removeOrganization(Organization o){
        organizationList.remove(o);
    }
}