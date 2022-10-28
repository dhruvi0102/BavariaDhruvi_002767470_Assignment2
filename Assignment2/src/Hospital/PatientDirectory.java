/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhruv
 */
public class PatientDirectory {

    private static List<Patient> patients;

    public PatientDirectory() {
        patients = new ArrayList<>();
    }

    public static List<Patient> getPatients() {
        return patients;
    }

    public static void setPatients(List<Patient> patients) {
        PatientDirectory.patients = patients;
    }

    public static Patient searchPatient(String ssn) {
        return patients.stream().filter(o -> String.valueOf(o.getSocialSecurityNum()).equals(String.valueOf(ssn))).
                findFirst().orElse(null);
    }

    public static Person addPatient(Patient newPatient) {
        if (patients != null && !patients.stream().anyMatch(o -> String.valueOf(o.getSocialSecurityNum()).equals(String.valueOf(newPatient.getSocialSecurityNum())))) {
            patients.add(newPatient);
            return newPatient;
        } else if (patients == null) {
            patients.add(newPatient);
            return newPatient;
        }
        return null;
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

}
