/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FundDonation;

import Business.Organization.FundDonation.*;
import Business.Organization.Organization;
import Business.Role.FundRecipientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class FundRecipientOrganization extends Organization {

    
    public FundRecipientOrganization() {
        super(Organization.Type.FundRecipient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundRecipientRole());
        return roles;
    }
    
}
