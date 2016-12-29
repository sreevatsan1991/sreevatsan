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
public class VoluntaryDonor extends Employee{
    
    private String VoluntaryDonorName;
    private static int count=0;
    private int VoluntaryDonor_id=++count;
    private VoluntaryDetailsHistory voluntaryDetailsHistory; 
    //private EmployeeDirectory employeeDirectory;

    public VoluntaryDonor() {
       voluntaryDetailsHistory = new VoluntaryDetailsHistory();
    }

    public String getVoluntaryDonorName() {
        return VoluntaryDonorName;
    }

    public void setVoluntaryDonorName(String VoluntaryDonorName) {
        this.VoluntaryDonorName = VoluntaryDonorName;
    }

    public int getVoluntaryDonor_id() {
        return VoluntaryDonor_id;
    }

    public void setVoluntaryDonor_id(int VoluntaryDonor_id) {
        this.VoluntaryDonor_id = VoluntaryDonor_id;
    }

    public VoluntaryDetailsHistory getVoluntaryDetailsHistory() {
        return voluntaryDetailsHistory;
    }

    public void setVoluntaryDetailsHistory(VoluntaryDetailsHistory voluntaryDetailsHistory) {
        this.voluntaryDetailsHistory = voluntaryDetailsHistory;
    }
    
    
    
    public String toString(){
        return VoluntaryDonorName;
    } 
    
    
    
}
