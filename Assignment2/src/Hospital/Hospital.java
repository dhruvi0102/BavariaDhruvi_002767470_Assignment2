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
public class Hospital {
    
     private String Hospital_Name;
    private String Address;
    private int Pincode;
    private List<Person> people;
    private String City;
    private String Community;

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public int getPincode() {
        return Pincode;
    }

    public void setPincode(int Pincode) {
        this.Pincode = Pincode;
    }

    public String getHospital_Name() {
        return Hospital_Name;
    }

    public void setHospital_Name(String Hospital_Name) {
        this.Hospital_Name = Hospital_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
   
    public Hospital() {
        people = new ArrayList<>();
    }
   
    public Person addHospital(Person newPerson) {
        if (people != null && !people.stream().anyMatch(o -> String.valueOf(o.getSocialSecurityNum()).equals(String.valueOf(newPerson.getSocialSecurityNum())))) {
            people.add(newPerson);
            return newPerson;
        } else if (people == null) {
            people.add(newPerson);
            return newPerson;
        }
        return null;
    }

    public void removeHousePerson(Person person) {
        people.remove(person);
    }

    @Override
    public String toString() {
        return Hospital_Name;
    }
    
}
