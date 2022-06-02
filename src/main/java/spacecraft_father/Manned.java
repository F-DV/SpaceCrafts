package main.java.spacecraft_father;

import main.java.spacecraft_grandfather.SpaceCraft;

/**
 * @author FelipeQG
 * Clase padre para la naves Tripuladas
 */
public class Manned extends SpaceCraft {

    //Numero de tripulantes
    private int numberOfCrew;

    public int getNumberOfCrew() {
        return numberOfCrew;
    }

    public void setNumberOfCrew(int numberOfCrew) {
        this.numberOfCrew = numberOfCrew;
    }
}
