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
public class Community {

    private String name;
    private ArrayList<House> houses;

    public Community() {
        houses = new ArrayList<House>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    public House addHouse(House newHouse) {
        if (houses != null && !houses.stream().anyMatch(o -> String.valueOf(o.getHouseName()).equals(String.valueOf(newHouse.getHouseName())))) {
            houses.add(newHouse);
            return newHouse;
        } else if (houses == null) {
            houses.add(newHouse);
            return newHouse;
        }
        return null;
    }

    public void removeHouse(House house) {
        houses.remove(house);
    }
    
    public House getEnteredHouse(String houseName) {
        return houses.stream().filter(o -> String.valueOf(o.getHouseName()).equals(String.valueOf(houseName))).
                findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return name;
    }

}
