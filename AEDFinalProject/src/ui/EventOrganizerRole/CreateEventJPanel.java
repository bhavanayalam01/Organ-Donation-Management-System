/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EventOrganizerRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author saikr
 */
public class CreateEventJPanel extends javax.swing.JPanel {
        private JPanel userProcessContainer;
    private  AwarnessCampaign organization;
    private Enterprise enterprise;
        private UserAccount userAccount;
        private EcoSystem system;
    /**
     * Creates new form CreateEventJPanel
     */
    public CreateEventJPanel(JPanel userProcessContainer,UserAccount userAccount,Enterprise enterprise,EcoSystem ecosystem) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = ecosystem;
     //   valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEventName = new javax.swing.JTextField();
        txtVenue = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        txtMInutes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lbl_comment = new javax.swing.JLabel();
        txt_comments = new javax.swing.JTextField();
        lbl_amount = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Event Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Venue:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CREATE NEW ORGAN DONATION EVENT");

        txtEventName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtVenue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVenue.setText(" ");
        txtVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVenueActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Date:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Time:");

        txtHours.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHours.setText("HH");

        txtMInutes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMInutes.setText("MM");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText(":");

        btnCreate.setBackground(new java.awt.Color(204, 204, 204));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 0, 51));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 51));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbl_comment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_comment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_comment.setText("Purpose: ");

        txt_comments.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_amount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_amount.setText("Funds Required:");

        txt_amount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_comment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_comments, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                .addComponent(txt_amount))
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtMInutes, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19)))
                                .addGap(21, 21, 21)))
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_comment)
                            .addComponent(txt_comments, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_amount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtMInutes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtVenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27)
                .addComponent(btnCreate)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCreate, jLabel2, jLabel3, jLabel4, jLabel5, lbl_amount, lbl_comment, txtDate, txtEventName, txtHours, txtMInutes, txtVenue, txt_amount, txt_comments});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String message = txtEventName.getText();
        String venue = txtVenue.getText();
        Date d = (txtDate.getDate());
        Date today = new Date(); 
        String t = txtHours.getText()+":"+txtMInutes.getText();
        //System.out.println(message);
        EventWorkRequest request = new EventWorkRequest();
        request = (EventWorkRequest) request;
        request.setMessage(message);
        request.setVenue(venue);
        request.setDate(d);
        request.setTime(t);
        request.setStatus("Request Submitted");
        if(message.equals("")){
            JOptionPane.showMessageDialog(null, "Event Name can't be empty");
            return;
        }
        if(venue.equals("")){
            JOptionPane.showMessageDialog(null, "Venue can't be empty");
            return;
        }
        
        if (!d.after(today)) {
            JOptionPane.showMessageDialog(null, "Please select a proper date");
            return;
        }
        
        
        int hrs=0;
        int min=0;
        try{
            hrs = Integer.parseInt(txtHours.getText());
            min = Integer.parseInt(txtMInutes.getText());
        }catch(Exception e){
         JOptionPane.showMessageDialog(null, "Please enter only numbers");
         return;
        }
        if(hrs<0 || hrs >=24){
             JOptionPane.showMessageDialog(null, "Hours Should be between 0-23");
             return;
        }
         if(min<0 || min >=60){
             JOptionPane.showMessageDialog(null, "Minutes Should be between 0-60");
             return;
        }
        //((EventWorkRequest) request).setVenue(venueField.getText());
        //row[1] = request.getReceiver();
        //row[2] = ((EventWorkRequest) request).getDate();
        //String result = ((EventWorkRequest) request).getTestResult();
        //row[3] =((EventWorkRequest) request).getTime();
        request.setSender(userAccount);
        //request.setStatus("Sent");
        request.setMessage(message);
        request.setComment(txt_comments.getText());
        request.setAmount(txt_amount.getText());
        if(userAccount.getWorkQueue()==null){
            WorkQueue wq = new WorkQueue();
                 userAccount.setWorkQueue(wq);
        }
        userAccount.getWorkQueue().getWorkRequestList().add(request);
        //organization.getWorkQueue().getWorkRequestList().add(request);
        Organization org = null;
        // System.out.println("Inside Organ Work Request");
        for(Network network:system.getNetworkList()){
            //System.out.println(network);
        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
         //organization.getWorkQueue().getWorkRequestList().add(request);
         System.out.println("Siva"+organization.getName());
         if(organization instanceof PoliciesAndFinance){
         System.out.println("sai"+organization.getName()); 
         for (UserAccount ua :organization.getUserAccountDirectory().getUserAccountList()){
                 
                if(organization instanceof PoliciesAndFinance){
                    
                   /* if(ua.getWorkQueue()== null);{
    WorkQueue wq = new WorkQueue();
  // WorkRequest wr = new WorkRequest();
     //EventWorkRequest e = new EventWorkRequest();
    //wq.getWorkRequestList();
    ua.setWorkQueue(wq);
    wq.getWorkRequestList().add(request);
    //userAccount.getWorkQueue().getWorkRequestList().add(e);
}*/        if(ua.getWorkQueue()== null){
                 WorkQueue wq = new WorkQueue();
                 ua.setWorkQueue(wq);}
                // wq.getWorkRequestList().add(request);}
                    
         ua.getWorkQueue().getWorkRequestList().add(request);
         request.setReceiver(ua);
                break;} }
                    if (organization instanceof AwarnessCampaign) {
                        System.out.println("To know ORg "+organization);
                        org= organization;
                        // System.out.print(organization.getWorkQueue());
                        break;
                    }
                }

            }
        }

        //        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            //            System.out.println(organization);
            //            if (organization instanceof OrganTissueDonationOrganization) {
                //
                //                org = organization;
                //                break;
                //            }
            //        }
        if (org != null) {
            // OrganTissueDonationOrganization org1 = (OrganTissueDonationOrganization) org;
            //WorkQueue wq = new WorkQueue();
           // org.setWorkQueue(wq);
          //  org.getWorkQueue().getWorkRequestList().add(request);--
            //userAccount.setWorkQueue(wq);
           //userAccount.getWorkQueue().getWorkRequestList().add(request);
            //System.out.println(org+" and work request"+org.getWorkQueue().getWorkRequestList());
            //System.out.println("User work request and work request"+userAccount.getWorkQueue().getWorkRequestList().toString());

            // System.out.println();
            // System.out,
            //System.out.println("Organization Work Queue--------- ");
            //System.out.println(org.getWorkQueue().getWorkRequestList());
           /* for (WorkRequest request1 : org.getWorkQueue().getWorkRequestList()){
                System.err.println("organ work request"+request.toString());
            }*/

                   }}
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EventOrganizerWorkAreaJPanel eowajp = (EventOrganizerWorkAreaJPanel ) component;
        eowajp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EventOrganizerWorkAreaJPanel eowajp = (EventOrganizerWorkAreaJPanel ) component;
        eowajp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVenueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_comment;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtMInutes;
    private javax.swing.JTextField txtVenue;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_comments;
    // End of variables declaration//GEN-END:variables
}
