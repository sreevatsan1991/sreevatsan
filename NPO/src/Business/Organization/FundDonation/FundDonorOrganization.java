/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.FundDonation;

import Business.Organization.FundDonation.*;
import Business.Organization.Organization;
import Business.Role.FundDonorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class FundDonorOrganization extends Organization {

    

    public FundDonorOrganization() {
        super(Organization.Type.FundDonor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundDonorRole());
        return roles;
    }
    
}
