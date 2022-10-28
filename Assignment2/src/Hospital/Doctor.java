/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author dhruv
 */
public class Doctor extends Person {
    
    private String Hospital;
    private String Speciality;
    private String docCommunity;
    private String docCity;

    public String getDocCommunity() {
        return docCommunity;
    }

    public void setDocCommunity(String docCommunity) {
        this.docCommunity = docCommunity;
    }

    public String getDocCity() {
        return docCity;
    }

    public void setDocCity(String docCity) {
        this.docCity = docCity;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    public String getdocCommunity() {
        return docCommunity;
    }

    public void setdocCommunity(String Community) {
        this.docCommunity = Community;
    }
    
    @Override
    public String toString() {
        return Hospital;
    }
    
    
}
