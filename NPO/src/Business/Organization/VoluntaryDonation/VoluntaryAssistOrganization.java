/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.VoluntaryDonation;
import Business.Organization.VoluntaryDonation.*;
import Business.Organization.Organization;
import Business.Role.VoluntaryAssistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vs
 */
public class VoluntaryAssistOrganization extends Organization {

    public VoluntaryAssistOrganization() {
    super(Organization.Type.VoluntaryAssist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VoluntaryAssistRole());
        return roles;
    }
    
}
