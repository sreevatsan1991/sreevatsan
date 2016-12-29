/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.VoluntaryDonation;

import Business.Organization.VoluntaryDonation.*;
import Business.Organization.Organization;
import Business.Role.VoluntaryDonorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class VoluntaryDonorOrganization extends Organization {

    

    public VoluntaryDonorOrganization() {
        super(Organization.Type.VoluntaryDonor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VoluntaryDonorRole());
        return roles;
    }
    
}
