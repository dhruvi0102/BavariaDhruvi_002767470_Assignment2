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
public class House {

    private String houseName;
    private List<Person> people;

    public House() {
        people = new ArrayList<>();
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public Person addHousePerson(Person newPerson) {
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
        return houseName;
    }

}
