/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DonorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
//import Business.Organization.DonorOrganization;
//import Business.Organization.OrganTissueDonationOrganization;
import Business.Organization.Organization;
import Business.Person.Donor;
import Business.Person.DonorDirectory;
import java.awt.CardLayout;
import java.net.PasswordAuthentication;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
//import javax.mail.Message;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
* @author saikr
 */
public class DonorRegistrationFormJPanel extends javax.swing.JPanel {
    // Organization organization;

    JPanel userProcessContainer;
    String emailAdd;
    EcoSystem ecosystem;
    String city;
    DB4OUtil dB4OUtil;
    //DonorOrganization organization;
    DonorDirectory donorDirectory;
    List<String> userList = new ArrayList<String>();
//        EmployeeDirectory employeeD;
//        
    /**
     * Creates new form DonorRegistrationFormJPanel
     */
    List<String> organList = new ArrayList<String>();

    public DonorRegistrationFormJPanel(JPanel userProcessContainer, EcoSystem system, DonorDirectory donorDirectory, DB4OUtil dB4OUtil) {
        initComponents();
        //this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        // this.emailAdd=email;
        //txtEmailId.setText(email);
        //txtContactDonor.setText();
        txtCity.setText(city);
        txtCity.setEnabled(false);
        this.ecosystem = system;
        this.city = city;
        this.donorDirectory = donorDirectory;
        this.dB4OUtil = dB4OUtil;
        popuser();
//        this.employeeD = new EmployeeDirectory();
//        System.out.println("Donor Direcotry"+donorDirectory.getDonorList());
//                System.out.println("Emp Direcotry"+employeeD.getEmployeeList());
    }

    public void popuser() {
        for (Donor d : ecosystem.getDonorDirectory()) {
            userList.add(d.getName());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtContactDonor = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmergencyName = new javax.swing.JTextField();
        txtEmergencyContact = new javax.swing.JTextField();
        txtSignature = new javax.swing.JTextField();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        organJComboBox = new javax.swing.JComboBox();
        lblOrgan1 = new javax.swing.JLabel();
        bloodGroupJComboBox1 = new javax.swing.JComboBox();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        btnRegister1 = new javax.swing.JButton();
        radOrganAvailYes = new javax.swing.JRadioButton();
        radOrganAvailNo = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAddress1 = new javax.swing.JTextField();
        lblCity1 = new javax.swing.JLabel();
        txtCity1 = new javax.swing.JTextField();
        lblCity2 = new javax.swing.JLabel();
        txtCity2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER TO BECOME AN DONAR");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 740, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("First Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 180, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Age :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Sex :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 180, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Blood Group :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Contact Number :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Email-Id :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 180, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Address :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Organ to donate:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Contact Information:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 400, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Name :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 160, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Please enter your name in digital signature field to give your consent ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 640, 550, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Contact number :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 160, 20));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 210, -1));

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 210, -1));

        txtContactDonor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtContactDonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 210, -1));

        txtEmailId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 210, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 210, 30));

        txtEmergencyName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtEmergencyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 210, -1));

        txtEmergencyContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmergencyContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmergencyContactActionPerformed(evt);
            }
        });
        add(txtEmergencyContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 210, -1));

        txtSignature.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtSignature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSignatureActionPerformed(evt);
            }
        });
        add(txtSignature, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 670, 390, 30));

        radMale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radMale);
        radMale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radMale.setText("Male");
        radMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radMaleActionPerformed(evt);
            }
        });
        add(radMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 66, -1));

        radFemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radFemale);
        radFemale.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radFemale.setText("Female");
        radFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFemaleActionPerformed(evt);
            }
        });
        add(radFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 90, 30));

        organJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        organJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Heart", "Lungs", "Kidneys", "Small Bowel", "Pancreas" }));
        organJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organJComboBoxActionPerformed(evt);
            }
        });
        add(organJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 140, -1));
        add(lblOrgan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2157, 327, -1, 22));

        bloodGroupJComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bloodGroupJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B Positive", "B Negative", "A Positive", "A Negative", "O Positive", "O Negative" }));
        bloodGroupJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupJComboBox1ActionPerformed(evt);
            }
        });
        add(bloodGroupJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 140, -1));

        lblCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("City :");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 180, 20));

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 210, -1));

        btnRegister1.setBackground(new java.awt.Color(204, 204, 204));
        btnRegister1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegister1.setForeground(new java.awt.Color(255, 0, 51));
        btnRegister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/registration_30px.png"))); // NOI18N
        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });
        add(btnRegister1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 130, 29));

        radOrganAvailYes.setBackground(new java.awt.Color(255, 255, 255));
        radOrganAvailYes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radOrganAvailYes.setText("Yes");
        add(radOrganAvailYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, -1, -1));

        radOrganAvailNo.setBackground(new java.awt.Color(255, 255, 255));
        radOrganAvailNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radOrganAvailNo.setText("No");
        add(radOrganAvailNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Is organ available now:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 180, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Middle Name :");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 180, 20));

        txtName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });
        add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 210, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Last Name :");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 180, 20));

        txtName2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName2ActionPerformed(evt);
            }
        });
        add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 210, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("Please select if organ is avilable for donation");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 480, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("State :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 180, -1));

        txtAddress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 210, -1));

        lblCity1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCity1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity1.setText("Last four digits of SSN :");
        add(lblCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 180, 20));

        txtCity1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCity1ActionPerformed(evt);
            }
        });
        add(txtCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 210, -1));

        lblCity2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCity2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity2.setText("Zipcode :");
        add(lblCity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 180, 20));

        txtCity2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCity2ActionPerformed(evt);
            }
        });
        add(txtCity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 210, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Emergency point of contact ");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 480, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText(" Every registration counts");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 220, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/DonorRole/123.jpg"))); // NOI18N
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 300, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmergencyContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactActionPerformed

    private void txtSignatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSignatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSignatureActionPerformed

    private void organJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organJComboBoxActionPerformed
//            JLabel newLabel = new JLabel();
//            //labels.add(newLabel);
//            newLabel.setBounds(0, 0, 200, 200);
//            newLabel.setText("hello");
//            add(newLabel);

        //validate();
        String selectedOrgan = organJComboBox.getSelectedItem().toString();
        organList.add((String) organJComboBox.getSelectedItem());
        if (lblOrgan1.getText() == "") {
            lblOrgan1.setText((String) organJComboBox.getSelectedItem());
        } else {
            lblOrgan1.setText(lblOrgan1.getText() + ", " + (String) organJComboBox.getSelectedItem());
        }
        organJComboBox.removeItem(selectedOrgan);
    }//GEN-LAST:event_organJComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //organization.getEmployeeDirectory().createEmployee(name);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void bloodGroupJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupJComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupJComboBox1ActionPerformed

    public boolean isFirstnameValid(String text) {

        if (text.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")) {
            for (String s : userList) {
                if (s.equalsIgnoreCase(text)) {
                    JOptionPane.showMessageDialog(null, "User already exists");
                    return false;
                }
            }

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Names should contain only alphabets");
            return false;
        }
    }

    private boolean valage(String age) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(age);
        boolean bool = matcher.matches();
        if (!bool) {
            JOptionPane.showMessageDialog(null, "Age should only be numbers");
            return false;
        } else {
            int age1 = Integer.parseInt(age);
            if (age1 < 0 || age1 > 200) {
                JOptionPane.showMessageDialog(null, "Age should between");
            }
            return true;
        }
    }

    private boolean valPhone(String ph) {
        Pattern pattern = Pattern.compile("[0-9]{10}");
        Matcher matcher = pattern.matcher(ph);
        boolean bool = matcher.matches();
        if (!bool) {
            return true;
            //JOptionPane.showMessageDialog(null,"Invalid phone number format");
//            return false;
        } else {

            return true;
        }
    }

    private boolean usernamePatternCorrect(String username) {
        int f = 0;

        Pattern pattern = Pattern.compile("(?!_).*[A-Za-z0-9._]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,4}");
        Matcher matcher = pattern.matcher(username);
        boolean bool = matcher.matches();
        if (!bool) {
            JOptionPane.showMessageDialog(null, "Special characters are not allowed other than _, @");
            return false;
        } else {

            return true;
        }
    }

    boolean checkforunique() {
        return false;
    }
    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
       
int f = 0;
        String name = txtName.getText();
        //String lastname= txtName1.getText();
        String sex;
        emailAdd = txtEmailId.getText();
        if (radMale.isSelected()) {
            sex = radMale.getText();
        } else {
            sex = radFemale.getText();
        }
        String bloodGroup = bloodGroupJComboBox1.getSelectedItem().toString();
        String contactNumber = txtContactDonor.getText();
        String address = txtAddress.getText();
        String emergencyPOC = txtEmergencyName.getText();
        String emergencyPOC_Num = txtEmergencyContact.getText();
        String sign = txtSignature.getText();
        //int age =Integer.parseInt(txtAge.getText());
        int age = 30;
        
        
        
        
        boolean isOrganAvaiNow = false;
        if (radOrganAvailYes.isSelected()) {
            isOrganAvaiNow = true;
        } else if (radOrganAvailNo.isSelected()) {
            isOrganAvaiNow = false;
        }

        if (isFirstnameValid(name)) {
            f++;
        } else {
            return;
        }
        if (valage(txtAge.getText())) {
            age = Integer.parseInt(txtAge.getText());
            f++;
        } else {
            return;
        }
        
        //String contactNumber=(phoneJTextField.getText());
       if(contactNumber == null || contactNumber.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter Contact Number");
                return;
            }
             else{
                 if(!contactNumber.matches("^(?=.*[0-9]).{10,10}")){
                     JOptionPane.showMessageDialog(null, "Please enter valid Contact Number");
                     return;
                 }
             }
        
        
        
        
        
        
        
        
//        if (valPhone(contactNum)) {
//            f++;
//        } else {
//            return;
//        }
        if (usernamePatternCorrect(emailAdd)) {
            f++;
        } else {
            return;
        }
        if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address cannot be empty");
            return;
        }
        if (sign.equals("")) {
            JOptionPane.showMessageDialog(null, "Sign cannot be empty");
            return;
        }
          if(emergencyPOC_Num == null || emergencyPOC_Num.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter Contact Number");
                return;
            }
             else{
                 if(!emergencyPOC_Num.matches("^(?=.*[0-9]).{10,10}")){
                     JOptionPane.showMessageDialog(null, "Please enter valid Contact Number");
                     return;
                 }
             }
        
        
      
        if (isFirstnameValid(emergencyPOC)) {
            f++;
        } else {
            return;
        }

        Donor d = ecosystem.createDonor(name, age, sex, bloodGroup, contactNumber, address, sign, emailAdd, emergencyPOC, emergencyPOC_Num, isOrganAvaiNow, organList);
        //ecosystem.getDonorDirectory().add(d);
        //JOptionPane.showMessageDialog(null, "Thank you for registering with us!!");
        dB4OUtil.storeSystem(ecosystem);
        JOptionPane.showMessageDialog(null, "Thanks for donation");
        popuser();

        if (f == 0) {
            JOptionPane.showConfirmDialog(null, "Please enter the right details");

        }
         try {
            final String username = "saikrishnakotla125@gmail.com";
            final String password = "7382052184";

            Properties props = new Properties();
            
          
            
            
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                protected javax.mail.PasswordAuthentication getPasswordAuthentication()  {
                    if ((username != null) && (username.length() > 0) && (password != null)
                            && (password.length() > 0)) {

                        return new javax.mail.PasswordAuthentication(username, password);
                    }
                    return null;

                }
            });

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("saikrishnakotla125@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailAdd));
                message.setSubject("Thank you");
                message.setText("Thanks for donation");
                Transport.send(message);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }


        //  ArrayList<String> organDirectory = new ArrayList<String>();
        //String uname = usernameText.getText();
//        if(Heart.isSelected()){
//            SorganDirectory.add("Heart");
//        } 
//        if(Lungs.isSelected()){
//            SorganDirectory.add("Lungs");
//        }
        //Donor donor = new Donor();
        //donorDirectory.createDonor(name, age, sex, address, contactNum, address, sign, emailAdd, emergencyPOC, emergencyPOC_Num, isOrganAvaiNow, organList);





    }//GEN-LAST:event_btnRegister1ActionPerformed

    private void radFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radFemaleActionPerformed

    private void radMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radMaleActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void txtName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName2ActionPerformed

    private void txtCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCity1ActionPerformed

    private void txtCity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCity2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCity2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bloodGroupJComboBox1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCity2;
    private javax.swing.JLabel lblOrgan1;
    private javax.swing.JComboBox organJComboBox;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JRadioButton radOrganAvailNo;
    private javax.swing.JRadioButton radOrganAvailYes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCity1;
    private javax.swing.JTextField txtCity2;
    private javax.swing.JTextField txtContactDonor;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmergencyContact;
    private javax.swing.JTextField txtEmergencyName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtSignature;
    // End of variables declaration//GEN-END:variables
}