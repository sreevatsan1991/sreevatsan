/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Country.Country;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class EcoSystem extends Organization {

    private static ArrayList<Country> countryList;
    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    public void deleteNetwork(Network n) {
        networkList.remove(n);

    }
    public ArrayList<Country> getCountryList() {
        countryList = new ArrayList<>();
        loadCountry();
        return countryList;
    }

    public void setCountryList(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork(String name,String country,String state) {
        Network network = new Network(name,country,state);
        networkList.add(network);
        
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList();
    }

    public boolean checkIfUserNameIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {

        }
        return true;
    }

    private void loadCountry() {
        Country country1 = new Country("India");
        country1.getStateNames().add("TamilNadu");
        Country country2 = new Country("United States");
        country2.getStateNames().add("Mass");
        countryList.add(country1);
        countryList.add(country2);
    }

}
