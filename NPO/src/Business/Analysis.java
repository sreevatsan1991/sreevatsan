/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.WorkQueue.BloodLabWorkRequest;
import Business.WorkQueue.BloodRecipientWorkRequest;

/**
 *
 * @author vs
 */
public class Analysis {
       private Network network;
    private BloodRecipientWorkRequest wq1;
    private BloodLabWorkRequest wq2;
    private String monthyear;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public BloodRecipientWorkRequest getWq1() {
        return wq1;
    }

    public void setWq1(BloodRecipientWorkRequest wq1) {
        this.wq1 = wq1;
    }

    public BloodLabWorkRequest getWq2() {
        return wq2;
    }

    public void setWq2(BloodLabWorkRequest wq2) {
        this.wq2 = wq2;
    }

    public String getMonthyear() {
        return monthyear;
    }

    public void setMonthyear(String monthyear) {
        this.monthyear = monthyear;
    }
}
