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
public class BloodDonor extends Employee{
    private String BloodDonorName;
    private static int count=0;
    private int BloodDonor_id=++count;
    private BloodDetailsHistory bloodDetailsHistory; 
    //private EmployeeDirectory employeeDirectory;

    public BloodDonor() {
       bloodDetailsHistory = new BloodDetailsHistory();
    }

    public BloodDetailsHistory getBloodDetailsHistory() {
        return bloodDetailsHistory;
    }

    public void setBloodDetailsHistory(BloodDetailsHistory bloodDetailsHistory) {
        this.bloodDetailsHistory = bloodDetailsHistory;
    }


    public String getBloodDonorName() {
        return BloodDonorName;
    }

    public void setBloodDonorName(String BloodDonorName) {
        this.BloodDonorName = BloodDonorName;
    }

    public int getBloodDonor_id() {
        return BloodDonor_id;
    }

    public void setBloodDonor_id(int BloodDonor_id) {
        this.BloodDonor_id = BloodDonor_id;
    }

   
    public String toString(){
        return BloodDonorName;
    } 
}
