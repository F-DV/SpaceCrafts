package main.java.spacecraft_father;

import main.java.spacecraft_grandfather.SpaceCraft;

/**
 * @author FelipeQG
 * Clase padre para las lanzaderas, estas pueden llevar al espacio
 * carga o tripulación
 */
public class Shuttle extends SpaceCraft {

    private String usefulLoad;

    public String getUsefulLoad() {
        return usefulLoad;
    }

    public void setUsefulLoad(String usefulLoad) {
        this.usefulLoad = usefulLoad;
    }

}
