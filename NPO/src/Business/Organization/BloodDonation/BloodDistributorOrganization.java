/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.BloodDonation;

import Business.Organization.Organization;
import Business.Role.BloodDistributorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class BloodDistributorOrganization extends Organization {

    public BloodDistributorOrganization() {
        super(Organization.Type.BloodDistributor.getValue());
    }

    @Override
   public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodDistributorRole());
        return roles;
   }

}
