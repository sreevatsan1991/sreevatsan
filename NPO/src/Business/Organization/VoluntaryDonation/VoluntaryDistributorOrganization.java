/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.VoluntaryDonation;

import Business.Organization.VoluntaryDonation.*;
import Business.Organization.Organization;
import Business.Role.VoluntaryDistributorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class VoluntaryDistributorOrganization extends Organization {

    public VoluntaryDistributorOrganization() {
        super(Organization.Type.VoluntaryDistributor.getValue());
    }

    @Override
   public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new VoluntaryDistributorRole());
        return roles;
   }

}
