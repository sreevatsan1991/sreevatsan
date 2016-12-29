/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
/**
 *
 * @author vs
 */
public abstract class Enterprise extends Organization {

   
    private EnterpriseType enterpriseType;

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public enum EnterpriseType{
        NPOBLOOD("NPOBLOOD"),
        NPOFOOD("NPOFOOD"),
        NPOVOLUNTARY("NPOVLUNTARY"),
        NPOFUND("NPOFUND");
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
       private EnterpriseType(String value){
           this.value=value;
       }
 @Override
       public String toString(){
        return value;
    }
         
    }
    
    public Enterprise(String name, EnterpriseType enterpriseType) {
        super(name);
        this.enterpriseType=enterpriseType;
        organizationDirectory= new OrganizationDirectory();
    }
   
}