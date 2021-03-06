/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodRecipient;

import UserInterface.FoodRecipient.*;
import Business.EcoSystem;
import Business.Employee.FoodRecipient;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodDonation.FoodRecipientOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRecipientWorkRequest;
import Business.WorkQueue.FoodDistributorWorkRequest;
import Business.WorkQueue.FoodAssistWorkRequest;
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
public class FoodRecipientWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private FoodRecipientOrganization organization;
    private Network network;
    private OrganizationDirectory od; 
    private FoodRecipient foodRecipient;
    /**
     * Creates new form RecipientWorkAreaJPanel
     */

   

    public FoodRecipientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FoodRecipientOrganization organization, Network network, EcoSystem var6, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        this.network = network;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
        refreshRecipientTable();
    
    }

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tableRecipientCollector.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[8];
            row[0] = request.getRequestDate();
            Integer F1 = ((FoodDistributorWorkRequest) request).getFoodDetails().getFoodPerishableType();
            Integer F2 = ((FoodDistributorWorkRequest) request).getFoodDetails().getFoodPreservedType();
            Integer F3 = ((FoodDistributorWorkRequest) request).getFoodDetails().getFoodFruitsType();
            Integer q = ((FoodDistributorWorkRequest) request).getFoodDetails().getTotalQuantity();
//            Integer q = ((FoodDistributorWorkRequest) request).getFoodDetails().getQuantity();
            row[1] = request.getMessage();
            row[2] = request.getStatus();
            String result = ((FoodDistributorWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
           
            
            model.addRow(row);
        }
    }
 public void refreshRecipientTable(){
        int rowcount = recTable.getRowCount();
        DefaultTableModel model =   (DefaultTableModel) recTable.getModel();
        /*for(int i = rowcount-1;i>=0;i--)
        {
            model.removeRow(i);
        }*/
         for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(Organization.Type.FoodRecipient.getValue().equals(org.getName())){
                 for(FoodRecipient bd:org.getEmployeeDirectory().getFoodRecipientList()){
                    {
                       Object row[]=new Object[1];
                        row[0]=bd;
                        model.addRow(row);     
              }}
        }
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecipientCollector = new javax.swing.JTable();
        btnAraiseRequest = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recTable = new javax.swing.JTable();
        addRecBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 127, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 158, 26));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Recipient Collector Request Table");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        tableRecipientCollector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Needed Quantity", "Perishable", "Preserved", "Fruits", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRecipientCollector);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 550, 97));

        btnAraiseRequest.setText("Raise Request");
        btnAraiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAraiseRequestActionPerformed(evt);
            }
        });
        add(btnAraiseRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Recipient Collector");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        recTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recipient Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(recTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, 90));

        addRecBtn.setText("Add Recipient");
        addRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecBtnActionPerformed(evt);
            }
        });
        add(addRecBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
    populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAraiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAraiseRequestActionPerformed
      
         int SelectedRow=recTable.getSelectedRow();
        if(SelectedRow>=0)
        {
            FoodRecipient e2 =(FoodRecipient) recTable.getValueAt(SelectedRow,0);
        AraisingRequestDistributorJPanel awrrcjp = new AraisingRequestDistributorJPanel(userProcessContainer,organization,od,e2,account, enterprise);
        userProcessContainer.add("awrrcjp", awrrcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnAraiseRequestActionPerformed

    private void addRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecBtnActionPerformed
        // TODO add your handling code here:
        AddFoodRecipientJPanel don = new AddFoodRecipientJPanel(userProcessContainer,od,enterprise,account);
        userProcessContainer.add("AddFoodRecipient",don);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addRecBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRecBtn;
    private javax.swing.JButton btnAraiseRequest;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable recTable;
    private javax.swing.JTable tableRecipientCollector;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
