/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Hospital.CityDirectory;
import Hospital.DoctorDirectory;
import Hospital.HospitalDirectory;
import Hospital.PatientDirectory;
import Hospital.PersonDirectory;
import java.awt.Component;
import ui.city.CityWorkAreaJPanel;
import ui.doctor.DoctorWorkAreaJPanel;
import ui.doctorSearch.DoctorSearchforPatientsJPanel;
import ui.hospital.HospitalWorkAreaJPanel;
import ui.patient.PatientWorkAreaJPanel;
import ui.person.AddPersonInfoJPanel;


/**
 *
 * @author dhruv
 */
public class MainScreen extends javax.swing.JPanel {

    /**
     * Creates new form MainScreen
     */
    JPanel mainWorkArea;
    CityDirectory cityDirectory;
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospital_details;
   // public MainScreen() {
    //   initComponents();
    // }

    public MainScreen(JPanel mainWorkArea, CityDirectory cityDirectory, PersonDirectory personDirectory, PatientDirectory patientDirectory, DoctorDirectory doctorDirectory,HospitalDirectory hospital_details) {
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.cityDirectory = cityDirectory;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
        this.hospital_details = hospital_details;
        setSize(800,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEncounter = new javax.swing.JButton();
        btnPerson = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        btnHospital = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnDoctorSearch = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        btnEncounter.setForeground(new java.awt.Color(0, 102, 102));
        btnEncounter.setText("Encounter (Doctor)");
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });

        btnPerson.setForeground(new java.awt.Color(0, 102, 102));
        btnPerson.setText("Person ");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        btnCommunity.setForeground(new java.awt.Color(0, 102, 102));
        btnCommunity.setText("Community");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        btnHospital.setForeground(new java.awt.Color(0, 102, 102));
        btnHospital.setText("Hospital");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        btnDoctor.setForeground(new java.awt.Color(0, 102, 102));
        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnDoctorSearch.setForeground(new java.awt.Color(0, 102, 102));
        btnDoctorSearch.setText("Doctor Search");
        btnDoctorSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDoctorSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoctorSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(271, 271, 271))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void AssignRole (String role){
        if(role.equals("SystemAdmin")){
            btnDoctor.setVisible(true);
            btnPerson.setVisible(true);
            btnCommunity.setVisible(true);
            btnHospital.setVisible(true);
            btnEncounter.setVisible(true);
            btnDoctorSearch.setVisible(true);
        }else if (role.equals("Patient")){
            btnDoctor.setVisible(false);
            btnDoctorSearch.setVisible(true);
            btnCommunity.setVisible(false);
            btnHospital.setVisible(false);
            btnEncounter.setVisible(false);
            btnPerson.setVisible(false);
        }else if (role.equals("Doctor")){
            btnDoctor.setVisible(false);
            btnDoctorSearch.setVisible(false);
            btnCommunity.setVisible(false);
            btnHospital.setVisible(false);
            btnEncounter.setVisible(true);
            btnPerson.setVisible(false);
        }else if (role.equals("HospitalAdmin")){
            btnDoctor.setVisible(false);
            btnDoctorSearch.setVisible(true);
            btnCommunity.setVisible(false);
            btnHospital.setVisible(true);
            btnEncounter.setVisible(true);
            btnPerson.setVisible(false);
        }
        
    }
    
    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
        // TODO add your handling code here:
        CityWorkAreaJPanel cwjp = new CityWorkAreaJPanel(mainWorkArea, cityDirectory);
        mainWorkArea.add("WordAreaJPanel", cwjp);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnCommunityActionPerformed

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        PersonWorkAreaJPanel pwajp = new PersonWorkAreaJPanel(mainWorkArea, cityDirectory, personDirectory);
        mainWorkArea.add("PersonWorkAreaJPanel", pwajp);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        // TODO add your handling code here:
        PatientWorkAreaJPanel pwajp = new PatientWorkAreaJPanel(mainWorkArea, cityDirectory, patientDirectory);
        mainWorkArea.add("PatientWorkAreaJPanel", pwajp);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnEncounterActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        HospitalWorkAreaJPanel vcvijp = new HospitalWorkAreaJPanel(mainWorkArea, cityDirectory,hospital_details);
        mainWorkArea.add("ViewCommnityVitalInfoJPanel", vcvijp);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
        
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        DoctorWorkAreaJPanel vcvijp = new DoctorWorkAreaJPanel(mainWorkArea, cityDirectory, doctorDirectory,hospital_details);
        mainWorkArea.add("ViewCommnityVitalInfoJPanel", vcvijp);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnDoctorSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorSearchActionPerformed
        // TODO add your handling code here:
        DoctorSearchforPatientsJPanel dsearch = new DoctorSearchforPatientsJPanel(mainWorkArea, cityDirectory, doctorDirectory);
        mainWorkArea.add("ViewCommnityVitalInfoJPanel", dsearch);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnDoctorSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnDoctorSearch;
    private javax.swing.JButton btnEncounter;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnPerson;
    // End of variables declaration//GEN-END:variables

     
}
