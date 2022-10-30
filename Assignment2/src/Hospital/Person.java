/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author dhruv
 */
public class Person {
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private int age;
    private String Gender;
    private int socialSecurityNum;
    private String Community;
    private String Category;

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    private String City;
    private Image personPicture;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public int getSocialSecurityNum() {
        return socialSecurityNum;
    }

    public void setSocialSecurityNum(int socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }

    public Image getPersonPicture() {
        return personPicture;
    }

    public void setPersonPicture(Image personPicture) {
        this.personPicture = personPicture;
    }
    
    @Override
    public String toString() {
        return firstName;
    }
}
