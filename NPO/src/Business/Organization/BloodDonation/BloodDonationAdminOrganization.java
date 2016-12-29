/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.BloodDonation;

import Business.Organization.Organization;
import Business.Role.BloodDonationAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class BloodDonationAdminOrganization extends Organization{
    public BloodDonationAdminOrganization(){
    super(Type.BloodDonationAdmin.getValue());
}
 @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodDonationAdminRole());
        return roles;
    }
     
}