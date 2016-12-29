/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VoluntaryDistributor;

import UserInterface.VoluntaryDistributor.*;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VoluntaryDistributorWorkRequest;
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
public class VolunteerDistributorWorkAreaJPanel extends javax.swing.JPanel {

    private ArrayList<VoluntaryDistributorWorkRequest> bwrList;
    private ArrayList<VoluntaryDistributorWorkRequest> rbwrList;
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    private Enterprise enterprise;
    private OrganizationDirectory od;

    /**
     * Creates new form CityDistributorWorkAreaJPanel
     */
    public VolunteerDistributorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        this.enterprise = enterprise;
        bwrList = new ArrayList<>();
        rbwrList = new ArrayList<>();
        //if(enterprise.getEnterpriseType().toString()==Enterprise.EnterpriseType.NPOVOLUNTARY.getValue()){
        od = enterprise.getOrganizationDirectory();
        this.account = account;
        labEnterpriseValue.setText(enterprise.getName());
        populateDonorTable();
        populateRecipientTable();
        populateRecCB();
    }

    public void populateRecCB() {
        //recCB.removeAllItems();
        //recCB.setSelectedIndex(0);
        //recCB.addItem("SELECT");
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.VoluntaryRecipient.getValue());

            if (org.getName().equals(Organization.Type.VoluntaryRecipient.getValue())) {
                for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                        VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;
                        recCB.addItem(lwr.getVoluntaryRecipient().getVoluntaryRecipientName());
                    }
                }
            }
        }
    }

    public void populateVolunteerTypeCB() {
        typeCB.removeAllItems();
        typeCB.addItem("voluntaryCleanlinessType");
        typeCB.addItem("voluntarySocailAwarenessType");
        typeCB.addItem("voluntaryMedicatingType");
        typeCB.addItem("voluntaryGreenPlantationType");

    }

    public void populateRecipientTable() {
        DefaultTableModel dtm = (DefaultTableModel) tableRecipient.getModel();
        dtm.setRowCount(0);
        Object row[] = new Object[7];
        int rowCount = dtm.getRowCount();

        // System.out.println(rowCount);
        for (int i = 0; i < rowCount; i++) {
            dtm.removeRow(0);
            //System.out.println(i);
        }

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.VoluntaryRecipient.getValue());

            if (org.getName().equals(Organization.Type.VoluntaryRecipient.getValue())) {
                for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                        // System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                        if (wr.getSender().equals(userAccount)) {
                            VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;
                            // System.out.println("Stat:" + lwr.getStatus());
                            if ((lwr.getReceiver() == null || lwr.getReceiver().equals(account))) {
                                row[0] = lwr;
                                row[1] = lwr.getVoluntaryDetails().getTotalQuantity();
                                row[2] = lwr.getVoluntaryDetails().getVoluntaryCleanlinessType();
                                row[3] = lwr.getVoluntaryDetails().getVoluntarySocailAwarenessType();
                                row[4] = lwr.getVoluntaryDetails().getVoluntaryMedicatingType();
                                row[5] = lwr.getVoluntaryDetails().getVoluntaryGreenPlantationType();
                                row[6] = lwr.getStatus();
                                dtm.addRow(row);
                                if(rbwrList==null){
                return;
            }
            rbwrList.add(lwr);
                            }
                        }
                    }
                }
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

    public void populateDonorTable() {
        DefaultTableModel dtm = (DefaultTableModel) tableDonor.getModel();
        dtm.setRowCount(0);
        Object row[] = new Object[7];
        int rowCount = dtm.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            dtm.removeRow(0);
        }

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.VoluntaryAssist.getValue());

            if (org.getName().equals(Organization.Type.VoluntaryAssist.getValue())) {
                for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                        //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                        if (wr.getSender().equals(userAccount)) {
                            VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;
                            lwr.setReceiver(account);
                            //System.out.println("Doc Stat:" + lwr.getStatus());
                            if ((lwr.getReceiver() == null || lwr.getReceiver().equals(account))) {
                                row[0] = lwr;
                                row[1] = lwr.getVoluntaryDetails().getTotalQuantity();
                                row[2] = lwr.getVoluntaryDetails().getVoluntaryCleanlinessType();
                                row[3] = lwr.getVoluntaryDetails().getVoluntarySocailAwarenessType();
                                row[4] = lwr.getVoluntaryDetails().getVoluntaryMedicatingType();
                                row[5] = lwr.getVoluntaryDetails().getVoluntaryGreenPlantationType();
                                row[6] = lwr.getStatus();
                                dtm.addRow(row);
                                if(bwrList==null){
                return;
            }
            bwrList.add(lwr);
                            }
                        }
                    }
                }
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
        labEnterpriseValue = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableDonor2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labLevelValue2 = new javax.swing.JLabel();
        enterpriseLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableRecipient2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableDonor3 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        enterpriseLabel7 = new javax.swing.JLabel();
        labEnterpriseValue3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableRecipient3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tableDonor4 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        labLevelValue4 = new javax.swing.JLabel();
        enterpriseLabel8 = new javax.swing.JLabel();
        enterpriseLabel9 = new javax.swing.JLabel();
        labEnterpriseValue4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tableRecipient4 = new javax.swing.JTable();
        recCB = new javax.swing.JComboBox<>();
        typeCB = new javax.swing.JComboBox<>();
        qtyCB = new javax.swing.JComboBox<>();
        Process = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        aQtyCB = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Availability", "Cleaning", "Awareness", "Medical", "Planting", "Status"
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

        enterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel1.setText("EnterPrise :");
        add(enterpriseLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        labEnterpriseValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(labEnterpriseValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, -1));

        jLabel1.setText("Recipient Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        tableRecipient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "RequiredQuantity", "Cleaning", "Awareness", "Medical", "Planting", "Status"
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

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonor2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tableDonor2);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 760, 60));

        jLabel7.setText("Donor Request");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Distributor");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        labLevelValue2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(labLevelValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, -1));

        enterpriseLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel5.setText("EnterPrise :");
        jPanel2.add(enterpriseLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        jLabel9.setText("Recipient Request");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        tableRecipient2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "ExpiryDate", "A", "B", "AB", "O", "Required Qty", "Status"
            }
        ));
        jScrollPane6.setViewportView(tableRecipient2);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 760, 80));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonor3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tableDonor3);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 760, 60));

        jLabel10.setText("Donor Request");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Distributor");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        enterpriseLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel7.setText("EnterPrise :");
        jPanel3.add(enterpriseLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        labEnterpriseValue3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(labEnterpriseValue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 130, 20));

        jLabel12.setText("Recipient Request");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        tableRecipient3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "ExpiryDate", "A", "B", "AB", "O", "Required Qty", "Status"
            }
        ));
        jScrollPane8.setViewportView(tableRecipient3);

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 760, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDonor4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(tableDonor4);

        jPanel4.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 760, 60));

        jLabel13.setText("Donor Request");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Distributor");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        labLevelValue4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labLevelValue4.setText("<value>");
        jPanel4.add(labLevelValue4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, -1));

        enterpriseLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel8.setText("Level :");
        jPanel4.add(enterpriseLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, 30));

        enterpriseLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel9.setText("EnterPrise :");
        jPanel4.add(enterpriseLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        labEnterpriseValue4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labEnterpriseValue4.setText("<value>");
        jPanel4.add(labEnterpriseValue4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, -1));

        jLabel15.setText("Recipient Request");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        tableRecipient4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RequestDate", "ExpiryDate", "A", "B", "AB", "O", "Required Qty", "Status"
            }
        ));
        jScrollPane10.setViewportView(tableRecipient4);

        jPanel4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 300, 760, 80));

        recCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                recCBItemStateChanged(evt);
            }
        });
        jPanel4.add(recCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        typeCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeCBItemStateChanged(evt);
            }
        });
        jPanel4.add(typeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        qtyCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                qtyCBItemStateChanged(evt);
            }
        });
        jPanel4.add(qtyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        Process.setText("Process");
        Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessActionPerformed(evt);
            }
        });
        jPanel4.add(Process, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, -1, -1));

        jLabel16.setText("Requirement:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, 40));

        aQtyCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(aQtyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, -1));

        jLabel17.setText("Availability:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, 20));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void recCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_recCBItemStateChanged
        // TODO add your handling code here:
        populatevoluntaryTypeCB();
        qtyCB.removeAllItems();
        //qtyCB.addItem("SELECT");

    }//GEN-LAST:event_recCBItemStateChanged
    public void populatevoluntaryTypeCB() {
        typeCB.removeAllItems();
        //typeCB.addItem("SELECT");
        typeCB.addItem("voluntaryCleanlinessType");
        typeCB.addItem("voluntarySocailAwarenessType");
        typeCB.addItem("voluntaryMedicatingType");
        typeCB.addItem("voluntaryGreenPlantationType");
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

        if (requiredQty == availableQty) {
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

                if (org.getName().equals(Organization.Type.VoluntaryAssist.getValue())) {
                    for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                        //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                            if (wr.getSender().equals(userAccount)) {

                                VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;

                                {
                                    if (lwr.getReceiver().equals(account)) {
                                        if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                            lwr.getVoluntaryDetails().setVoluntaryCleanlinessType(0);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                            lwr.getVoluntaryDetails().setVoluntarySocailAwarenessType(0);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                            lwr.getVoluntaryDetails().setVoluntaryMedicatingType(0);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                            lwr.getVoluntaryDetails().setVoluntaryGreenPlantationType(0);
                                        }
                                        populateDonorTable();
                                    }

                                }
                            }
                        }
                    }
                }
            }
        } else if (requiredQty > availableQty) {
            int process = requiredQty - availableQty;
            //System.out.println("Delivered Blood Quantity="+process);

            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

                if (org.getName().equals(Organization.Type.VoluntaryAssist.getValue())) {
                    for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                        //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                            if (wr.getSender().equals(userAccount)) {

                                VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;

                                if ((lwr.getReceiver() == null)) {
                                    return;
                                } else if (lwr.getReceiver().equals(account)) {
                                    if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                        System.out.println(" A-Type Availability has became zero");
                                        lwr.getVoluntaryDetails().setVoluntaryCleanlinessType(0);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                        lwr.getVoluntaryDetails().setVoluntarySocailAwarenessType(0);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                       lwr.getVoluntaryDetails().setVoluntaryMedicatingType(0);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                        lwr.getVoluntaryDetails().setVoluntaryGreenPlantationType(0);
                                    }
                                    populateDonorTable();
                                    System.out.println("Availablity Size" + userAccount.getWorkQueue().getWorkRequestList().size());
                                }
                            }
                        }
                    }
                }
            }
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

                if (org.getName().equals(Organization.Type.VoluntaryRecipient.getValue())) {
                    for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                        //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                            if (wr.getSender().equals(userAccount)) {
                                VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;

                                int size = rbwrList.size();
                                //int size = userAccount.getWorkQueue().getWorkRequestList().size();
                                System.out.println("Requirement Size" + userAccount.getWorkQueue().getWorkRequestList().size());
                                int diff = requiredQty - availableQty;
                                System.out.println("Ratio" + diff / size);
                                if (diff % size == 0) {
                                    if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                        //System.out.println("rec A" + (diff / size));
                                        lwr.getVoluntaryDetails().setVoluntaryCleanlinessType(diff/size);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                        //System.out.println("rec B" + (diff / size));
                                        lwr.getVoluntaryDetails().setVoluntarySocailAwarenessType(diff/size);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                        //System.out.println("rec AB" + (diff / size));
                                        lwr.getVoluntaryDetails().setVoluntaryMedicatingType(diff/size);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                         lwr.getVoluntaryDetails().setVoluntaryGreenPlantationType(diff/size);
                                        //System.out.println("rec O" + (diff / size));
                                    }
                                    populateRecipientTable();
                                } else {

                                    //userAccount.getWorkQueue().getWorkRequestList().get(0);
                                    if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                        //System.out.println("rec A1" + ((diff / size) + (diff % size)));
                                        rbwrList.get(0).getVoluntaryDetails().setVoluntaryCleanlinessType((diff/size)+(diff%size));
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                        //System.out.println("rec B1" + ((diff / size) + (diff % size)));
                                        rbwrList.get(0).getVoluntaryDetails().setVoluntarySocailAwarenessType((diff/size)+(diff%size));
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                        //System.out.println("rec AB1" + ((diff / size) + (diff % size)));
                                        rbwrList.get(0).getVoluntaryDetails().setVoluntaryMedicatingType((diff/size)+(diff%size));
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                        //System.out.println("rec O1" + ((diff / size) + (diff % size)));
                                        rbwrList.get(0).getVoluntaryDetails().setVoluntaryGreenPlantationType((diff/size)+(diff%size));
                                    }
                                    int s = rbwrList.size();
                                    for (int i = 1; i < s; i++) {
                                        if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                            System.out.println("rec A2" + (diff / size));
                                            rbwrList.get(i).getVoluntaryDetails().setVoluntaryCleanlinessType(diff/size);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                            System.out.println("rec B2" + (diff / size));
                                            rbwrList.get(i).getVoluntaryDetails().setVoluntarySocailAwarenessType(diff/size);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                            System.out.println("rec AB2" + (diff / size));
                                            rbwrList.get(i).getVoluntaryDetails().setVoluntaryMedicatingType(diff/size);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                            System.out.println("rec O2" + (diff / size));
                                            rbwrList.get(i).getVoluntaryDetails().setVoluntaryGreenPlantationType(diff/size);
                                        }

                                    }
                                    populateRecipientTable();
                                }
                            }
                        }
                    }
                }
            }
        } else if (availableQty > requiredQty) {
            int process = availableQty - requiredQty;
            System.out.println("Remaining Blood Quantity=" + process);

            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

                if (org.getName().equals(Organization.Type.VoluntaryRecipient.getValue())) {
                    for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                        //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                            if (wr.getSender().equals(userAccount)) {

                                VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;

                                if ((lwr.getReceiver() == null)) {
                                    return;
                                } else if (lwr.getReceiver().equals(account)) {
                                    if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                        //System.out.println(" A-Type Requirement has became zero");
                                        lwr.getVoluntaryDetails().setVoluntaryCleanlinessType(0);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                       lwr.getVoluntaryDetails().setVoluntarySocailAwarenessType(0);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                        lwr.getVoluntaryDetails().setVoluntaryMedicatingType(0);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                        lwr.getVoluntaryDetails().setVoluntaryGreenPlantationType(0);
                                    }
                                    populateRecipientTable();
                                    System.out.println("Requirement Size" + userAccount.getWorkQueue().getWorkRequestList().size());
                                }
                            }
                        }
                    }
                }
            }
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

                if (org.getName().equals(Organization.Type.VoluntaryAssist.getValue())) {
                    for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                        //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                            if (wr.getSender().equals(userAccount)) {
                                VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;

                                int size = bwrList.size();
                                System.out.println("Available Size" + bwrList.size());
                                int diff = availableQty - requiredQty;
                                System.out.println("Ratio" + diff / size);
                                if (diff % size == 0) {
                                    if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                        //System.out.println("rec A" + (diff / size));
                                        lwr.getVoluntaryDetails().setVoluntaryCleanlinessType(diff/size);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                       // System.out.println("rec B" + (diff / size));
                                        lwr.getVoluntaryDetails().setVoluntarySocailAwarenessType(diff/size);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                        System.out.println("rec AB" + (diff / size));
                                        lwr.getVoluntaryDetails().setVoluntaryMedicatingType(diff/size);
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                        lwr.getVoluntaryDetails().setVoluntaryGreenPlantationType(diff/size);
                                       // System.out.println("rec O" + (diff / size));
                                    }
                                    populateDonorTable();
                                } else {

                                    //userAccount.getWorkQueue().getWorkRequestList().get(0);
                                    if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                        System.out.println("rec A1" + ((diff / size) + (diff % size)));
                                        bwrList.get(0).getVoluntaryDetails().setVoluntaryCleanlinessType((diff/size)+(diff%size));
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                        System.out.println("rec B1" + ((diff / size) + (diff % size)));
                                        bwrList.get(0).getVoluntaryDetails().setVoluntarySocailAwarenessType((diff/size)+(diff%size));
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                        System.out.println("rec AB1" + ((diff / size) + (diff % size)));
                                        bwrList.get(0).getVoluntaryDetails().setVoluntaryMedicatingType((diff/size)+(diff%size));
                                    } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                        System.out.println("rec O1" + ((diff / size) + (diff % size)));
                                        bwrList.get(0).getVoluntaryDetails().setVoluntaryGreenPlantationType((diff/size)+(diff%size));
                                    }
                                    int s = bwrList.size();
                                    for (int i = 1; i < s; i++) {
                                        if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                            //System.out.println("rec A2" + (diff / size));
                                            bwrList.get(i).getVoluntaryDetails().setVoluntaryCleanlinessType(diff/size);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntarySocailAwarenessType")) {
                                            //System.out.println("rec B2" + (diff / size));
                                            bwrList.get(i).getVoluntaryDetails().setVoluntarySocailAwarenessType(diff/size);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntaryMedicatingType")) {
                                            //System.out.println("rec AB2" + (diff / size));
                                            bwrList.get(i).getVoluntaryDetails().setVoluntaryMedicatingType(diff/size);
                                        } else if (typeCB.getSelectedItem().toString().equals("voluntaryGreenPlantationType")) {
                                            //System.out.println("rec O2" + (diff / size));
                                            bwrList.get(i).getVoluntaryDetails().setVoluntaryGreenPlantationType(diff/size);
                                        }

                                    }
                                    populateDonorTable();
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_ProcessActionPerformed
    public void populateRequired() {
        qtyCB.removeAllItems();
        Integer sum_req_count = 0;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            // System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodRecipient.getValue());

            if (org.getName().equals(Organization.Type.VoluntaryRecipient.getValue())) {
                for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                        VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;
                        //System.out.println("left Side"+recCB.getSelectedItem().toString());
                        //System.out.println("rightSide"+lwr.getBloodRecipient().getBloodRecipientName().toString());
                        if (recCB.getSelectedItem().toString().equals(lwr.getVoluntaryRecipient().getVoluntaryRecipientName())) {
                            if (typeCB.getSelectedItem() == null) {
                                return;
                            } else if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                //System.out.println("blood qty"+typeCB.getSelectedItem().toString());
                                int a = lwr.getVoluntaryDetails().getVoluntaryCleanlinessType();
                                sum_req_count = sum_req_count + a;
                                //a++;
                                //qtyCB.addItem(String.valueOf(a));
                            } else if (typeCB.getSelectedItem().equals("voluntarySocailAwarenessType")) {
                                // qtyCB.addItem(lwr.getBloodDetails().getBloodTypeB().toString());
                                int b = lwr.getVoluntaryDetails().getVoluntarySocailAwarenessType();
                                sum_req_count = sum_req_count + b;
                            } else if (typeCB.getSelectedItem().equals("voluntaryMedicatingType")) {
                                //qtyCB.addItem(lwr.getBloodDetails().getBloodTypeAB().toString());
                                int ab = lwr.getVoluntaryDetails().getVoluntaryMedicatingType();
                                sum_req_count = sum_req_count + ab;
                            } else if (typeCB.getSelectedItem().equals("voluntaryGreenPlantationType")) {
                                //qtyCB.addItem(lwr.getBloodDetails().getBloodTypeO().toString());
                                int o = lwr.getVoluntaryDetails().getVoluntaryGreenPlantationType();
                                sum_req_count = sum_req_count + o;
                            }

                        }
                    }
                }
            }
        }
        if (sum_req_count > 0) {
            qtyCB.addItem(String.valueOf(sum_req_count));
        }

    }

    public void populateAvailable() {
        aQtyCB.removeAllItems();
        Integer sum_req_count1 = 0;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            //System.out.println("Org in:" + org.getName() + " Org type:" + Organization.Type.BloodLab.getValue());

            if (org.getName().equals(Organization.Type.VoluntaryAssist.getValue())) {
                for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                    //System.out.println("WorkReq:" + userAccount.getWorkQueue().getWorkRequestList().size());
                    for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
                        if (wr.getSender().equals(userAccount)) {
                            VoluntaryDistributorWorkRequest lwr = (VoluntaryDistributorWorkRequest) wr;
                            //System.out.println("left Side"+recCB.getSelectedItem().toString());
                            //System.out.println("rightSide"+lwr.getBloodDonor().getBloodDonorName().toString());
                            //if(recCB.getSelectedItem().toString().equals(lwr.getBloodDonor().getBloodDonorName())){
                            if (typeCB.getSelectedItem() == null) {
                                return;
                            } else if (typeCB.getSelectedItem().toString().equals("voluntaryCleanlinessType")) {
                                //System.out.println("blood qty"+typeCB.getSelectedItem().toString());
                                int a1 = lwr.getVoluntaryDetails().getVoluntaryCleanlinessType();
                                sum_req_count1 = sum_req_count1 + a1;
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeA().toString());
                                //a++;
                                //qtyCB.addItem(String.valueOf(a));
                            } else if (typeCB.getSelectedItem().equals("voluntarySocailAwarenessType")) {
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeB().toString());
                                int b1 = lwr.getVoluntaryDetails().getVoluntarySocailAwarenessType();
                                sum_req_count1 = sum_req_count1 + b1;

                            } else if (typeCB.getSelectedItem().equals("voluntaryMedicatingType")) {
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeAB().toString());
                                int ab1 = lwr.getVoluntaryDetails().getVoluntaryMedicatingType();
                                sum_req_count1 = sum_req_count1 + ab1;
                            } else if (typeCB.getSelectedItem().equals("voluntaryGreenPlantationType")) {
                                //aQtyCB.addItem(lwr.getBloodDetails().getBloodTypeO().toString());
                                int o1 = lwr.getVoluntaryDetails().getVoluntaryGreenPlantationType();
                                sum_req_count1 = sum_req_count1 + o1;
                            }

                        }
                    }
                }
            }
        }
        //}
        if (sum_req_count1 > 0) {
            aQtyCB.addItem(String.valueOf(sum_req_count1));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Process;
    private javax.swing.JComboBox<String> aQtyCB;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel enterpriseLabel3;
    private javax.swing.JLabel enterpriseLabel5;
    private javax.swing.JLabel enterpriseLabel7;
    private javax.swing.JLabel enterpriseLabel8;
    private javax.swing.JLabel enterpriseLabel9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel labEnterpriseValue;
    private javax.swing.JLabel labEnterpriseValue3;
    private javax.swing.JLabel labEnterpriseValue4;
    private javax.swing.JLabel labLevelValue2;
    private javax.swing.JLabel labLevelValue4;
    private javax.swing.JComboBox<String> qtyCB;
    private javax.swing.JComboBox<String> recCB;
    private javax.swing.JTable tableDonor;
    private javax.swing.JTable tableDonor1;
    private javax.swing.JTable tableDonor2;
    private javax.swing.JTable tableDonor3;
    private javax.swing.JTable tableDonor4;
    private javax.swing.JTable tableRecipient;
    private javax.swing.JTable tableRecipient1;
    private javax.swing.JTable tableRecipient2;
    private javax.swing.JTable tableRecipient3;
    private javax.swing.JTable tableRecipient4;
    private javax.swing.JComboBox<String> typeCB;
    // End of variables declaration//GEN-END:variables
}
