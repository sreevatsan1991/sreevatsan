/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FoodDonation;
import Business.Organization.FoodDonation.*;
import Business.Organization.Organization;
import Business.Role.FoodAssistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class FoodAssistOrganization extends Organization {

    public FoodAssistOrganization() {
    super(Organization.Type.FoodAssist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodAssistRole());
        return roles;
    }
    
}
