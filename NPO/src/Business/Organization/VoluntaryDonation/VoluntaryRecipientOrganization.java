/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.VoluntaryDonation;

import Business.Organization.VoluntaryDonation.*;
import Business.Organization.Organization;
import Business.Role.VoluntaryRecipientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class VoluntaryRecipientOrganization extends Organization {

    
    public VoluntaryRecipientOrganization() {
        super(Organization.Type.VoluntaryRecipient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VoluntaryRecipientRole());
        return roles;
    }
    
}
