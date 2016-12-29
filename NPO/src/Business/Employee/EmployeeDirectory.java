/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    private ArrayList<BloodDonor> bloodDonorList;
    private ArrayList<BloodRecipient> bloodRecipientList;
    private ArrayList<FoodDonor> foodDonorList;
    private ArrayList<FoodRecipient> foodRecipientList;
    private ArrayList<FundDonor> fundDonorList;
    private ArrayList<FundRecipient> fundRecipientList;
    private ArrayList<VoluntaryDonor> voluntaryDonorList;
    private ArrayList<VoluntaryRecipient> voluntaryRecipientList;

    
    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
        bloodDonorList = new ArrayList<>();
        bloodRecipientList= new ArrayList<>();
        foodDonorList = new ArrayList<>();
        foodRecipientList = new ArrayList<>();
        fundDonorList = new ArrayList<>();
        fundRecipientList = new ArrayList<>();
        voluntaryDonorList = new ArrayList<>();
        voluntaryRecipientList = new ArrayList<>();
        
    }
    
    
    
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    
    
    
    public ArrayList<BloodRecipient> getBloodRecipientList() {
        return bloodRecipientList;
    }

    public void setBloodRecipientList(ArrayList<BloodRecipient> bloodRecipientList) {
        this.bloodRecipientList = bloodRecipientList;
    }
    

    public ArrayList<BloodDonor> getBloodDonorList() {
        return bloodDonorList;
    }

    public void setBloodDonorList(ArrayList<BloodDonor> bloodDonorList) {
        this.bloodDonorList = bloodDonorList;
    }

    public ArrayList<FoodDonor> getFoodDonorList() {
        return foodDonorList;
    }

    public void setFoodDonorList(ArrayList<FoodDonor> foodDonorList) {
        this.foodDonorList = foodDonorList;
    }

    public ArrayList<FoodRecipient> getFoodRecipientList() {
        return foodRecipientList;
    }

    public void setFoodRecipientList(ArrayList<FoodRecipient> foodRecipientList) {
        this.foodRecipientList = foodRecipientList;
    }

    public ArrayList<FundDonor> getFundDonorList() {
        return fundDonorList;
    }

    public void setFundDonorList(ArrayList<FundDonor> fundDonorList) {
        this.fundDonorList = fundDonorList;
    }

    public ArrayList<FundRecipient> getFundRecipientList() {
        return fundRecipientList;
    }

    public void setFundRecipientList(ArrayList<FundRecipient> fundRecipientList) {
        this.fundRecipientList = fundRecipientList;
    }

    public ArrayList<VoluntaryDonor> getVoluntaryDonorList() {
        return voluntaryDonorList;
    }

    public void setVoluntaryDonorList(ArrayList<VoluntaryDonor> voluntaryDonorList) {
        this.voluntaryDonorList = voluntaryDonorList;
    }

    public ArrayList<VoluntaryRecipient> getVoluntaryRecipientList() {
        return voluntaryRecipientList;
    }

    public void setVoluntaryRecipientList(ArrayList<VoluntaryRecipient> voluntaryRecipientList) {
        this.voluntaryRecipientList = voluntaryRecipientList;
    }


    
    
    
    
    
    
    
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    
    
    
    
            
    public void deleteEmployee(Employee e) {
        employeeList.remove(e);

    }
    
    
    
}