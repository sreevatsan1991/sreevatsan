/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FundDistributor;

import UserInterface.FundDistributor.*;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FundDistributorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Malick
 */
public class FundDistributorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    private Enterprise enterprise;
    private OrganizationDirectory od;
     private ArrayList<FundDistributorWorkRequest> bwrList;
    private ArrayList<FundDistributorWorkRequest> rbwrList;
    /**
   
    /**
     * Creates new form CityDistributorWorkAreaJPanel
     */


    public FundDistributorWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,Enterprise enterprise,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        this.enterprise = enterprise;
         bwrList = new ArrayList<>();
          rbwrList= new ArrayList<>();
        //if(enterprise.getEnterpriseType().toString()==Enterprise.EnterpriseType.NPOFUND.getValue()){
        od=enterprise.getOrganizationDirectory();
        this.account = account;
        entValue.setText(enterprise.getName());
        populateDonorTable();
        populateRecipientTable();
        populateRecCB();
        }
         public void populateRecCB(){
        //recCB.removeAllItems();
        //recCB.setSelectedIndex(0);
        //recCB.addItem("SELECT");
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.FundRecipient.getValue());
    
         if(org.getName().equals(Organization.Type.FundRecipient.getValue()))   
         {
             for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
             {
                 System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                 for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
        {
            FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;
            recCB.addItem(lwr.getFundRecipient().getFundRecipientName());
    }}}}}
     public void populateFundTypeCB(){
        typeCB.removeAllItems();
        //typeCB.addItem("SELECT");
        typeCB.addItem("fundEducationType");
        typeCB.addItem("fundRuralDevelopmentType");
        typeCB.addItem("fundMedicalTreatmentType");
     }
        public void populateRecipientTable(){
        DefaultTableModel dtm= (DefaultTableModel) tableRecipient.getModel();
        dtm.setRowCount(0);
        Object row[]=new Object[7];
        int rowCount= dtm.getRowCount();

  // System.out.println(rowCount);

   for(int i=0;i<rowCount;i++ ){
        dtm.removeRow(0);
        //System.out.println(i);
   }
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.FundRecipient.getValue());
    
         if(org.getName().equals(Organization.Type.FundRecipient.getValue()))   
         {
             for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
             {
                 System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                 for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
        {
            System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
            if(wr.getSender().equals(userAccount))
            {
            FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;
            System.out.println("Stat:" + lwr.getStatus());
            if((lwr.getReceiver()==null || lwr.getReceiver().equals(account)))
            {
            row[0] = lwr;
            row[1] = lwr.getFundDetails().getTotalQuantity();
            row[2] = lwr.getFundDetails().getFundEducationType();
            row[3] = lwr.getFundDetails().getFundMedicalTreatmentType();
            row[4] = lwr.getFundDetails().getFundRuralDevelopmentType();
        //    row[5] = lwr.getFundDetails().getFundTypeO();
            row[5] = lwr.getStatus();
            rbwrList.add(lwr);
            dtm.addRow(row);
            }
            }
        }}
        }
        }
        /*TableRowSorter sorter = new TableRowSorter(dtm);
        tableDonor.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        int columnIndexToSort = 3;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.sort();*/
}
public void populateDonorTable(){
     DefaultTableModel dtm= (DefaultTableModel) tableDonor.getModel();
        dtm.setRowCount(0);
        Object row[]=new Object[7];
        int rowCount= dtm.getRowCount();
   for(int i=0;i<rowCount;i++ ){
        dtm.removeRow(0);
   }
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.FundAssist.getValue());
    
         if(org.getName().equals(Organization.Type.FundAssist.getValue()))   
         {
             for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
             {
                 //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                 for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
        {
            //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
            if(wr.getSender().equals(userAccount))
            {
            FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;
            lwr.setReceiver(account);
            //System.out.println("Doc Stat:" + lwr.getStatus());
            if((lwr.getReceiver()==null || lwr.getReceiver().equals(account)))
            {
            row[0] = lwr;
            row[1] = lwr.getFundDetails().getTotalQuantity();
            row[2] = lwr.getFundDetails().getFundEducationType();
            row[3] = lwr.getFundDetails().getFundMedicalTreatmentType();
            row[4] = lwr.getFundDetails().getFundRuralDevelopmentType();
//            row[5] = lwr.getFundDetails().getFundTypeO();
            row[5] = lwr.getStatus();
            bwrList.add(lwr);
            dtm.addRow(row);
            }
            }
        }}
        }
        }
        TableRowSorter sorter = new TableRowSorter(dtm);
        tableDonor.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        int columnIndexToSort = 3;
        sortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
        sorter.sort();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDonor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRecipient = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDonor1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        enterpriseLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableRecipient1 = new javax.swing.JTable();
        recCB = new javax.swing.JComboBox<>();
        typeCB = new javax.swing.JComboBox<>();
        qtyCB = new javax.swing.JComboBox<>();
        Process = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        aQtyCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        entValue = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Availability", "Education", "Rural Dev", "Medical", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDonor);
        if (tableDonor.getColumnModel().getColumnCount() > 0) {
            tableDonor.getColumnModel().getColumn(0).setResizable(false);
            tableDonor.getColumnModel().getColumn(1).setResizable(false);
            tableDonor.getColumnModel().getColumn(2).setResizable(false);
            tableDonor.getColumnModel().getColumn(3).setResizable(false);
            tableDonor.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 760, 60));

        jLabel2.setText("Donor Request");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Distributor");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("EnterPrise :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        jLabel1.setText("Recipient Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        tableRecipient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "Required Qty", "Education", "Rural Dev", "Medical", "Status"
            }
        ));
        jScrollPane2.setViewportView(tableRecipient);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 760, 80));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonor1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Availability", "A", "B", "AB", "O", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableDonor1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 760, 60));

        jLabel4.setText("Donor Request");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Distributor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        enterpriseLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel3.setText("EnterPrise :");
        jPanel1.add(enterpriseLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        jLabel6.setText("Recipient Request");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        tableRecipient1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "ExpiryDate", "A", "B", "AB", "O", "Required Qty", "Status"
            }
        ));
        jScrollPane4.setViewportView(tableRecipient1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 760, 80));

        recCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                recCBItemStateChanged(evt);
            }
        });
        jPanel1.add(recCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        typeCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeCBItemStateChanged(evt);
            }
        });
        jPanel1.add(typeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        qtyCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                qtyCBItemStateChanged(evt);
            }
        });
        jPanel1.add(qtyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, -1, -1));

        Process.setText("Process");
        Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessActionPerformed(evt);
            }
        });
        jPanel1.add(Process, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, -1, -1));

        jLabel7.setText("Requirement:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, 40));

        aQtyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(aQtyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        jLabel8.setText("Availability:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, 20));

        entValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entValueActionPerformed(evt);
            }
        });
        jPanel1.add(entValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 80, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void recCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_recCBItemStateChanged
        // TODO add your handling code here:
        populateFundTypeCB();
        qtyCB.removeAllItems();
        //qtyCB.addItem("SELECT");

    }//GEN-LAST:event_recCBItemStateChanged
 public void populateRequired(){
        qtyCB.removeAllItems();
         Integer sum_req_count=0;
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
           // System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

            if(org.getName().equals(Organization.Type.FundRecipient.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                        FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;
                        //System.out.println("left Side"+recCB.getSelectedItem().toString());
                        //System.out.println("rightSide"+lwr.getBloodRecipient().getBloodRecipientName().toString());
                        if(recCB.getSelectedItem().toString().equals(lwr.getFundRecipient().getFundRecipientName())){
                            if(typeCB.getSelectedItem()==null)
                            {
                                return;
                            }
                            else{
                            if (typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                //System.out.println("blood qty"+typeCB.getSelectedItem().toString());
                                int a= lwr.getFundDetails().getFundEducationType();
                                sum_req_count=sum_req_count+a;
                                //a++;
                                //qtyCB.addItem(String.valueOf(a));
                            }
                            else if (typeCB.getSelectedItem().equals("fundRuralDevelopmentType")){
                               // qtyCB.addItem(lwr.getBloodDetails().getBloodTypeB().toString());
                                 int b= lwr.getFundDetails().getFundRuralDevelopmentType();
                                sum_req_count=sum_req_count+b;
                            }
                            else if (typeCB.getSelectedItem().equals("fundMedicalTreatmentType")){
                                //qtyCB.addItem(lwr.getBloodDetails().getBloodTypeAB().toString());
                                 int ab= lwr.getFundDetails().getFundMedicalTreatmentType();
                                sum_req_count=sum_req_count+ab;
                            }
                          }
                            

                        }}}}}
                        if(sum_req_count>0){qtyCB.addItem(String.valueOf(sum_req_count));
                        }
                        
        }
 public void populateAvailable(){
      aQtyCB.removeAllItems();
         Integer sum_req_count1=0;
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

            if(org.getName().equals(Organization.Type.FundAssist.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                         if(wr.getSender().equals(userAccount))
            {
                        FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;
                        //System.out.println("left Side"+recCB.getSelectedItem().toString());
                        //System.out.println("rightSide"+lwr.getBloodDonor().getBloodDonorName().toString());
                        //if(recCB.getSelectedItem().toString().equals(lwr.getBloodDonor().getBloodDonorName())){
                            if(typeCB.getSelectedItem()==null)
                            {
                                return;
                            }
                            else{
                            if (typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                //System.out.println("blood qty"+typeCB.getSelectedItem().toString());
                                int a1= lwr.getFundDetails().getFundEducationType();
                                sum_req_count1=sum_req_count1+a1;
                               //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeA().toString());
                                //a++;
                                //qtyCB.addItem(String.valueOf(a));
                            }
                            else if (typeCB.getSelectedItem().equals("fundRuralDevelopmentType")){
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeB().toString());
                                int b1= lwr.getFundDetails().getFundRuralDevelopmentType();
                                sum_req_count1=sum_req_count1+b1;
                                
                            }
                            else if (typeCB.getSelectedItem().equals("fundMedicalTreatmentType")){
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeAB().toString());
                                int ab1= lwr.getFundDetails().getFundMedicalTreatmentType();
                                sum_req_count1=sum_req_count1+ab1;
                            }
                          }
                            

                        }}}}}
    //}
                        if(sum_req_count1>0){aQtyCB.addItem(String.valueOf(sum_req_count1));
                        }
 }
    private void typeCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeCBItemStateChanged
        // TODO add your handling code here:

        populateRequired();

        populateAvailable();

    }//GEN-LAST:event_typeCBItemStateChanged

    private void qtyCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_qtyCBItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_qtyCBItemStateChanged

    private void ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessActionPerformed
        // TODO add your handling code here:
        int requiredQty = Integer.parseInt(qtyCB.getSelectedItem().toString());
        int availableQty = Integer.parseInt(aQtyCB.getSelectedItem().toString());

        if(requiredQty==availableQty){
            for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
            {
                //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

                if(org.getName().equals(Organization.Type.FundAssist.getValue()))
                {
                    for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                    {
                        //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                        for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                        {
                            if(wr.getSender().equals(userAccount))

                            {

                                FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;

                                { if(lwr.getReceiver().equals(account)){
                                    if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                        lwr.getFundDetails().setFundEducationType(0);
                                    }
                                    else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                        lwr.getFundDetails().setFundRuralDevelopmentType(0);
                                    }
                                    else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                        lwr.getFundDetails().setFundMedicalTreatmentType(0);
                                    }
                                   
                                    populateDonorTable();
                                }

                            }}}}}}}
                            else if (requiredQty>availableQty){
                                int process = requiredQty-availableQty;
                                //System.out.println("Delivered Blood Quantity="+process);

                                for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
                                {
                                    //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

                                    if(org.getName().equals(Organization.Type.FundAssist.getValue()))
                                    {
                                        for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                                        {
                                            //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                                            for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                                            {
                                                if(wr.getSender().equals(userAccount))
                                                {

                                                    FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;

                                                    if((lwr.getReceiver()==null)){
                                                        return;
                                                    }
                                                    else if (lwr.getReceiver().equals(account)){
                                                        if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                                            System.out.println(" A-Type Availability has became zero");
                                                            lwr.getFundDetails().setFundEducationType(0);
                                                        }
                                                        else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                                            lwr.getFundDetails().setFundRuralDevelopmentType(0);
                                                        }
                                                        else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                                            lwr.getFundDetails().setFundMedicalTreatmentType(0);
                                                        }
                                                       
                                                        populateDonorTable();
                                                        System.out.println("Availablity Size"+ userAccount.getWorkQueue().getWorkRequestList().size());
                                                    }}}}}}
                                                    for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
                                                    {
                                                        //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

                                                        if(org.getName().equals(Organization.Type.FundRecipient.getValue()))
                                                        {
                                                            for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                                                            {
                                                                //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                                                                for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                                                                {
                                                                    if(wr.getSender().equals(userAccount))

                                                                    {
                                                                        FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;

                                                                        int size= userAccount.getWorkQueue().getWorkRequestList().size();
                                                                        System.out.println("Requirement Size"+userAccount.getWorkQueue().getWorkRequestList().size());
                                                                        int diff = requiredQty-availableQty;
                                                                        System.out.println("Ratio"+diff/size);
                                                                        if(diff%size==0){
                                                                            if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                                                                System.out.println("rec A"+(diff/size));
                                                                                lwr.getFundDetails().setFundEducationType(diff/size);
                                                                            }
                                                                            else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                                                                System.out.println("rec B"+(diff/size));
                                                                                lwr.getFundDetails().setFundRuralDevelopmentType(diff/size);
                                                                            }
                                                                            else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                                                                //System.out.println("rec AB"+(diff/size));
                                                                                lwr.getFundDetails().setFundMedicalTreatmentType(diff/size);
                                                                            }
                                                                          
                                                                            populateDonorTable();
                                                                        }
                                                                        else{

                                                                            //userAccount.getWorkQueue().getWorkRequestList().get(0);
                                                                            if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                                                                //System.out.println("rec A1"+((diff/size)+(diff%size)));
                                                                                rbwrList.get(0).getFundDetails().setFundEducationType((diff/size)+(diff%size));
                                                                            }
                                                                            else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                                                                //System.out.println("rec B1"+((diff/size)+(diff%size)));
                                                                                rbwrList.get(0).getFundDetails().setFundRuralDevelopmentType((diff/size)+(diff%size));
                                                                            }
                                                                            else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                                                                //System.out.println("rec AB1"+((diff/size)+(diff%size)));
                                                                                rbwrList.get(0).getFundDetails().setFundMedicalTreatmentType((diff/size)+(diff%size));
                                                                            }
                                                                           
                                                                            int s= rbwrList.size();
                                                                            for(int i=1;i<s;i++){
                                                                                if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                                                                    //System.out.println("rec A2"+(diff/size));
                                                                                    rbwrList.get(i).getFundDetails().setFundEducationType(diff/size);
                                                                                }
                                                                                else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                                                                    //System.out.println("rec B2"+(diff/size));
                                                                                    rbwrList.get(i).getFundDetails().setFundRuralDevelopmentType(diff/size);
                                                                                }
                                                                                else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                                                                    //System.out.println("rec AB2"+(diff/size));
                                                                                    rbwrList.get(i).getFundDetails().setFundMedicalTreatmentType(diff/size);
                                                                                }
                                                                               

                                                                            }
                                                                            populateRecipientTable();
                                                                        }
                                                                    }
                                                                } }}}}
                                                                else if (availableQty>requiredQty){
                                                                    int process = availableQty-requiredQty;
                                                                    System.out.println("Remaining Fund Quantity="+process);

                                                                    for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
                                                                    {
                                                                        //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

                                                                        if(org.getName().equals(Organization.Type.FundRecipient.getValue()))
                                                                        {
                                                                            for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                                                                            {
                                                                                //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                                                                                for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                                                                                {
                                                                                    if(wr.getSender().equals(userAccount))
                                                                                    {

                                                                                        FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;

                                                                                        if((lwr.getReceiver()==null)){
                                                                                            return;
                                                                                        }
                                                                                        else if (lwr.getReceiver().equals(account)){
                                                                                            if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                                                                                System.out.println(" A-Type Requirement has became zero");
                                                                                                lwr.getFundDetails().setFundEducationType(0);
                                                                                            }
                                                                                            else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                                                                                lwr.getFundDetails().setFundRuralDevelopmentType(0);
                                                                                            }
                                                                                            else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                                                                                lwr.getFundDetails().setFundMedicalTreatmentType(0);
                                                                                            }
                                                                                            
                                                                                            populateRecipientTable();
                                                                                            System.out.println("Requirement Size"+ userAccount.getWorkQueue().getWorkRequestList().size());
                                                                                        }}}}}}
                                                                                        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
                                                                                        {
                                                                                            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

                                                                                            if(org.getName().equals(Organization.Type.FundAssist.getValue()))
                                                                                            {
                                                                                                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                                                                                                {
                                                                                                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                                                                                                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                                                                                                    {
                                                                                                        if(wr.getSender().equals(userAccount))

                                                                                                        {
                                                                                                            FundDistributorWorkRequest lwr = (FundDistributorWorkRequest) wr;

                                                                                                            int size= bwrList.size();
                                                                                                            System.out.println("Available Size"+bwrList.size());
                                                                                                            int diff = availableQty-requiredQty;
                                                                                                            System.out.println("Ratio"+diff/size);
                                                                                                            if(diff%size==0){
                                                                                                                if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                                                                                                    //System.out.println("rec A"+(diff/size));
                                                                                                                    lwr.getFundDetails().setFundEducationType(diff/size);
                                                                                                                }
                                                                                                                else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                                                                                                   // System.out.println("rec B"+(diff/size));
                                                                                                                    lwr.getFundDetails().setFundRuralDevelopmentType(diff/size);
                                                                                                                }
                                                                                                                else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                                                                                                    System.out.println("rec AB"+(diff/size));
                                                                                                                    lwr.getFundDetails().setFundMedicalTreatmentType(diff/size);
                                                                                                                }
                                                                                                               
                                                                                                                populateDonorTable();
                                                                                                            }
                                                                                                            else{

                                                                                                                //userAccount.getWorkQueue().getWorkRequestList().get(0);
                                                                                                                if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                                                                                                   // System.out.println("rec A1"+((diff/size)+(diff%size)));
                                                                                                                    bwrList.get(0).getFundDetails().setFundEducationType((diff/size)+(diff%size));
                                                                                                                }
                                                                                                                else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                                                                                                    System.out.println("rec B1"+((diff/size)+(diff%size)));
                                                                                                                    bwrList.get(0).getFundDetails().setFundRuralDevelopmentType((diff/size)+(diff%size));
                                                                                                                }
                                                                                                                else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                                                                                                    System.out.println("rec AB1"+((diff/size)+(diff%size)));
                                                                                                                    bwrList.get(0).getFundDetails().setFundMedicalTreatmentType((diff/size)+(diff%size));
                                                                                                                }
                                                                                                               
                                                                                                                int s= bwrList.size();
                                                                                                                for(int i=1;i<s;i++){
                                                                                                                    if(typeCB.getSelectedItem().toString().equals("fundEducationType")){
                                                                                                                        //System.out.println("rec A2"+(diff/size));
                                                                                                                        bwrList.get(i).getFundDetails().setFundEducationType(diff/size);
                                                                                                                    }
                                                                                                                    else if(typeCB.getSelectedItem().toString().equals("fundRuralDevelopmentType")){
                                                                                                                        //System.out.println("rec B2"+(diff/size));
                                                                                                                        bwrList.get(i).getFundDetails().setFundRuralDevelopmentType(diff/size);
                                                                                                                    }
                                                                                                                    else if(typeCB.getSelectedItem().toString().equals("fundMedicalTreatmentType")){
                                                                                                                        //System.out.println("rec AB2"+(diff/size));
                                                                                                                        bwrList.get(i).getFundDetails().setFundMedicalTreatmentType(diff/size);
                                                                                                                    }
                                                                                                                    

                                                                                                                }
                                                                                                                populateDonorTable();
                                                                                                            }}}}}}
                                                                                                        }
    }//GEN-LAST:event_ProcessActionPerformed

    private void entValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entValueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Process;
    private javax.swing.JComboBox<String> aQtyCB;
    private javax.swing.JTextField entValue;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> qtyCB;
    private javax.swing.JComboBox<String> recCB;
    private javax.swing.JTable tableDonor;
    private javax.swing.JTable tableDonor1;
    private javax.swing.JTable tableRecipient;
    private javax.swing.JTable tableRecipient1;
    private javax.swing.JComboBox<String> typeCB;
    // End of variables declaration//GEN-END:variables
}
