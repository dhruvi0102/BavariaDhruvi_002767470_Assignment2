/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import Hospital.City;
import Hospital.CityDirectory;
import Hospital.Community;
import Hospital.House;
import Hospital.Person;
import Hospital.PersonDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author dhruv
 */
public class PeopleTableJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PeopleTableJPanel
     */
    JPanel workAreaJPanel;
    CityDirectory cityDirectory;
    Person selectedPerson;
    PersonDirectory personDirectory;
//    public PeopleTableJPanel() {
//        initComponents();
//    }

    PeopleTableJPanel(JPanel workAreaJPanel, CityDirectory cityDirectory,PersonDirectory personDirectory) {
        initComponents();
        this.workAreaJPanel = workAreaJPanel;
        this.cityDirectory = cityDirectory;
        this.personDirectory=personDirectory;
        selectedPerson = new Person();
        populatePeopleTable();
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

        btnPeopleSearch = new javax.swing.JButton();
        cmbCommunity = new javax.swing.JComboBox();
        cmbCity = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeopleTable = new javax.swing.JTable();
        btnPersonUpdate = new javax.swing.JButton();
        lblSearchPeople = new javax.swing.JLabel();
        txtSearchBySSN = new javax.swing.JTextField();
        btnPersonView = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLName = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblPHouseName1 = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblFName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();

        btnPeopleSearch.setText("Search");
        btnPeopleSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeopleSearchActionPerformed(evt);
            }
        });

        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(204, 204, 255));

        tblPeopleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "FirstName", "LastName", "SSN", "Phone Number", "City", "Community", "Age", "Gender", "Email", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPeopleTable);

        btnPersonUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnPersonUpdate.setText("UPDATE");
        btnPersonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonUpdateActionPerformed(evt);
            }
        });

        lblSearchPeople.setText("Search By SSN:");

        txtSearchBySSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBySSNActionPerformed(evt);
            }
        });

        btnPersonView.setForeground(new java.awt.Color(0, 102, 102));
        btnPersonView.setText("VIEW");
        btnPersonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonViewActionPerformed(evt);
            }
        });

        btnDeletePerson.setForeground(new java.awt.Color(0, 102, 102));
        btnDeletePerson.setText("DELETE");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        lblCity.setForeground(new java.awt.Color(0, 102, 102));
        lblCity.setText("City:");

        lblAge.setForeground(new java.awt.Color(0, 102, 102));
        lblAge.setText("Age:");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        lblGender.setForeground(new java.awt.Color(0, 102, 102));
        lblGender.setText("Gender:");

        lblEmail.setForeground(new java.awt.Color(0, 102, 102));
        lblEmail.setText("Email:");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lblLName.setForeground(new java.awt.Color(0, 102, 102));
        lblLName.setText("LastName:");

        lblCommunity.setForeground(new java.awt.Color(0, 102, 102));
        lblCommunity.setText("Community:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        lblSSN.setForeground(new java.awt.Color(0, 102, 102));
        lblSSN.setText("SSN:");

        txtSSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSSNKeyReleased(evt);
            }
        });

        lblFName.setForeground(new java.awt.Color(0, 102, 102));
        lblFName.setText("FirstName:");

        txtFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFNameKeyReleased(evt);
            }
        });

        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCommunityKeyReleased(evt);
            }
        });

        txtLName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLNameKeyReleased(evt);
            }
        });

        lblPhoneNumber.setForeground(new java.awt.Color(0, 102, 102));
        lblPhoneNumber.setText("Phone Number:");

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });

        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenderKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCommunity)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity)
                                .addGap(171, 171, 171)
                                .addComponent(lblPHouseName1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblAge)
                            .addComponent(lblFName)
                            .addComponent(lblLName)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSSN)
                                    .addGap(63, 63, 63)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(lblGender))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addContainerGap(416, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPersonUpdate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSearchPeople)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearchBySSN, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnPersonView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeletePerson)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchPeople)
                    .addComponent(txtSearchBySSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPersonUpdate)
                    .addComponent(btnPersonView)
                    .addComponent(btnDeletePerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFName)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLName)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPHouseName1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPeopleSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleSearchActionPerformed
        // TODO add your handling code here:
        //        ((City)cmbCity.getSelectedItem()).getCityData().getCommunities().get
        if(((City) cmbCity.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "City not present", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(((Community) cmbCommunity.getSelectedItem()) == null) {
            JOptionPane.showMessageDialog(this, "Community not present int he city", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }
        House house = ((House) ((Community) cmbCommunity.getSelectedItem()).getEnteredHouse(txtCity.getText()));
        if (house == null) {
            JOptionPane.showMessageDialog(this, "House not present in the community", "Info", JOptionPane.WARNING_MESSAGE);
            return;
        }
        List<Person> personList = house.getPeople();
        populatePeopleTable();
    }//GEN-LAST:event_btnPeopleSearchActionPerformed

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
        populateCommunityCombo();
    }//GEN-LAST:event_cmbCityActionPerformed

    private void btnPersonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonUpdateActionPerformed
        // TODO add your handling code here:
        int i= tblPeopleTable.getSelectedRow();
        if(i<0){
           JOptionPane.showMessageDialog(null,"Error"); 
        }
        
        else{
            //Get the data for textfields:
            DefaultTableModel model= (DefaultTableModel)tblPeopleTable.getModel();
            
            String FirstName= txtFName.getText();
            String LastName= txtLName.getText();
            int SSN= Integer.parseInt(txtSSN.getText());           
            String City= txtCity.getText();
            String Community= txtCommunity.getText();
            //int Mobile_Number= Integer.parseInt(txtPhoneNumber.getText());
            int Age = Integer.parseInt(txtAge.getText());
            String Gender = txtGender.getText();
            String Email = txtEmail.getText();
            String Contact =txtPhoneNumber.getText();
            String ssnCheck = txtSSN.getText();
            
            if (!(txtFName.getText().matches("^[A-Za-z ]*$"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid first name. First name can only contain alphabets", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (!(txtLName.getText().matches("^[A-Za-z ]*$"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid last name. Last name can only contain alphabets", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else if(!(Contact.matches("^[0-9]*$") && Contact.length() == 10)){
                    JOptionPane.showMessageDialog(null, "Please enter correct Phone Number.");
                    return;
            }
            else if (!(txtEmail.getText().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid email.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else if (!(ssnCheck.matches("^[0-9]*$") && ssnCheck.length() == 9)) {
                JOptionPane.showMessageDialog(this, "Please enter valid SSN.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else if (!(Age >= 1 && Age<=150)) {
                JOptionPane.showMessageDialog(this, "Please enter valid age.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else if (!(txtGender.getText().matches("^[A-Za-z ]*$"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid gender.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            
            //set updated value on table row
            model.setValueAt(FirstName, tblPeopleTable.getSelectedRow(),0);
            model.setValueAt(LastName, tblPeopleTable.getSelectedRow(),1);
            model.setValueAt(SSN, tblPeopleTable.getSelectedRow(),2);
            model.setValueAt(Contact, tblPeopleTable.getSelectedRow(),3);
            model.setValueAt(City, tblPeopleTable.getSelectedRow(),4);
            model.setValueAt(Community, tblPeopleTable.getSelectedRow(),5);
            model.setValueAt(Age,tblPeopleTable.getSelectedRow(),6);
            model.setValueAt(Gender,tblPeopleTable.getSelectedRow(),7);
            model.setValueAt(Email,tblPeopleTable.getSelectedRow(),8);
            
            // After successfully setting, display the data:
            JOptionPane.showMessageDialog(null,"Update Successful!");
 
        }
        
    }//GEN-LAST:event_btnPersonUpdateActionPerformed

    private void btnPersonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonViewActionPerformed
        // TODO add your handling code here:
           int i= tblPeopleTable.getSelectedRow();
        if(i<0){
            JOptionPane.showMessageDialog(this,"Error");
                    return;
        }
            DefaultTableModel model= (DefaultTableModel)tblPeopleTable.getModel();
            Person selectedPerson = (Person) model.getValueAt(i,0);
            //set the data in textfields on clicking view button:
            
            txtSSN.setText(String.valueOf(selectedPerson.getSocialSecurityNum()));
            txtFName.setText(selectedPerson.getFirstName());
            txtLName.setText(selectedPerson.getLastName());
            txtCommunity.setText(selectedPerson.getCommunity());
            txtCity.setText(selectedPerson.getCity());
            txtPhoneNumber.setText(String.valueOf(selectedPerson.getPhoneNumber()));
            txtAge.setText(String.valueOf(selectedPerson.getAge()));
            txtGender.setText(String.valueOf(selectedPerson.getGender()));
            txtEmail.setText(String.valueOf(selectedPerson.getEmail()));
        
    }//GEN-LAST:event_btnPersonViewActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
        int i= tblPeopleTable.getSelectedRow();
        
        if(i<0){
            JOptionPane.showMessageDialog(null,"Please select a record to view."); 
        }
        
        else{
            
            DefaultTableModel model= (DefaultTableModel)tblPeopleTable.getModel();
            //Demographic demo = (Demographic) model.getValueAt(i,0);
            //previous_data.deleteEmployee(demo);
            
            //here j is variable of employee which is selected!
            String j= model.getValueAt(i,0).toString();
            personDirectory.getPeople().remove(i);
            model.removeRow(i);
            JOptionPane.showMessageDialog(null,"Record Deleted");
            
            populatePeopleTable();  
            //removing data textfield values from the display bars:
            
            txtSSN.setText("");
            txtFName.setText("");
            txtLName.setText("");
            txtCommunity.setText("");
            txtCity.setText("");
            txtPhoneNumber.setText("");
        }
        
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    private void txtSearchBySSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBySSNActionPerformed
        // TODO add your handling code here:
        
        String matchName = txtSearchBySSN.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblPeopleTable.getModel();
        model.setRowCount(0);
        
        for(Person person: personDirectory.getPeople()) {
            
            String n = String.valueOf(person.getSocialSecurityNum());
            
            if(n.equals(matchName)) {
              
                Object[] row = new Object[10];
                
                row[0] = person;
                row[1] = person.getLastName();
                row[2] = person.getSocialSecurityNum();
                row[3] = person.getPhoneNumber();
                row[4] = person.getCity();
                row[5] = person.getCommunity();
                row[6] = person.getAge();
                row[7] = person.getGender();
                row[8] = person.getEmail();
                row [9] = person.getCategory();
                
            model.addRow(row); 
            //clearing the field
            txtSearchBySSN.setText("");
            }
    } 
        
    }//GEN-LAST:event_txtSearchBySSNActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        String pattern = "^[A-Za-z ]*$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtCity.getText());
        if (!match.matches()) {
            txtCity.setBackground(Color.red);
        } else {
            txtCity.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtSSNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNKeyReleased
        // TODO add your handling code here:
        String SSN = txtSSN.getText();
        String regex = "^[0-9]*$";
        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(txtSSN.getText());
        if (!(match.matches() && SSN.length() == 9)) {
            //lblPSsnErr.setText("Incorrect social security number");
            txtSSN.setBackground(Color.red);
        } else {
            txtSSN.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtSSNKeyReleased

    private void txtFNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFNameKeyReleased
        // TODO add your handling code here:
        String pattern = "^[A-Za-z ]*$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtFName.getText());
        if (!match.matches()) {
            //lblPFirstNameErr.setText("Incorrect firstname");
            txtFName.setBackground(Color.red);
        } else {
            txtFName.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtFNameKeyReleased

    private void txtLNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLNameKeyReleased
        // TODO add your handling code here:
        String pattern = "^[A-Za-z ]*$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtLName.getText());
        if (!match.matches()) {
            //lblPLastNameErr.setText("Incorrect last name");
            txtLName.setBackground(Color.red);
        } else {
            txtLName.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtLNameKeyReleased

    private void txtCommunityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyReleased
        // TODO add your handling code here:
        String pattern = "^[A-Za-z ]*$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtCommunity.getText());
        if (!match.matches()) {
            txtCommunity.setBackground(Color.red);
        } else {
            txtCommunity.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtCommunityKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        int age = Integer.parseInt(txtAge.getText());
        if(!(age >= 1 && age <= 150)){
            txtAge.setBackground(Color.red);
        }else{
            txtAge.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyReleased
        // TODO add your handling code here:
        String pattern = "^[A-Za-z ]*$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtGender.getText());
        if (!match.matches()) {
            txtGender.setBackground(Color.red);
        } else {
            txtGender.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtGenderKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtEmail.getText());
        if (!match.matches()) {
            //lblPWeightErr.setText("Incorrect weight format");
            txtEmail.setBackground(Color.red);
        } else {
            txtEmail.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        // TODO add your handling code here:
        String phonePattern = "^[0-9]*$";
        Pattern patt = Pattern.compile(phonePattern);
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || ((evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) || (evt.getKeyCode() == KeyEvent.VK_DELETE))) {
            txtPhoneNumber.setEditable(true);
        } else {
            txtPhoneNumber.setEditable(false);
        }
        Matcher match = patt.matcher(txtPhoneNumber.getText());
        String Contact = txtPhoneNumber.getText();
        if (!(match.matches() && Contact.length() == 10)) {
            txtPhoneNumber.setBackground(Color.red);
        } else {
            //txtPhoneNumber.setText(null);
            txtPhoneNumber.setBackground(Color.white);
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnPeopleSearch;
    private javax.swing.JButton btnPersonUpdate;
    private javax.swing.JButton btnPersonView;
    private javax.swing.JComboBox cmbCity;
    private javax.swing.JComboBox cmbCommunity;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblPHouseName1;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblSearchPeople;
    private javax.swing.JTable tblPeopleTable;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtSearchBySSN;
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

    private void populatePeopleTable() {

            DefaultTableModel model = (DefaultTableModel) tblPeopleTable.getModel();
            model.setRowCount(0);
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            for (Person person : personDirectory.getPeople()) {
                Object[] row = new Object[10];
                
                row[0] = person;
                row[1] = person.getLastName();
                row[2] = person.getSocialSecurityNum();
                row[3] = person.getPhoneNumber();
                row[4] = person.getCity();
                row[5] = person.getCommunity();
                row[6] = person.getAge();
                row[7] = person.getGender();
                row[8] = person.getEmail();
                row[9] = person.getCategory();
                model.addRow(row);
            }

        } 

}
