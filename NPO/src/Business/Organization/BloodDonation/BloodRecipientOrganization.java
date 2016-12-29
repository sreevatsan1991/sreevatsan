/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.BloodDonation;

import Business.Organization.Organization;
import Business.Role.BloodRecipientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class BloodRecipientOrganization extends Organization {

    
    public BloodRecipientOrganization() {
        super(Organization.Type.BloodRecipient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodRecipientRole());
        return roles;
    }
    
}
