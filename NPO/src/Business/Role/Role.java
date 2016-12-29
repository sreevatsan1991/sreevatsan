/*
 * Decompiled with CFR 0_102.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.Component;
import javax.swing.JPanel;

public abstract class Role {
    public abstract JPanel createWorkArea(JPanel var1, UserAccount var2, Organization var3, Enterprise var4, Network var5, EcoSystem var6);

    public String toString() {
        return this.getClass().getName();
    }

    public Component createWorkArea(JPanel container, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, EcoSystem system) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static enum RoleType {
        CityAdmin("CityAdmin"),
        Donor("Donor"),
        Recipient("Recipient"),
        StateAdmin("StateAdmin"),
        CountryAdmin("CountryAdmin"),
        SystemAdmin("SystemAdmin"),BloodDonationAdmin("BloodDonationAdminOrganization"), BloodDonor("BloodDonorOrganization"), BloodRecipient("BloodRecipientOrganization"),
        Lab("Lab Organization"), BloodDistributor("BloodDistributorOrganization"),;
        
        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }
    }

}

