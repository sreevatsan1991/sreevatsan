/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BloodDonation.BloodRecipientOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.BloodRecipient.BloodRecipientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vs
 */
public class BloodRecipientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel var1, UserAccount var2, Organization var3, Enterprise var4, Network var5, EcoSystem var6) {
        return new BloodRecipientWorkAreaJPanel(var1, var2, (BloodRecipientOrganization)var3,var5,var6, var4);
    }

   
    
}
