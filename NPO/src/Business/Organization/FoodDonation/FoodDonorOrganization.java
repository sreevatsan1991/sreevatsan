/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodDonation;

import Business.Organization.FoodDonation.*;
import Business.Organization.Organization;
import Business.Role.FoodDonorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class FoodDonorOrganization extends Organization {

    

    public FoodDonorOrganization() {
        super(Organization.Type.FoodDonor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodDonorRole());
        return roles;
    }
    
}
