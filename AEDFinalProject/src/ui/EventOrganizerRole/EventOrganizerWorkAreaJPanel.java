/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EventOrganizerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.AwarnessCampaign;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkQueue;

import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
//import userinterface.DoctorRole.RequestLabTestJPanel;

/**
 *
 * @author saikr
 */
public class EventOrganizerWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private AwarnessCampaign organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;

    /**
     * Creates new form EventOrganizerWorkAreaJPanel
     */
    public EventOrganizerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AwarnessCampaign organization, EcoSystem system) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
          this.userAccount=account;
          this.organization = organization;
          this.ecosystem = system;
//          valueLabel.setText(enterprise.getName());
          

        //profileName.setText(userAccount.getUsername());
        //quals.setText(userAccount.getQualifications());
         // profilepic();
          populateRequestTable();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEventsDetails = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORGAN DONATION EVENT WORK AREA");

        tblEventsDetails.setBackground(new java.awt.Color(255, 204, 204));
        tblEventsDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblEventsDetails.setForeground(new java.awt.Color(255, 0, 51));
        tblEventsDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Purpose", "Funds Required", "Date", "Time", "Venue", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEventsDetails.setGridColor(new java.awt.Color(0, 51, 51));
        tblEventsDetails.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblEventsDetails.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(tblEventsDetails);

        btnCreate.setBackground(new java.awt.Color(204, 204, 204));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 0, 51));
        btnCreate.setText("Create New Event ");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCreate))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreate, jButton1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CreateEventJPanel", new CreateEventJPanel(userProcessContainer, userAccount, enterprise,ecosystem));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_jButton1ActionPerformed
public void populateRequestTable(){
    
    
    if(userAccount.getWorkQueue()==null){}
    else{
     DefaultTableModel model = (DefaultTableModel) tblEventsDetails.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
             if(request instanceof EventWorkRequest){
            Object[] row = new Object[8];
            row[0] = request;
            row[1] = ((EventWorkRequest) request).getVenue();
            row[2] = ((EventWorkRequest) request).getDate();
            row[3] =((EventWorkRequest) request).getTime();
            row[4] =((EventWorkRequest) request).getAmount();
            row[5] =((EventWorkRequest) request).getComment();
            row[6] =((EventWorkRequest) request).getStatus();
            
            model.addRow(row);}
        }
    }
        
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEventsDetails;
    // End of variables declaration//GEN-END:variables
}
