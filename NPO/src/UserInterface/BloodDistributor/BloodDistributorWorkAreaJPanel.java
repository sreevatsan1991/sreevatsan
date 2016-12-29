/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BloodDistributor;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodDistributorWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JPanel;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Malick
 */
public class BloodDistributorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    private Enterprise enterprise;
    private OrganizationDirectory od;
    private ArrayList<BloodDistributorWorkRequest> bwrList;
    private ArrayList<BloodDistributorWorkRequest> rbwrList;
    /**
     * Creates new form CityDistributorWorkAreaJPanel
     */


    public BloodDistributorWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,Enterprise enterprise,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        this.enterprise = enterprise;
         bwrList = new ArrayList<>();
          rbwrList= new ArrayList<>();
        //if(enterprise.getEnterpriseType().toString()==Enterprise.EnterpriseType.NPOBLOOD.getValue()){
        od=enterprise.getOrganizationDirectory();
        this.account = account;
        labEnterpriseValue.setText(enterprise.getName());
        populateDonorTable();
        populateRecipientTable();
        populateRecCB();
          populateRequired();
         
        }
     public void populateRecCB(){
        //recCB.removeAllItems();
        //recCB.setSelectedIndex(0);
        //recCB.addItem("SELECT");
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());
    
         if(org.getName().equals(Organization.Type.BloodRecipient.getValue()))   
         {
             for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
             {
                 //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                 for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
        {
            BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
            recCB.addItem(lwr.getBloodRecipient().getBloodRecipientName());
    }}}}}
    public void populatebloodTypeCB(){
        typeCB.removeAllItems();
        //typeCB.addItem("SELECT");
        typeCB.addItem("A-Type");
        typeCB.addItem("B-Type");
        typeCB.addItem("AB-Type");
        typeCB.addItem("O-Type");
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
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());
    
         if(org.getName().equals(Organization.Type.BloodRecipient.getValue()))   
         {
             for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
             {
                 //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                 for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
        {
            //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
            if(wr.getSender().equals(userAccount))
            {
            BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
            lwr.setReceiver(account);
            //System.out.println("Stat:" + lwr.getStatus());
            if(lwr.getReceiver().equals(account))
            {
            row[0] = lwr;
            row[1] = lwr.getBloodDetails().getTotalQuantity();
            row[2] = lwr.getBloodDetails().getBloodTypeA();
            row[3] = lwr.getBloodDetails().getBloodTypeB();
            row[4] = lwr.getBloodDetails().getBloodTypeAB();
            row[5] = lwr.getBloodDetails().getBloodTypeO();
            row[6] = lwr.getStatus();
            dtm.addRow(row);
            if(rbwrList==null){
                return;
            }
            rbwrList.add(lwr);
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
        
public List<BloodDistributorWorkRequest> computeList(Set<BloodDistributorWorkRequest>  bdwr)
{
    
    for (BloodDistributorWorkRequest bwr:bdwr){
        Date Ex_date=bwr.getExpiryDate();
        
   }  
    
                    Map<Date, List<BloodDistributorWorkRequest>> map = new HashMap<Date, List<BloodDistributorWorkRequest>>();

                    List<BloodDistributorWorkRequest> list=null;
for (BloodDistributorWorkRequest bwr:bdwr){
    Date key  = bwr.getRequestDate();
    if(map.containsKey(key)){
        //List<BloodDistributorWorkRequest> list = map.get(key);
        list= map.get(key);
        list.add(bwr);

    }else{
        list = new ArrayList<BloodDistributorWorkRequest>();
        list.add(bwr);
        map.put(key, list);
    }
   
}
return list;
}
        
        
        
public void populateDonorTable(){
     DefaultTableModel dtm= (DefaultTableModel) tableDonor.getModel();
        dtm.setRowCount(0);
        Object row[]=new Object[7];
        int rowCount= dtm.getRowCount();
   for(int i=0;i<rowCount;i++ ){
        dtm.removeRow(0);
   }//List<BloodDistributorWorkRequest> bwr =null;
   //Set<BloodDistributorWorkRequest> bwr = null;
  
//the change here

        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());
    
         if(org.getName().equals(Organization.Type.BloodLab.getValue()))   
         {
             for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
             {
                 //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                 for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
        {
            //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
             //System.out.println("user-->>>>"+userAccount);
             //System.out.println("sender--->>"+wr.getSender().toString());
            if(wr.getSender().equals(userAccount))
            {
               
                //To be removed
//System.out.print("STR--->>>>>>>"+wr.getSender().toString());
                BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
                //System.out.print("lwr:"+lwr.getBloodDetails());
                lwr.setReceiver(account);
                
            //System.out.println("Doc Stat:" + lwr.getStatus());
            if((lwr.getReceiver().equals(account)))
            {
                //Set<BloodDistributorWorkRequest> bwr = lwr;
            row[0] = lwr;
            row[1] = lwr.getBloodDonor();
            row[2] = lwr.getBloodDetails().getBloodTypeA();
            row[3] = lwr.getBloodDetails().getBloodTypeB();
            row[4] = lwr.getBloodDetails().getBloodTypeAB();
            row[5] = lwr.getBloodDetails().getBloodTypeO();
            row[6] = lwr.getStatus();
            dtm.addRow(row);
            if(bwrList==null){
                return;
            }
            bwrList.add(lwr);
            
            }
           /* if(lwr.getStatus()!="Resolved")
            {
                
                
                
                
                
                
            }
            */
            }
        }}
        }
        }
        //System.out.println("Wr size:"+bwr.size());
       
        //bwr.stream().collect(Collectors.groupingBy(foo -> foo.id,Collectors.summingInt(foo->foo.targetCost))).forEach((id,sumTargetCost)->System.out.println(id+"\t"+sumTargetCost));
        /*List<BloodDistributorWorkRequest> bdwr=computeList(bwr);
        if(bdwr.size()>0){
            for(BloodDistributorWorkRequest bdw: bdwr){
                System.out.println("bdw value"+bdw);
                System.out.println("A"+bdw.getBloodDetails().getBloodTypeA());
                System.out.println("A"+bdw.getBloodDetails().getBloodTypeA());
                System.out.println("A"+bdw.getBloodDetails().getBloodTypeAB());
                System.out.println("A"+bdw.getBloodDetails().getBloodTypeO());
                
            row[0] = bdw;
            row[1] = bdw.getBloodDetails().getTotalQuantity();
            row[2] = bdw.getBloodDetails().getBloodTypeA();
            row[3] = bdw.getBloodDetails().getBloodTypeB();
            row[4] = bdw.getBloodDetails().getBloodTypeAB();
            row[5] = bdw.getBloodDetails().getBloodTypeO();
            row[6] = bdw.getStatus();
            dtm.addRow(row);
            
            }
        }*/
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
        labLevelValue = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        labEnterpriseValue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRecipient = new javax.swing.JTable();
        recCB = new javax.swing.JComboBox<>();
        typeCB = new javax.swing.JComboBox<>();
        qtyCB = new javax.swing.JComboBox<>();
        Process = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        aQtyCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "donor name", "A", "B", "AB", "O", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
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
            tableDonor.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 760, 60));

        jLabel2.setText("Donor Request");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Distributor");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        labLevelValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labLevelValue.setText("<value>");
        add(labLevelValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Level :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 30));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("EnterPrise :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        labEnterpriseValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labEnterpriseValue.setText("<value>");
        add(labEnterpriseValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, -1));

        jLabel1.setText("Recipient Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        tableRecipient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "ExpiryDate", "A", "B", "AB", "O", "Required Qty", "Status"
            }
        ));
        jScrollPane2.setViewportView(tableRecipient);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 760, 80));

        recCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                recCBItemStateChanged(evt);
            }
        });
        add(recCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        typeCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeCBItemStateChanged(evt);
            }
        });
        add(typeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        qtyCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                qtyCBItemStateChanged(evt);
            }
        });
        add(qtyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));

        Process.setText("Process");
        Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessActionPerformed(evt);
            }
        });
        add(Process, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jLabel4.setText("Requirement:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 474, -1, 30));

        aQtyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(aQtyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        jLabel5.setText("Availability:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void recCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_recCBItemStateChanged
        // TODO add your handling code here:
        populatebloodTypeCB();
       qtyCB.removeAllItems();
        //qtyCB.addItem("SELECT");
       

    }//GEN-LAST:event_recCBItemStateChanged
 public void populateRequired(){
        qtyCB.removeAllItems();
         Integer sum_req_count=0;
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
           // System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

            if(org.getName().equals(Organization.Type.BloodRecipient.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                        BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
                        //System.out.println("left Side"+recCB.getSelectedItem().toString());
                        //System.out.println("rightSide"+lwr.getBloodRecipient().getBloodRecipientName().toString());
                        if(recCB.getSelectedItem().toString().equals(lwr.getBloodRecipient().getBloodRecipientName())){
                            if(typeCB.getSelectedItem()==null)
                            {
                                return;
                            }
                            else{
                            if (typeCB.getSelectedItem().toString().equals("A-Type")){
                                //System.out.println("blood qty"+typeCB.getSelectedItem().toString());
                                int a= lwr.getBloodDetails().getBloodTypeA();
                                sum_req_count=sum_req_count+a;
                                //a++;
                                //qtyCB.addItem(String.valueOf(a));
                            }
                            else if (typeCB.getSelectedItem().equals("B-Type")){
                               // qtyCB.addItem(lwr.getBloodDetails().getBloodTypeB().toString());
                                 int b= lwr.getBloodDetails().getBloodTypeB();
                                sum_req_count=sum_req_count+b;
                            }
                            else if (typeCB.getSelectedItem().equals("AB-Type")){
                                //qtyCB.addItem(lwr.getBloodDetails().getBloodTypeAB().toString());
                                 int ab= lwr.getBloodDetails().getBloodTypeAB();
                                sum_req_count=sum_req_count+ab;
                            }
                            else if(typeCB.getSelectedItem().equals("O-Type")){
                                //qtyCB.addItem(lwr.getBloodDetails().getBloodTypeO().toString());
                                 int o= lwr.getBloodDetails().getBloodTypeO();
                                sum_req_count=sum_req_count+o;
                            }}
                            

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

            if(org.getName().equals(Organization.Type.BloodLab.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                         if(wr.getSender().equals(userAccount))
            {
                        BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
                        //System.out.println("left Side"+recCB.getSelectedItem().toString());
                        //System.out.println("rightSide"+lwr.getBloodDonor().getBloodDonorName().toString());
                        //if(recCB.getSelectedItem().toString().equals(lwr.getBloodDonor().getBloodDonorName())){
                            if(typeCB.getSelectedItem()==null)
                            {
                                return;
                            }
                            else{
                            if (typeCB.getSelectedItem().toString().equals("A-Type")){
                                //System.out.println("blood qty"+typeCB.getSelectedItem().toString());
                                int a1= lwr.getBloodDetails().getBloodTypeA();
                                sum_req_count1=sum_req_count1+a1;
                               //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeA().toString());
                                //a++;
                                //qtyCB.addItem(String.valueOf(a));
                            }
                            else if (typeCB.getSelectedItem().equals("B-Type")){
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeB().toString());
                                int b1= lwr.getBloodDetails().getBloodTypeB();
                                sum_req_count1=sum_req_count1+b1;
                                
                            }
                            else if (typeCB.getSelectedItem().equals("AB-Type")){
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeAB().toString());
                                int ab1= lwr.getBloodDetails().getBloodTypeAB();
                                sum_req_count1=sum_req_count1+ab1;
                            }
                            else if(typeCB.getSelectedItem().equals("O-Type")){
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeO().toString());
                                int o1= lwr.getBloodDetails().getBloodTypeO();
                                sum_req_count1=sum_req_count1+o1;
                            }}
                            

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

    private void ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessActionPerformed
        // TODO add your handling code here:
        int requiredQty = Integer.parseInt(qtyCB.getSelectedItem().toString());
        int availableQty = Integer.parseInt(aQtyCB.getSelectedItem().toString());
        
       
        if(requiredQty==availableQty){
            for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

            if(org.getName().equals(Organization.Type.BloodLab.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                         if(wr.getSender().equals(userAccount))
                         
            {
                 
                    
                        BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
                        
                        { if(lwr.getReceiver().equals(account)){
                        if(typeCB.getSelectedItem().toString().equals("A-Type")){
                           lwr.getBloodDetails().setBloodTypeA(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                           lwr.getBloodDetails().setBloodTypeB(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                           lwr.getBloodDetails().setBloodTypeAB(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                           lwr.getBloodDetails().setBloodTypeO(0);
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

            if(org.getName().equals(Organization.Type.BloodLab.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                         if(wr.getSender().equals(userAccount))
                         {
                             
                        BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
                        
                         if((lwr.getReceiver()==null)){
                                return;
                        }
                        else if (lwr.getReceiver().equals(account)){
                        if(typeCB.getSelectedItem().toString().equals("A-Type")){
                            System.out.println(" A-Type Availability has became zero");
                            lwr.getBloodDetails().setBloodTypeA(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                           System.out.println(" B-Type Availability has became zero");
                           lwr.getBloodDetails().setBloodTypeB(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                           System.out.println(" AB-Type Availability has became zero");
                           lwr.getBloodDetails().setBloodTypeAB(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                           System.out.println(" O-Type Availability has became zero");
                           lwr.getBloodDetails().setBloodTypeO(0);
                        }
                           populateDonorTable();
                           System.out.println("Availablity Size"+ userAccount.getWorkQueue().getWorkRequestList().size());
                        }}}}}}
            for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

            if(org.getName().equals(Organization.Type.BloodRecipient.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                         if(wr.getSender().equals(userAccount))
                         
            {
                BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
               
              
                int size= rbwrList.size();
                System.out.println("Requirement Size"+userAccount.getWorkQueue().getWorkRequestList().size());
                int diff = requiredQty-availableQty;
                System.out.println("Ratio"+diff/size);
                if(diff%size==0){
                    if(typeCB.getSelectedItem().toString().equals("A-Type")){
                            System.out.println("rec A"+(diff/size));
                            lwr.getBloodDetails().setBloodTypeA(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                           System.out.println("rec B"+(diff/size));
                           lwr.getBloodDetails().setBloodTypeB(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                           System.out.println("rec AB"+(diff/size));
                            lwr.getBloodDetails().setBloodTypeAB(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                          lwr.getBloodDetails().setBloodTypeO(diff/size);
                          System.out.println("rec O"+(diff/size));
                        }
                    populateRecipientTable();
                }
                else{
                  
               //userAccount.getWorkQueue().getWorkRequestList().get(0);
                  if(typeCB.getSelectedItem().toString().equals("A-Type")){
                            System.out.println("rec A1"+((diff/size)+(diff%size)));
                            rbwrList.get(0).getBloodDetails().setBloodTypeA((diff/size)+(diff%size));
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                          System.out.println("rec B1"+((diff/size)+(diff%size)));
                           rbwrList.get(0).getBloodDetails().setBloodTypeB((diff/size)+(diff%size));
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                           System.out.println("rec AB1"+((diff/size)+(diff%size)));
                           rbwrList.get(0).getBloodDetails().setBloodTypeAB((diff/size)+(diff%size));
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                           System.out.println("rec O1"+((diff/size)+(diff%size)));
                           rbwrList.get(0).getBloodDetails().setBloodTypeO((diff/size)+(diff%size));
                        }      
                    int s= rbwrList.size();
                      for(int i=1;i<s;i++){
                          if(typeCB.getSelectedItem().toString().equals("A-Type")){
                           System.out.println("rec A2"+(diff/size)); 
                           rbwrList.get(i).getBloodDetails().setBloodTypeA(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                         System.out.println("rec B2"+(diff/size));
                           rbwrList.get(i).getBloodDetails().setBloodTypeB(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                          System.out.println("rec AB2"+(diff/size));
                          rbwrList.get(i).getBloodDetails().setBloodTypeAB(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                          System.out.println("rec O2"+(diff/size));
                           rbwrList.get(i).getBloodDetails().setBloodTypeO(diff/size);
                        }       
                          
                      }  
                    populateRecipientTable();
                }
            }
                } }}}}
         else if (availableQty>requiredQty){
        int process = availableQty-requiredQty;
            System.out.println("Remaining Blood Quantity="+process);
            
            for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

            if(org.getName().equals(Organization.Type.BloodRecipient.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                         if(wr.getSender().equals(userAccount))
                         {
                             
                        BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
                        
                         if((lwr.getReceiver()==null)){
                                return;
                        }
                        else if (lwr.getReceiver().equals(account)){
                        if(typeCB.getSelectedItem().toString().equals("A-Type")){
                            System.out.println(" A-Type Requirement has became zero");
                            lwr.getBloodDetails().setBloodTypeA(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                           System.out.println(" B-Type Requirement has became zero");
                           lwr.getBloodDetails().setBloodTypeB(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                           System.out.println(" AB-Type Requirement has became zero");
                                   lwr.getBloodDetails().setBloodTypeAB(0);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                           System.out.println(" O-Type Requirement has became zero");
                           lwr.getBloodDetails().setBloodTypeO(0);
                        }
                           populateRecipientTable();
                           System.out.println("Requirement Size"+ userAccount.getWorkQueue().getWorkRequestList().size());
                        }}}}}}
            for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

            if(org.getName().equals(Organization.Type.BloodLab.getValue()))
            {
                for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
                {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
                    {
                         if(wr.getSender().equals(userAccount))
                         
            {
                BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
               
              
                int size= bwrList.size();
                System.out.println("Available Size"+bwrList.size());
                int diff = availableQty-requiredQty;
                System.out.println("Ratio"+diff/size);
                if(diff%size==0){
                    if(typeCB.getSelectedItem().toString().equals("A-Type")){
                            System.out.println("rec A"+(diff/size));
                            lwr.getBloodDetails().setBloodTypeA(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                           System.out.println("rec B"+(diff/size));
                           lwr.getBloodDetails().setBloodTypeB(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                           System.out.println("rec AB"+(diff/size));
                            lwr.getBloodDetails().setBloodTypeAB(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                          lwr.getBloodDetails().setBloodTypeO(diff/size);
                          System.out.println("rec O"+(diff/size));
                        }
                    populateDonorTable();
                }
                else{
                  
               //userAccount.getWorkQueue().getWorkRequestList().get(0);
                  if(typeCB.getSelectedItem().toString().equals("A-Type")){
                            System.out.println("rec A1"+((diff/size)+(diff%size)));
                            bwrList.get(0).getBloodDetails().setBloodTypeA((diff/size)+(diff%size));
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                          System.out.println("rec B1"+((diff/size)+(diff%size)));
                           bwrList.get(0).getBloodDetails().setBloodTypeB((diff/size)+(diff%size));
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                           System.out.println("rec AB1"+((diff/size)+(diff%size)));
                           bwrList.get(0).getBloodDetails().setBloodTypeAB((diff/size)+(diff%size));
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                           System.out.println("rec O1"+((diff/size)+(diff%size)));
                           bwrList.get(0).getBloodDetails().setBloodTypeO((diff/size)+(diff%size));
                        }      
                    int s= bwrList.size();
                      for(int i=1;i<s;i++){
                          if(typeCB.getSelectedItem().toString().equals("A-Type")){
                           System.out.println("rec A2"+(diff/size)); 
                           bwrList.get(i).getBloodDetails().setBloodTypeA(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("B-Type")){
                         System.out.println("rec B2"+(diff/size));
                           bwrList.get(i).getBloodDetails().setBloodTypeB(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("AB-Type")){
                          System.out.println("rec AB2"+(diff/size));
                           bwrList.get(i).getBloodDetails().setBloodTypeAB(diff/size);
                        }
                       else if(typeCB.getSelectedItem().toString().equals("O-Type")){
                          System.out.println("rec O2"+(diff/size));
                           bwrList.get(i).getBloodDetails().setBloodTypeO(diff/size);
                        }       
                          
                      }  
                    populateDonorTable();
                }}}}}}
            }
         for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());
    
         if(org.getName().equals(Organization.Type.BloodRecipient.getValue()))   
         {
             for(UserAccount userAccount:org.getUserAccountDirectory().getUserAccountList())
             {
                 //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                 for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
        {
            //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
            if(wr.getSender().equals(userAccount))
            {
            BloodDistributorWorkRequest lwr = (BloodDistributorWorkRequest) wr;
            if(lwr.getBloodDetails().getBloodTypeA()==0)
            {
                if(lwr.getBloodDetails().getBloodTypeB()==0)
                {
                if(lwr.getBloodDetails().getBloodTypeAB()==0)
                {
                    if(lwr.getBloodDetails().getBloodTypeO()==0)
                {
                    lwr.setStatus("Resolved");
                }
                    lwr.setStatus("processing");
    }//GEN-LAST:event_ProcessActionPerformed
        }}}}}}}}
    private void qtyCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_qtyCBItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_qtyCBItemStateChanged

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Process;
    private javax.swing.JComboBox<String> aQtyCB;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labEnterpriseValue;
    private javax.swing.JLabel labLevelValue;
    private javax.swing.JComboBox<String> qtyCB;
    private javax.swing.JComboBox<String> recCB;
    private javax.swing.JTable tableDonor;
    private javax.swing.JTable tableRecipient;
    private javax.swing.JComboBox<String> typeCB;
    // End of variables declaration//GEN-END:variables
}
