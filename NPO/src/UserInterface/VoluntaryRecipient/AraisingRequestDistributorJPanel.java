/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VoluntaryRecipient;

import UserInterface.VoluntaryRecipient.*;
import Business.VoluntaryDetails.VoluntaryDetails;
import Business.Employee.VoluntaryRecipient;
import Business.Enterprise.Enterprise;
import Business.Organization.VoluntaryDonation.VoluntaryRecipientOrganization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VoluntaryDistributorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Malick
 */
public class AraisingRequestDistributorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private VoluntaryRecipientOrganization organization;
    private OrganizationDirectory od; 
    private VoluntaryRecipient voluntaryRecipient;
    /**
     * Creates new form AraisingWorkRequestJPanel
     */
   

    AraisingRequestDistributorJPanel(JPanel userProcessContainer, VoluntaryRecipientOrganization organization, OrganizationDirectory od, VoluntaryRecipient voluntaryRecipient, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise=enterprise;
        this.organization=organization;
        this.od=od;
        this.voluntaryRecipient=voluntaryRecipient;
        this.account=account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNeeded = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtO = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmitResult = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Recipient Collector");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 127, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 158, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Requesting Volunteers:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel1.setText("Total Needed Quantity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));
        add(txtNeeded, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 88, -1));

        jLabel4.setText("Cleaning:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));
        add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 88, -1));

        jLabel5.setText("Awareness:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 88, -1));

        jLabel6.setText("Medical:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));
        add(txtAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 88, -1));

        jLabel3.setText("Planting Trees:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));
        add(txtO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 88, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 410, 80, -1));

        btnSubmitResult.setText("Submit Result");
        btnSubmitResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitResultActionPerformed(evt);
            }
        });
        add(btnSubmitResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VoluntaryRecipientWorkAreaJPanel rwajp = (VoluntaryRecipientWorkAreaJPanel) component;
        rwajp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
// TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitResultActionPerformed
 try {
            Integer totalQuantity = Integer.parseInt(txtNeeded.getText());
            Integer A = Integer.parseInt(txtA.getText());
            Integer B = Integer.parseInt(txtB.getText());
            Integer C = Integer.parseInt(txtAB.getText());
            Integer D = Integer.parseInt(txtO.getText());
           

            VoluntaryDetails vd = voluntaryRecipient.getVoluntaryDetailsHistory().addVoluntaryDetails();
            vd.setVoluntaryCleanlinessType(A);
            vd.setVoluntarySocailAwarenessType(B);
            vd.setVoluntaryMedicatingType(C);
            vd.setVoluntaryGreenPlantationType(D);
            vd.setTotalQuantity(totalQuantity);
            JOptionPane.showMessageDialog(null, "done Successfully");
            VoluntaryDistributorWorkRequest dr = new VoluntaryDistributorWorkRequest();
            dr.setMessage("Proceed for Distribution ");
            dr.setSender(account);
            dr.setStatus("Unassigned");
            dr.setRequestDate(new Date());
            dr.setVoluntaryRecipient(voluntaryRecipient);
            dr.setVoluntaryDetails(vd);
            dr.setReceiver(null);
            
            account.getWorkQueue().getWorkRequestList().add(dr);
            System.out.println("UserAccount"+account.getWorkQueue().getWorkRequestList().toString());
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, "Not a Number");
        }
        btnSubmitResult.setEnabled(false);
    }//GEN-LAST:event_btnSubmitResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmitResult;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtAB;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtNeeded;
    private javax.swing.JTextField txtO;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
