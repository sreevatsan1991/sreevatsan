/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BloodDistributor;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import UserInterface.BloodAdministrativeRole.BloodDonationAdminWorkAreaJPanel;

/**
 *
 * @author Malick
 */
public class ConnectingUnitsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    /**
     * Creates new form ConnectingUnitsJPanel
     */
    public ConnectingUnitsJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtRecipientA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRecipientB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRecipientAB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRecipientO = new javax.swing.JTextField();
        enterpriseLabel = new javax.swing.JLabel();
        labEnterpriceValue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDistributorA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDistributorB = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDistributorAB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDistributorO = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        labLevelValue = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Blood type - A");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        add(txtRecipientA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 88, -1));

        jLabel5.setText("Blood type - B");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        add(txtRecipientB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 88, -1));

        jLabel6.setText("Blood type - AB");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        add(txtRecipientAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 88, -1));

        jLabel3.setText("Blood type - O");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        add(txtRecipientO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 88, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 127, 30));

        labEnterpriceValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labEnterpriceValue.setText("<value>");
        add(labEnterpriceValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 158, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Needed Units from Recipient");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setText("Blood type - A");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));
        add(txtDistributorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 88, -1));

        jLabel8.setText("Blood type - B");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));
        add(txtDistributorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 88, -1));

        jLabel9.setText("Blood type - AB");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));
        add(txtDistributorAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 88, -1));

        jLabel10.setText("Blood type - O");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));
        add(txtDistributorO, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 88, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Distributing Units to Recipients");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Distributor");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        btnSubmit.setText("Submit");
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 70, -1));

        labLevelValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labLevelValue.setText("<value>");
        add(labLevelValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, -1));

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("Level :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BloodDistributorWorkAreaJPanel dwajp = (BloodDistributorWorkAreaJPanel) component;
        //dwajp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labEnterpriceValue;
    private javax.swing.JLabel labLevelValue;
    private javax.swing.JTextField txtDistributorA;
    private javax.swing.JTextField txtDistributorAB;
    private javax.swing.JTextField txtDistributorB;
    private javax.swing.JTextField txtDistributorO;
    private javax.swing.JTextField txtRecipientA;
    private javax.swing.JTextField txtRecipientAB;
    private javax.swing.JTextField txtRecipientB;
    private javax.swing.JTextField txtRecipientO;
    // End of variables declaration//GEN-END:variables
}
