/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VoluntaryAssist;

import UserInterface.VoluntaryAssist.*;
import Business.Enterprise.Enterprise;
import Business.Organization.VoluntaryDonation.VoluntaryAssistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VoluntaryAssistWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malick
 */
public class VoluntaryAssistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private VoluntaryAssistOrganization organization; 
    private Enterprise enterprise;
   
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
   

    public VoluntaryAssistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, VoluntaryAssistOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise=enterprise;
        valueLabel.setText(enterprise.getName());
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)requestJTable.getModel();
        model.setRowCount(0);
          Object[] row = new Object[5];
       
        for(WorkRequest wr : account.getWorkQueue().getWorkRequestList()){
           if(wr.getSender().getUsername().equals("vdon1"))
            {
               VoluntaryAssistWorkRequest lwr = (VoluntaryAssistWorkRequest) wr;
              
               lwr.setReceiver(account);
          if(wr.getReceiver().equals(account)){
            row[0] = lwr;
            row[1] = lwr.getSender().getEmployee().getName();
            row[2] = lwr.getReceiver();
            row[3] = lwr.getStatus();
            row[4] = lwr.getVoluntaryDonor();
            
            
            model.addRow(row);
        }/*else if(wr.getReceiver()==null){
               
          
            row[0] = lwr;
            row[1] = lwr.getSender().getEmployee().getName();
            row[2] = lwr.getReceiver() == null ? null : wr.getReceiver().getEmployee().getName();
            row[3] = lwr.getStatus();
            row[4] = lwr.getVoluntaryDonor();
            
            
            model.addRow(row);
        }*/
        }
           else{
               return;
           }}
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
        requestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Availability", "Message", "Sender", "Assignted to", "A", "B", "AB", "O", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestJTable);
        if (requestJTable.getColumnModel().getColumnCount() > 0) {
            requestJTable.getColumnModel().getColumn(0).setResizable(false);
            requestJTable.getColumnModel().getColumn(1).setResizable(false);
            requestJTable.getColumnModel().getColumn(2).setResizable(false);
            requestJTable.getColumnModel().getColumn(3).setResizable(false);
            requestJTable.getColumnModel().getColumn(4).setResizable(false);
            requestJTable.getColumnModel().getColumn(5).setResizable(false);
            requestJTable.getColumnModel().getColumn(6).setResizable(false);
            requestJTable.getColumnModel().getColumn(7).setResizable(false);
            requestJTable.getColumnModel().getColumn(8).setResizable(false);
            requestJTable.getColumnModel().getColumn(9).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 620, 96));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 90, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 127, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 158, 26));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Assistance Request Table");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 90, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Assistance");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 100, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = requestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)requestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateTable();
        
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = requestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
for(WorkRequest wr:account.getWorkQueue().getWorkRequestList())
            {
                if(wr.getReceiver()!=null)
                {
                if(wr.getReceiver().equals(account))
                {
                VoluntaryAssistWorkRequest lr = (VoluntaryAssistWorkRequest) wr;
                
               if(lr.getMessage().equals(requestJTable.getValueAt(selectedRow, 0)));
                lr.setStatus("Processing");
                    VoluntaryAssistTestJPanel panel = new VoluntaryAssistTestJPanel(userProcessContainer,lr,account,enterprise);
                    userProcessContainer.add("VoluntaryAssistTest", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                
                
                }}}  
        
    }//GEN-LAST:event_processJButtonActionPerformed
    
    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable requestJTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
