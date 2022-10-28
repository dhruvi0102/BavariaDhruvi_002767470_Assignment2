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
public class PersonDirectory {
       private static List<Person> people;

    public PersonDirectory() {
        people = new ArrayList<>();
    }

    public static List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        PersonDirectory.people = people;
    } 
    public static Person addPerson(Person newPerson) {
        if (people != null && !people.stream().anyMatch(o -> String.valueOf(o.getSocialSecurityNum()).equals(String.valueOf(newPerson.getSocialSecurityNum())))) {
            people.add(newPerson);
            return newPerson;
        } else if (people == null) {
            people.add(newPerson);
            return newPerson;
        }
        return null;
    }
}
