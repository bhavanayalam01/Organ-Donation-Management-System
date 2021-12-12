/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Therapy;
import Business.Network.Network;
import Business.Organization.Medical;
import Business.Organization.Organization;
import Business.Person.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TherapistWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author bhavana
 */
public class RequestTherapyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTherapyJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    String id;
    Medical org;
    EcoSystem ecoSystem;
    Enterprise enterprise;
    Network network;
    Patient p;
    public RequestTherapyJPanel(JPanel userProcessContainer, Medical organization, UserAccount userAccount, Patient p, EcoSystem ecosystem, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.id=""+p.getId();
        this.ecoSystem=ecosystem;
        this.p=p;
        this.org=organization;
        this.network=network;
        this.enterprise=enterprise;
        txt_patID.setText(id);
        txt_patname.setText(this.p.getName());
        display();
    }
    
    public void display(){
        cb_network.addItem("--Select--");
        for(Network n: ecoSystem.getNetworkList()){
            cb_network.addItem(n.getName());
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

        lbl_patientID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_patID = new javax.swing.JTextField();
        txt_patname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cb_network = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        cb_centers = new javax.swing.JComboBox<String>();
        cb_therapy = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));

        lbl_patientID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_patientID.setText("Patient ID ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Patient Name ");

        txt_patID.setEditable(false);
        txt_patID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_patname.setEditable(false);
        txt_patname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Network ");

        cb_network.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_network.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_networkActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Therapy Centers ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Therapy Category ");

        btn_submit.setBackground(new java.awt.Color(204, 204, 204));
        btn_submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 51, 51));
        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        cb_centers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_centers.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "--Select--" }));
        cb_centers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_centersActionPerformed(evt);
            }
        });

        cb_therapy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_therapy.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "--Select--" }));
        cb_therapy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_therapyActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Request Therapy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(txt_patname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(cb_network, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(cb_centers, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(txt_patID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cb_therapy, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_patientID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_patID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_patname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_network, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(cb_centers))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_therapy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cb_centersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_centersActionPerformed
        // TODO add your handling code here:
        cb_therapy.removeAllItems();
        for(Network n: ecoSystem.getNetworkList()){
            if(cb_network.getSelectedItem().toString().equalsIgnoreCase(n.getName())){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getName().equalsIgnoreCase(cb_centers.getSelectedItem().toString())){
                        for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                            cb_therapy.addItem(o.getName());
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_cb_centersActionPerformed

    private void cb_therapyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_therapyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb_therapyActionPerformed

    private void cb_networkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_networkActionPerformed
        // TODO add your handling code here:
        cb_centers.removeAllItems();
        cb_centers.addItem("--Select--");
        for(Network n: ecoSystem.getNetworkList()){
            if(cb_network.getSelectedItem().toString().equalsIgnoreCase(n.getName())){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().getValue().equalsIgnoreCase("therapy")){
                        cb_centers.addItem(e.getName());
                    }
                   
                }
            }
        }
    }//GEN-LAST:event_cb_networkActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        boolean check;
        check=(!(cb_centers.getSelectedItem()==null||cb_network.getSelectedItem()==null||cb_therapy.getSelectedItem()==null));
        
        if(!check){
            JOptionPane.showMessageDialog(null, "Select proper options (or) doctors not available");
            return;
        }        
        TherapistWorkRequest request = new TherapistWorkRequest();
        request.setPatientAccount(p);
        Organization orga = null;
        request.setSender(userAccount);
        request.setStatus("Requested");

        for(Network n: ecoSystem.getNetworkList()){
            if(n.getName().equalsIgnoreCase(cb_network.getSelectedItem().toString())){
                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof Therapy&&e.getName().equalsIgnoreCase(cb_centers.getSelectedItem().toString())){
                        for(Organization o:e.getOrganizationDirectory().getOrganizationList()){
                            if(o.getName().equalsIgnoreCase(cb_therapy.getSelectedItem().toString())){
                                orga=o;
                                o.getWorkQueue().getWorkRequestList().add(request);
                                userAccount.getWorkQueue().getWorkRequestList().add(request);
                                JOptionPane.showMessageDialog(null, "Therapist service requested");
                            }
                        }
                    }
                }
            }
        }
        
        DoctorWorkAreaJPanel sa=new DoctorWorkAreaJPanel(userProcessContainer,userAccount,org,enterprise,ecoSystem,network);
        userProcessContainer.add("Customer Adding",sa);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btn_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DoctorWorkAreaJPanel sa=new DoctorWorkAreaJPanel(userProcessContainer,userAccount,org,enterprise,ecoSystem,network);
        userProcessContainer.add("Customer Adding",sa);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cb_centers;
    private javax.swing.JComboBox<String> cb_network;
    private javax.swing.JComboBox<String> cb_therapy;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_patientID;
    private javax.swing.JTextField txt_patID;
    private javax.swing.JTextField txt_patname;
    // End of variables declaration//GEN-END:variables
}
