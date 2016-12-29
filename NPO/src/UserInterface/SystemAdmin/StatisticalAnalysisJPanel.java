/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.Analysis;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NPOBloodDonationEnterprise;
import Business.Network.Network;
import Business.Organization.BloodDonation.BloodRecipientOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodRecipientWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import javax.swing.JPanel;



/**
 *
 * @author Malick
 */
public class StatisticalAnalysisJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private EcoSystem s;
    private ArrayList<Analysis> datalist;
    private ArrayList<String> mondatlist;
    /**
     * Creates new form StatisticalAnalysis
     */
    public StatisticalAnalysisJPanel(JPanel upc, EcoSystem system) {
        initComponents();
        this.upc = upc;
        this.s = s;
          for(Network network:s.getNetworkList())
        {
           networkCB.addItem(network);
        }
        datalist=new ArrayList<>();
        mondatlist= new ArrayList<>();
    
     for(Network network:s.getNetworkList())
        {
            for(Enterprise en:network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(en.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.NPOBLOOD.getValue()))
                {
                    NPOBloodDonationEnterprise he = (NPOBloodDonationEnterprise) en;
                    for(Organization org:he.getOrganizationDirectory().getOrganizationList())
                    {
                        if(org.getName().equals(Organization.Type.BloodRecipient.getValue()))
                        {
                            BloodRecipientOrganization no = (BloodRecipientOrganization) org;
                            for(UserAccount ua:no.getUserAccountDirectory().getUserAccountList())
                            {
                                for(WorkRequest wr:ua.getWorkQueue().getWorkRequestList())
                                {
                                    if(wr.getSender().equals(ua))
                                    {
                                        WorkRequest dwr = (BloodRecipientWorkRequest) wr;
                                        Calendar cal = Calendar.getInstance();
                                        cal.setTime(dwr.getRequestDate());
                                        String year = String.valueOf(cal.get(Calendar.YEAR));
                                        int month = cal.get(Calendar.MONTH);
                                        System.out.print("Year"+String.valueOf(cal.get(Calendar.YEAR)));
                                        String mon=null;
                                        if(month==0) { mon = "Jan "+year; 
                                        Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                        e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                        mondatlist.add(mon);}
                                        else if(month==1) 
                                        { mon = "Feb "+year; 
                                        Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                        e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        else if(month==2) { mon = "Mar "+year; 
                                        Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                       e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);
                                        }
                                        else if(month==3) { mon = "Apr "+year; 
                                        Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                       e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        else if(month==4) { mon = "May "+year; Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                        e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e); 
                                         mondatlist.add(mon);}
                                        else if(month==5) { mon = "Jun "+year; Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                        e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        else if(month==6) { mon = "Jul "+year; 
                                        Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                        e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        else if(month==7) { mon = "Aug "+year; 
                                        Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                        e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        else if(month==8) { mon = "Sept "+year; Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                        e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        else if(month==9) { mon = "Oct "+year; Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                       e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        else if(month==10) { mon = "Nov "+year; 
                                        Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                       e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        else if(month==11) { mon = "Dec "+year; Analysis e = new Analysis();
                                        e.setMonthyear(mon);
                                        e.setNetwork(network);
                                       e.setWq1((BloodRecipientWorkRequest) dwr);
                                        datalist.add(e);
                                         mondatlist.add(mon);}
                                        System.out.print("Mon"+mon);
                                        //datelist.add(String.valueOf(month));
                                    }
                                }
                            }
                        }
                    }
                }
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

        labHeading = new javax.swing.JLabel();
        panelChart = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        networkCB = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        timeCB = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labHeading.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labHeading.setText("Statistical Analysis");
        add(labHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 20));

        panelChart.setBackground(new java.awt.Color(0, 0, 204));
        panelChart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelChart.setPreferredSize(new java.awt.Dimension(400, 200));
        panelChart.setLayout(new java.awt.BorderLayout());
        add(panelChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 690, 360));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Network:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        networkCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                networkCBItemStateChanged(evt);
            }
        });
        add(networkCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Time Period:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        timeCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                timeCBItemStateChanged(evt);
            }
        });
        add(timeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jButton1.setText("Submit >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void networkCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_networkCBItemStateChanged
        // TODO add your handling code here:
        //        drawGraph(networkCB.getSelectedItem().toString(),timeCB.getSelectedItem().toString(),datalist);
        //        System.out.println("Network:"+networkCB.getSelectedItem().toString());
        // System.out.println("Time:"+timeCB.getSelectedItem().toString());

        //
    }//GEN-LAST:event_networkCBItemStateChanged

    private void timeCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_timeCBItemStateChanged
        // TODO add your handling code here:
        // drawGraph(networkCB.getSelectedItem().toString(),timeCB.getSelectedItem().toString(),datalist);
        // System.out.println("Network:"+networkCB.getSelectedItem().toString());
        //      System.out.println("Time:"+timeCB.getSelectedItem().toString());

    }//GEN-LAST:event_timeCBItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String dt = timeCB.getSelectedItem().toString();
        String nt = networkCB.getSelectedItem().toString();
        //drawGraph(nt,dt,datalist);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labHeading;
    public javax.swing.JComboBox networkCB;
    private javax.swing.JPanel panelChart;
    public javax.swing.JComboBox timeCB;
    // End of variables declaration//GEN-END:variables
}
    /*private void drawGraph(String network,String dt,ArrayList<Analysis> analyser) {
       Integer count=0;
       
        ArrayList<String> bloodTypeslist = new ArrayList<>();
        for(int i=0;i<analyser.size();i++)
        {
            
            if(analyser.get(i).getNetwork().getNetworkCity().equals(network))
            {
                System.out.println("Network"+analyser.get(i).getNetwork().getNetworkCity());
                if(analyser.get(i).getMonthyear().equals(dt))
                {
                    System.out.println("In"+analyser.get(i).getWq1().getBloodDetails().getBloodTypeA());
                    bloodTypeslist.add(analyser.get(i).getWq1().getBloodDetails().getBloodTypeA().toString());
                    
                }
            }
        }
        if(bloodTypeslist!=null)
        {
         DefaultPieDataset ds=new DefaultPieDataset();
         //ArrayList<String> symptomslistcpy = symptomslist;
         System.out.println("Symptoms:"+symptomslist.size());
         for (int i = 0; i < symptomslist.size(); i++) {
            String a1 = symptomslist.get(i);
           // System.out.println("Symptoms:"+a1);
            int occurrences = Collections.frequency(symptomslist, a1);
          //  System.out.println("Occurences:"+occurrences);
            ds.setValue(symptomslist.get(i),occurrences);
        }
         JFreeChart chart=ChartFactory.createPieChart3D("Product Chart", ds,true,                   // include legend
            true,
            false);
        
        ChartPanel linePanel=new ChartPanel(chart);
        panelChart.removeAll();
        panelChart.add(linePanel,BorderLayout.CENTER);
        panelChart.validate();
        }
    }
}*/
