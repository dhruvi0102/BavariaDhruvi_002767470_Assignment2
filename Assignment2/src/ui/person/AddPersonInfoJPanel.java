/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.person;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import Hospital.City;
import Hospital.CityDirectory;
import Hospital.Community;
import Hospital.CommunityDirectory;
import Hospital.House;
import Hospital.Person;
import Hospital.PersonDirectory;
import java.awt.Color;

/**
 *
 * @author dhruv
 */
public class AddPersonInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonInfoJPanel
     */
    JPanel mainWorkArea;
    CityDirectory cityDirectory;
//    public AddPersonInfoJPanel() {
//        initComponents();
//    }

    public AddPersonInfoJPanel(JPanel mainWorkArea, CityDirectory cityDirectory) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.cityDirectory = cityDirectory;
        populateCityCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCityName = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox();
        lblCommunity = new javax.swing.JLabel();
        cmbCommunity = new javax.swing.JComboBox();
        btnSavePerson = new javax.swing.JButton();
        lblPDemographics = new javax.swing.JLabel();
        lblPFirstName = new javax.swing.JLabel();
        lblPLastName = new javax.swing.JLabel();
        lblPPhoneNum = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPAge = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPSsn = new javax.swing.JLabel();
        txtPFirstName = new javax.swing.JTextField();
        txtPLastName = new javax.swing.JTextField();
        txtPPhoneNum = new javax.swing.JTextField();
        txtPAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblPFirstNameErr = new javax.swing.JLabel();
        lblPLastNameErr = new javax.swing.JLabel();
        lblPPhoneNumErr = new javax.swing.JLabel();
        lblPAgeErr = new javax.swing.JLabel();
        lblPHeightErr = new javax.swing.JLabel();
        lblPWeightErr = new javax.swing.JLabel();
        lblPSsnErr = new javax.swing.JLabel();
        txtPSsn = new javax.swing.JFormattedTextField();
        lblPDobErr = new javax.swing.JLabel();
        lblPHouseName = new javax.swing.JLabel();
        txtPHouseName = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 255));

        lblCityName.setForeground(new java.awt.Color(0, 102, 102));
        lblCityName.setText("Select City");

        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });

        lblCommunity.setForeground(new java.awt.Color(0, 102, 102));
        lblCommunity.setText("Select Community");

        cmbCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCommunityActionPerformed(evt);
            }
        });

        btnSavePerson.setForeground(new java.awt.Color(0, 102, 102));
        btnSavePerson.setText("Save");
        btnSavePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePersonActionPerformed(evt);
            }
        });

        lblPDemographics.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPDemographics.setForeground(new java.awt.Color(0, 102, 102));
        lblPDemographics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPDemographics.setText("Enter Person Details");

        lblPFirstName.setForeground(new java.awt.Color(0, 102, 102));
        lblPFirstName.setText("First Name");

        lblPLastName.setForeground(new java.awt.Color(0, 102, 102));
        lblPLastName.setText("Last Name");

        lblPPhoneNum.setForeground(new java.awt.Color(0, 102, 102));
        lblPPhoneNum.setText("Phone Number");

        lblGender.setForeground(new java.awt.Color(0, 102, 102));
        lblGender.setText("Gender");

        lblPAge.setForeground(new java.awt.Color(0, 102, 102));
        lblPAge.setText("Age");

        lblEmail.setForeground(new java.awt.Color(0, 102, 102));
        lblEmail.setText("Email");

        lblPSsn.setForeground(new java.awt.Color(0, 102, 102));
        lblPSsn.setText("SSN");

        txtPFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPFirstNameActionPerformed(evt);
            }
        });
        txtPFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPFirstNameKeyReleased(evt);
            }
        });

        txtPLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPLastNameActionPerformed(evt);
            }
        });
        txtPLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPLastNameKeyReleased(evt);
            }
        });

        txtPPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPPhoneNumActionPerformed(evt);
            }
        });
        txtPPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPPhoneNumKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPPhoneNumKeyReleased(evt);
            }
        });

        txtPAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPAgeActionPerformed(evt);
            }
        });
        txtPAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPAgeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPAgeKeyReleased(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lblPFirstNameErr.setForeground(new java.awt.Color(255, 0, 0));

        lblPLastNameErr.setForeground(new java.awt.Color(255, 0, 0));

        lblPPhoneNumErr.setForeground(new java.awt.Color(255, 0, 0));

        lblPAgeErr.setForeground(new java.awt.Color(255, 0, 0));

        lblPHeightErr.setForeground(new java.awt.Color(255, 0, 0));

        lblPWeightErr.setForeground(new java.awt.Color(255, 0, 0));

        lblPSsnErr.setForeground(new java.awt.Color(255, 0, 0));

        try {
            txtPSsn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPSsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPSsnActionPerformed(evt);
            }
        });
        txtPSsn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPSsnKeyReleased(evt);
            }
        });

        lblPDobErr.setForeground(new java.awt.Color(255, 0, 0));

        lblPHouseName.setForeground(new java.awt.Color(0, 102, 102));
        lblPHouseName.setText("House Name");

        txtPHouseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPHouseNameActionPerformed(evt);
            }
        });
        txtPHouseName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPHouseNameKeyReleased(evt);
            }
        });

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Others" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPAge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail)
                            .addComponent(lblPSsn))
                        .addGap(514, 514, 514)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPAgeErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPHeightErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPWeightErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPSsnErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(120, 120, 120)
                                .addComponent(lblPDobErr, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPFirstNameErr, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(lblPLastNameErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPPhoneNumErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblPPhoneNum)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPPhoneNum))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbCity, 0, 137, Short.MAX_VALUE)
                                            .addComponent(cmbCommunity, 0, 137, Short.MAX_VALUE)
                                            .addComponent(txtPHouseName, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblPFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                            .addComponent(lblPLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPFirstName)
                                            .addComponent(txtPLastName)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail)
                                    .addComponent(txtPSsn)
                                    .addComponent(txtPAge, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSavePerson)
                            .addComponent(lblPHouseName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPDemographics, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbCity, cmbCommunity, txtEmail, txtPFirstName, txtPHouseName, txtPLastName, txtPPhoneNum, txtPSsn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(lblPFirstNameErr)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPLastNameErr)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblPPhoneNumErr)))
                .addGap(23, 23, 23)
                .addComponent(lblPDobErr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPAgeErr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPHeightErr)
                .addGap(33, 33, 33)
                .addComponent(lblPWeightErr)
                .addGap(17, 17, 17)
                .addComponent(lblPSsnErr)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPDemographics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityName)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPHouseName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPHouseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtPFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSavePerson)
                .addGap(0, 108, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCityName, lblCommunity, lblEmail, lblGender, lblPAge, lblPFirstName, lblPHouseName, lblPLastName, lblPPhoneNum, lblPSsn});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbCity, cmbCommunity, txtEmail, txtPAge, txtPFirstName, txtPHouseName, txtPLastName, txtPPhoneNum, txtPSsn});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSavePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePersonActionPerformed
        // TODO add your handling code here:

        int phoneNum;
        int age;
        int socialSecNum;
        String Gender;
        String Email;
        Person personDemographics = new Person();
        if (((City) cmbCity.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "City not present", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (((Community) cmbCommunity.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Community not present int he city", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (ValidFields()) {
            
                phoneNum = Integer.parseInt(txtPPhoneNum.getText());
                age = Integer.parseInt(txtPAge.getText());
                socialSecNum = Integer.parseInt(txtPSsn.getText().replace("-", ""));

                Gender = cmbGender.getSelectedItem().toString();
                Email = txtEmail.getText();
                //dob = txtPDob.getDate();
                
         
            
            if (!(txtPFirstName.getText().matches("^[a-zA-Z]*$"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid first name. First name can only contain alphabets", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (!(txtPLastName.getText().matches("^[a-zA-Z]*$"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid last name. Last name can only contain alphabets", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
             else if (!(txtPAge.getText().matches("\\d{1,3}"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid age.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            /*else if (!(txtPPhoneNum.getText().matches("\\\\d{0,12}"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid Phone Number.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }*/
            else if (!(txtEmail.getText().matches("\\d{1,3}"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid weight.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else if (!(txtPSsn.getText().matches("^(?!666|000|9\\d{2})\\d{3}"
                + "-(?!00)\\d{2}-"
                + "(?!0{4})\\d{4}$"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid SSN.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            
            personDemographics.setFirstName(txtPFirstName.getText());
            personDemographics.setLastName(txtPLastName.getText());
            personDemographics.setPhoneNumber(phoneNum);
            personDemographics.setCity(cmbCity.getSelectedItem().toString());
            personDemographics.setCommunity(cmbCommunity.getSelectedItem().toString());
            personDemographics.setAge(age);
            personDemographics.setGender(Gender);
            personDemographics.setEmail(Email);
            personDemographics.setSocialSecurityNum(socialSecNum);

            House house = ((House) ((Community) cmbCommunity.getSelectedItem()).getEnteredHouse(txtPHouseName.getText()));

            if (house == null) {
                JOptionPane.showMessageDialog(this, "House not present in the community", "Info", JOptionPane.WARNING_MESSAGE);
                return;
            }
            personDemographics = house.addHousePerson(personDemographics);
            if(personDemographics != null) {
                PersonDirectory.addPerson(personDemographics);
            }

            if (personDemographics == null) {
                JOptionPane.showMessageDialog(this, "Person woth same Social security number already present", "Info", JOptionPane.WARNING_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(this, "Person demographics added");
        }
    }//GEN-LAST:event_btnSavePersonActionPerformed

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
        populateCommunityCombo();
    }//GEN-LAST:event_cmbCityActionPerformed

    private void txtPFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPFirstNameKeyReleased
        // TODO add your handling code here:
        String pattern = "^[a-zA-Z]{1,30}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtPFirstName.getText());
        if (!match.matches()) {
            //lblPFirstNameErr.setText("Incorrect firstname");
            txtPFirstName.setBackground(Color.red);
          

        } else {
            lblPFirstNameErr.setText(null);
            txtPFirstName.setBackground(null);
        }
    }//GEN-LAST:event_txtPFirstNameKeyReleased

    private void txtPFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPFirstNameActionPerformed

    private void txtPLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPLastNameKeyReleased
        // TODO add your handling code here:
        String pattern = "^[a-zA-Z]{1,30}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtPLastName.getText());
        if (!match.matches()) {
            //lblPLastNameErr.setText("Incorrect last name");
            txtPLastName.setBackground(Color.red);
        } else {
            lblPLastNameErr.setText(null);
            txtPLastName.setBackground(null);
        }
    }//GEN-LAST:event_txtPLastNameKeyReleased

    private void txtPLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPLastNameActionPerformed

    private void txtPAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPAgeKeyReleased
        // TODO add your handling code here:
        String agePattern = "\\d{1,3}";
        Pattern patt = Pattern.compile(agePattern);
        Matcher match = patt.matcher(txtPAge.getText());
        if (!match.matches()) {
            //lblPAgeErr.setText("Incorrect age");
            txtPAge.setBackground(Color.red);
        } else {
            lblPAgeErr.setText(null);
            txtPAge.setBackground(null);
        }
    }//GEN-LAST:event_txtPAgeKeyReleased

    private void txtPAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPAgeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAgeKeyPressed

    private void txtPAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPAgeActionPerformed

    private void txtPPhoneNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPPhoneNumKeyReleased
        // TODO add your handling code here:
        
        String phonePattern = "\\d{0,12}";
        Pattern patt = Pattern.compile(phonePattern);
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || ((evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) || (evt.getKeyCode() == KeyEvent.VK_DELETE))) {
            txtPPhoneNum.setEditable(true);
        } else {
            txtPPhoneNum.setEditable(false);
        }
        Matcher match = patt.matcher(txtPPhoneNum.getText());
        if (!match.matches()) {
            //lblPPhoneNumErr.setText("Incorrect phone number");
            txtPPhoneNum.setBackground(Color.red);
        } else {
            lblPPhoneNumErr.setText(null);
            txtPPhoneNum.setBackground(null);
        }
    }//GEN-LAST:event_txtPPhoneNumKeyReleased

    private void txtPPhoneNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPPhoneNumKeyPressed
        // TODO add your handling code here:
        //        String pattern = "^[0-9]{0,12}$";
    }//GEN-LAST:event_txtPPhoneNumKeyPressed

    private void txtPPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPPhoneNumActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String pattern = "^[-?\\d+(\\.\\d+)?]{0,30}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtEmail.getText());
        if (!match.matches()) {
            //lblPWeightErr.setText("Incorrect weight format");
            txtEmail.setBackground(Color.red);
        } else {
            lblPWeightErr.setText(null);
            txtEmail.setBackground(null);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPSsnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPSsnKeyReleased
        // TODO add your handling code here:
        String regex = "^(?!666|000|9\\d{2})\\d{3}"
                + "-(?!00)\\d{2}-"
                + "(?!0{4})\\d{4}$";
        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(txtPSsn.getText());
        if (!match.matches()) {
            //lblPSsnErr.setText("Incorrect social security number");
            txtPSsn.setBackground(Color.red);
        } else {
            lblPSsnErr.setText(null);
            txtPSsn.setBackground(null);
        }
    }//GEN-LAST:event_txtPSsnKeyReleased

    private void txtPHouseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPHouseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPHouseNameActionPerformed

    private void txtPHouseNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPHouseNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPHouseNameKeyReleased

    private void cmbCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCommunityActionPerformed

    private void txtPSsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPSsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPSsnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePerson;
    private javax.swing.JComboBox cmbCity;
    private javax.swing.JComboBox cmbCommunity;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JLabel lblCityName;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPAge;
    private javax.swing.JLabel lblPAgeErr;
    private javax.swing.JLabel lblPDemographics;
    private javax.swing.JLabel lblPDobErr;
    private javax.swing.JLabel lblPFirstName;
    private javax.swing.JLabel lblPFirstNameErr;
    private javax.swing.JLabel lblPHeightErr;
    private javax.swing.JLabel lblPHouseName;
    private javax.swing.JLabel lblPLastName;
    private javax.swing.JLabel lblPLastNameErr;
    private javax.swing.JLabel lblPPhoneNum;
    private javax.swing.JLabel lblPPhoneNumErr;
    private javax.swing.JLabel lblPSsn;
    private javax.swing.JLabel lblPSsnErr;
    private javax.swing.JLabel lblPWeightErr;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPAge;
    private javax.swing.JTextField txtPFirstName;
    private javax.swing.JTextField txtPHouseName;
    private javax.swing.JTextField txtPLastName;
    private javax.swing.JTextField txtPPhoneNum;
    private javax.swing.JFormattedTextField txtPSsn;
    // End of variables declaration//GEN-END:variables

    public void populateCityCombo() {
        cmbCity.removeAllItems();
        for (City s : cityDirectory.getCities()) {
            cmbCity.addItem(s);
        }
    }

    private void populateCommunityCombo() {
        cmbCommunity.removeAllItems();
        if (cmbCity.getSelectedItem() != null) {
            for (Community s : ((City) cmbCity.getSelectedItem()).getCityData().getCommunities()) {
                cmbCommunity.addItem(s);
            }
        }
    }

    private boolean ValidFields() {
        if (!validField(txtPFirstName, "Please enter the first name")) {
            return false;
        } else if (!validField(txtPLastName, "Please enter the last name")) {
            return false;
        } else if (!validField(txtPPhoneNum, "Please enter the phone number")) {
            return false;
         //else if (txtPDob.getDate() == null) {
            //JOptionPane.showMessageDialog(this, "Please enter the date of birth");
            //return false;
        } else if (!validField(txtPAge, "Please enter the age")) {
            return false;
        } else if (!validField(txtEmail, "Please enter the weight")) {
            return false;
        } else if (txtPSsn.getText().replace("-", "").trim().length() == 0) {//(!validField( txtPSsn, "Please enter the Social security number")) {
            JOptionPane.showMessageDialog(this, "Please enter the Social security number");
            return false;
        }
        return true;
    }

    private boolean validField(JTextField fieldName, String errorMsg) {
        if (fieldName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, errorMsg);
            return false;
        }
        return true;
    }
}
