/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.VoluntaryDetails.VoluntaryDetailsHistory;

/**
 *
 * @author Malick
 */
public class VoluntaryRecipient extends Employee{
    
    
    private String VoluntaryRecipientName;
    private static int count=0;
    private int VoluntaryRecpient_id=++count;
    private VoluntaryDetailsHistory voluntaryDetailsHistory;

    public VoluntaryRecipient() {
        voluntaryDetailsHistory= new VoluntaryDetailsHistory();
    }

    public String getVoluntaryRecipientName() {
        return VoluntaryRecipientName;
    }

    public void setVoluntaryRecipientName(String VoluntaryRecipientName) {
        this.VoluntaryRecipientName = VoluntaryRecipientName;
    }

    public int getVoluntaryRecpient_id() {
        return VoluntaryRecpient_id;
    }

    public void setVoluntaryRecpient_id(int VoluntaryRecpient_id) {
        this.VoluntaryRecpient_id = VoluntaryRecpient_id;
    }

    public VoluntaryDetailsHistory getVoluntaryDetailsHistory() {
        return voluntaryDetailsHistory;
    }

    public void setVoluntaryDetailsHistory(VoluntaryDetailsHistory voluntaryDetailsHistory) {
        this.voluntaryDetailsHistory = voluntaryDetailsHistory;
    }
    
    
    
     public String toString(){
        return VoluntaryRecipientName;
    }
    
    
    
}
