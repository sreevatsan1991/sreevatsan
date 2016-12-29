/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodDonation;

import Business.Organization.FoodDonation.*;
import Business.Organization.Organization;
import Business.Role.FoodRecipientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class FoodRecipientOrganization extends Organization {

    
    public FoodRecipientOrganization() {
        super(Organization.Type.FoodRecipient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodRecipientRole());
        return roles;
    }
    
}
