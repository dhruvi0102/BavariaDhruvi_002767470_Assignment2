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
public class EncounterHistory {

    private ArrayList<VitalSigns> encounterHistory;

    public EncounterHistory() {
        encounterHistory = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<VitalSigns> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public VitalSigns addnewVitals() {
        VitalSigns newVitals = new VitalSigns();
        encounterHistory.add(newVitals);
        return newVitals;
    }

    public void deleteVitals(VitalSigns vs) {
        encounterHistory.remove(vs);
    }
}
