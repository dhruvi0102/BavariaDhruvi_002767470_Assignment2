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
public class DoctorDirectory {
    private static ArrayList<Doctor> doctors;

    public DoctorDirectory() {
        doctors = new ArrayList<>();
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public static void setDoctors(ArrayList<Doctor> doctor) {
        DoctorDirectory.doctors = doctor;
    }

    public static Doctor searchDoctor(String ssn) {
        return doctors.stream().filter(o -> String.valueOf(o.getSocialSecurityNum()).equals(String.valueOf(ssn))).
                findFirst().orElse(null);
    }

    public static Person addDoctor(Doctor newDoctor) {
        if (doctors != null && !doctors.stream().anyMatch(o -> String.valueOf(o.getSocialSecurityNum()).equals(String.valueOf(newDoctor.getSocialSecurityNum())))) {
            doctors.add(newDoctor);
            return newDoctor;
        } else if (doctors == null) {
            doctors.add(newDoctor);
            return newDoctor;
        }
        return null;
    }
    
    public Doctor addnewDoctor() {
        Doctor newDoctor = new Doctor();
        doctors.add(newDoctor);
        return newDoctor;
    }

    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }
}
