/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital;

import Hospital.City;
import Hospital.CityDirectory;
import Hospital.Community;
import Hospital.Hospital;
import Hospital.HospitalDirectory;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dhruv
 */
public class AddHospitalInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddHospitalInfoJPanel
     */
    
    JPanel mainWorkArea;
    CityDirectory cityDirectory;
    HospitalDirectory hospitalDirectory;
    Hospital hospitalInfo;
    
    AddHospitalInfoJPanel(JPanel mainWorkArea, CityDirectory cityDirectory,HospitalDirectory hospitalDirectory) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.cityDirectory = cityDirectory;
        this.hospitalDirectory= hospitalDirectory;
        //cmbCity.setSelectedItem(null);
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

        lblSelectCity = new javax.swing.JLabel();
        lblSelectCommunity = new javax.swing.JLabel();
        cmbCommunity = new javax.swing.JComboBox();
        lblHospitalName = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        lblHospitalAdd = new javax.swing.JLabel();
        lblCreateHospital = new javax.swing.JLabel();
        btnSaveHospital = new javax.swing.JButton();
        cmbCity = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(204, 204, 255));

        lblSelectCity.setForeground(new java.awt.Color(0, 102, 102));
        lblSelectCity.setText("Select City:");

        lblSelectCommunity.setForeground(new java.awt.Color(0, 102, 102));
        lblSelectCommunity.setText("Select Community:");

        lblHospitalName.setForeground(new java.awt.Color(0, 102, 102));
        lblHospitalName.setText("Hospital Name:");

        txtHospitalName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHospitalNameKeyReleased(evt);
            }
        });

        lblCreateHospital.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCreateHospital.setForeground(new java.awt.Color(0, 102, 102));
        lblCreateHospital.setText("Add Hospital Details");

        btnSaveHospital.setText("Save");
        btnSaveHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHospitalActionPerformed(evt);
            }
        });

        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateHospital)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSelectCity)
                        .addGap(52, 52, 52)
                        .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSelectCommunity)
                            .addComponent(lblHospitalName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblHospitalAdd)
                    .addComponent(btnSaveHospital))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCreateHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectCity)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectCommunity)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalName)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveHospital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHospitalAdd)
                .addContainerGap(363, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHospitalActionPerformed
        // TODO add your handling code here:
        String Hospital_Name=txtHospitalName.getText();
        String City = cmbCity.getSelectedItem().toString();
        String Community= cmbCommunity.getSelectedItem().toString();
        
        Hospital Hospital_details= hospitalDirectory.addNewData();
        
        /*if (!(txtHospitalName.getText().matches("^[a-zA-Z]*$"))) {
                JOptionPane.showMessageDialog(this, "Please enter valid hospital name.", "Info", JOptionPane.INFORMATION_MESSAGE);
                return;
         }*/
        
        Hospital_details.setCity(City);
        Hospital_details.setCommunity(Community);
        Hospital_details.setHospital_Name(Hospital_Name);
      
        JOptionPane.showMessageDialog(this, "Hospital demographics added");
       
        txtHospitalName.setText("");
    }//GEN-LAST:event_btnSaveHospitalActionPerformed

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
        populateCommunityCombo();
    }//GEN-LAST:event_cmbCityActionPerformed

    private void txtHospitalNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHospitalNameKeyReleased
        // TODO add your handling code here:
        /*String pattern = "^[a-zA-Z]{1,30}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(txtHospitalName.getText());
        if (!match.matches()) {
            txtHospitalName.setBackground(Color.red);
        } else {
            txtHospitalName.setBackground(Color.white);
        }*/
    }//GEN-LAST:event_txtHospitalNameKeyReleased
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveHospital;
    private javax.swing.JComboBox cmbCity;
    private javax.swing.JComboBox cmbCommunity;
    private javax.swing.JLabel lblCreateHospital;
    private javax.swing.JLabel lblHospitalAdd;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblSelectCity;
    private javax.swing.JLabel lblSelectCommunity;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables

    private void populateCityCombo() {
        
        cmbCity.removeAllItems();
        for(City c: cityDirectory.getCities()){
            cmbCity.addItem(c);
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
        if(!validField(txtHospitalName,"Please Enter Hospital Name")){
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
