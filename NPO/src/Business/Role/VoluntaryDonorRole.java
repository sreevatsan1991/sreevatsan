/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.Role.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.VoluntaryDonation.VoluntaryDonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.VoluntaryDonor.VoluntaryDonorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author vs
 */
public class VoluntaryDonorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel var1, UserAccount var2, Organization var3, Enterprise var4, Network var5, EcoSystem var6) {
        return new VoluntaryDonorWorkAreaJPanel(var1, var2, (VoluntaryDonorOrganization)var3, var4, var5);
    }

   
    
}
