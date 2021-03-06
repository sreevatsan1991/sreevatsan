/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BloodLab;

import Business.BloodDetails.BloodDetails;
import Business.Employee.BloodDonor;
import Business.Enterprise.Enterprise;
import Business.Organization.BloodDonation.BloodLabOrganization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodDistributorWorkRequest;
import Business.WorkQueue.BloodLabWorkRequest;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vs
 */
public class BloodLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private BloodDonor bloodDonor;
    private UserAccount account;
    private BloodLabOrganization labOrganization;
    private BloodLabWorkRequest lr;
    private OrganizationDirectory od;
    private Enterprise enterprise;

    /**
     * Creates new form LabTestJPanel
     */

  

    BloodLabTestJPanel(JPanel userProcessContainer, BloodLabWorkRequest lwr, UserAccount account, Enterprise enterprise) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        bloodDonor = lwr.getDonor();
        lr = lwr;
        this.account = account;
        this.enterprise=enterprise;
    }

   

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AtypeSlider = new javax.swing.JSlider();
        BtypeSlider = new javax.swing.JSlider();
        ABtypeSlider = new javax.swing.JSlider();
        OtypeSlider = new javax.swing.JSlider();
        submitJButton = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Lab Test");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 22, 226, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Blood Type");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 90, -1, -1));

        jLabel4.setText("A");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 142, -1, -1));

        jLabel5.setText("B");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 207, -1, -1));

        jLabel6.setText("AB");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 265, -1, -1));

        jLabel7.setText("O");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 328, -1, -1));

        AtypeSlider.setMajorTickSpacing(5);
        AtypeSlider.setMinorTickSpacing(1);
        AtypeSlider.setPaintLabels(true);
        AtypeSlider.setPaintTicks(true);
        AtypeSlider.setValue(0);
        add(AtypeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 127, 433, -1));

        BtypeSlider.setMajorTickSpacing(5);
        BtypeSlider.setMinorTickSpacing(1);
        BtypeSlider.setPaintLabels(true);
        BtypeSlider.setPaintTicks(true);
        BtypeSlider.setValue(0);
        add(BtypeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 190, 433, -1));

        ABtypeSlider.setMajorTickSpacing(5);
        ABtypeSlider.setMinorTickSpacing(1);
        ABtypeSlider.setPaintLabels(true);
        ABtypeSlider.setPaintTicks(true);
        ABtypeSlider.setValue(0);
        add(ABtypeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 253, 433, -1));

        OtypeSlider.setMajorTickSpacing(5);
        OtypeSlider.setMinorTickSpacing(1);
        OtypeSlider.setPaintLabels(true);
        OtypeSlider.setPaintTicks(true);
        OtypeSlider.setValue(0);
        add(OtypeSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 316, 433, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 431, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        try {
            Integer A = AtypeSlider.getValue();
            Integer B = BtypeSlider.getValue();
            Integer AB = ABtypeSlider.getValue();
            Integer O = OtypeSlider.getValue();
           

            BloodDetails bd = bloodDonor.getBloodDetailsHistory().addBloodDetails();
            bd.setBloodTypeA(A);
            bd.setBloodTypeB(B);
            bd.setBloodTypeAB(AB);
            bd.setBloodTypeO(O);
            bd.setTotalQuantity(A+B+AB+O);
            JOptionPane.showMessageDialog(null, "Lab Test done Successfully");
            BloodDistributorWorkRequest dr = new BloodDistributorWorkRequest();
            dr.setMessage("Proceed for Distribution ");
            dr.setSender(account);
            dr.setStatus("Unassigned");
            dr.setExpiryDate(new Date());
            dr.setRequestDate(new Date());
            dr.setBloodDonor(bloodDonor);
            dr.setBloodDetails(bd);
            dr.setReceiver(null);
            
            account.getWorkQueue().getWorkRequestList().add(dr);
            JOptionPane.showMessageDialog(null, "Submitted Successfully");
            //System.out.println("UserAccount"+account.getWorkQueue().getWorkRequestList().toString());
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, "Not a Number");
        }
        submitJButton.setEnabled(false);
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider ABtypeSlider;
    private javax.swing.JSlider AtypeSlider;
    private javax.swing.JSlider BtypeSlider;
    private javax.swing.JSlider OtypeSlider;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
