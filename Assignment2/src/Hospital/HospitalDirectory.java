/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author dhruv
 */
public class HospitalDirectory {
     private static ArrayList<Hospital> hospital_details;

    public static ArrayList<Hospital> getHospital_details() {
        return hospital_details;
    }

    public static void setHospital_details(ArrayList<Hospital> hospital_details) {
        HospitalDirectory.hospital_details = hospital_details;
    }
    public HospitalDirectory() {
        hospital_details = new ArrayList<>();
    }
   
   
    public Hospital addNewData(){
       
        Hospital hospitalDemographicInfo = new Hospital();
        hospital_details.add(hospitalDemographicInfo);
        return hospitalDemographicInfo;
    }
   
    public void deleteHospital(Hospital hospitalDemographicInfo){
        hospital_details.remove(hospitalDemographicInfo);
 
    }
}
