/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.EcoSystem;
import Business.Enterprise.EnterpriseDirectory;
import com.sun.javafx.scene.EnteredExitedHandler;

/**
 *
 * @author Malick
 */
public class Network {
    
    private EcoSystem system;
    private String networkCity;
    private EnterpriseDirectory enterpriseDirectory;
    private String networkCountry;
    private String networkState;

    public String getNetworkCountry() {
        return networkCountry;
    }

    public void setNetworkCountry(String networkCountry) {
        this.networkCountry = networkCountry;
    }

    public String getNetworkState() {
        return networkState;
    }

    public void setNetworkState(String networkState) {
        this.networkState = networkState;
    }

    public Network(String name, String country, String state) {
        this.networkCity = name;
        this.networkCountry = country;
        this.networkState = state;
        enterpriseDirectory = new EnterpriseDirectory();

    }

    public String getNetworkCity() {
        return networkCity;
    }

    public void setNetworkCity(String networkCity) {
        this.networkCity = networkCity;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

   
    
    @Override
    public String toString() {
        return networkCity;
    }

}
