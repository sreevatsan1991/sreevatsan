/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.BloodDetails.BloodDetailsHistory;

/**
 *
 * @author vs
 */
public class BloodRecipient extends Employee{
    private String BloodRecipientName;
    private static int count=0;
    private int BloodRecpient_id=++count;
    private BloodDetailsHistory bloodDetailsHistory;

    public BloodRecipient() {
        bloodDetailsHistory= new BloodDetailsHistory();
    }
    
    
    public String getBloodRecipientName() {
        return BloodRecipientName;
    }

    public void setBloodRecipientName(String BloodRecipientName) {
        this.BloodRecipientName = BloodRecipientName;
    }

    public int getBloodRecpient_id() {
        return BloodRecpient_id;
    }

    public void setBloodRecpient_id(int BloodRecpient_id) {
        this.BloodRecpient_id = BloodRecpient_id;
    }

    public BloodDetailsHistory getBloodDetailsHistory() {
        return bloodDetailsHistory;
    }

    public void setBloodDetailsHistory(BloodDetailsHistory bloodDetailsHistory) {
        this.bloodDetailsHistory = bloodDetailsHistory;
    }

    
    public String toString(){
        return BloodRecipientName;
    }
}
