/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int count =1;
    protected ArrayList<Role> roles = null;
    
    public abstract ArrayList<Role> getSupportedRole();


    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = count;
        ++count;
    }

   
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
        
    public enum Type{
        
        
        
        
        BloodDonationAdmin("BloodDonationAdminOrganization"), BloodDonor("BloodDonorOrganization"), 
        BloodRecipient("BloodRecipientOrganization"),BloodLab("BloodLab Organization"), 
        BloodDistributor("BloodDistributorOrganization"),
        
        FoodDonationAdmin("FoodDonationAdminOrganization"), FoodDonor("FoodDonorOrganization"), 
        FoodRecipient("FoodRecipientOrganization"),FoodAssist("FoodAssit Organization"), 
        FoodDistributor("FoodDistributorOrganization"),
        
        FundDonationAdmin("FundDonationAdminOrganization"), FundDonor("FundDonorOrganization"), 
        FundRecipient("FundRecipientOrganization"),FundAssist("FundAssit Organization"), 
        FundDistributor("FundDistributorOrganization"),
        
        VoluntaryDonationAdmin("VoluntaryDonationAdminOrganization"), VoluntaryDonor("VoluntaryDonorOrganization"), 
        VoluntaryRecipient("VoluntaryRecipientOrganization"),VoluntaryAssist("VoluntaryAssit Organization"), 
        VoluntaryDistributor("VoluntaryDistributorOrganization");
        
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    
    
    
    
    
    
    public String toString() {
        return this.name;
    }
    
    
}
