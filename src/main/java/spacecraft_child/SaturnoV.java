package main.java.spacecraft_child;

import main.java.activity.LaunchProcessImp;
import main.java.spacecraft_father.Shuttle;

/**
 * @author: FelipeQG
 * Creación del SaturnoV
 */
public class SaturnoV extends Shuttle {

    private boolean isParametersReady = false;
    LaunchProcessImp launchProcessImp = new LaunchProcessImp();

    /**
     * Constructor que define los atributos
     * propios del SaturnoV
     * @param usefulLoad : Carga util que enviara la lanzadera, "Tripulacion" o "Carga"
     */
    public SaturnoV(String usefulLoad){
        super.setName("SaturnoV");
        super.setNationality("EEUU");
        super.setYearOfActivity("1973");
        super.setGas("H.Liq");
        super.setOxidizing("O.Liq");
        super.setUsefulLoad(usefulLoad);

    }

    /**
     * Metodo para orquestar el lanzamiento de la nave espacial
     */
    public boolean launch() throws InterruptedException {
        int number = 0;
        boolean flag= true;

        while(flag){
            switch (number){
                case 0:
                    launchProcessImp.refuel(2000,5);
                    break;
                case 1:
                    launchProcessImp.strongbackRetract(1000,3);
                    break;
                case 2:
                    isParametersReady = launchProcessImp.startup();
                    if(isParametersReady){
                        launchProcessImp.liftoff(5);
                    }
                default:
                    flag = false;
                    break;
            }
            number++;
        }
        if(isParametersReady){
            return true;
        }
        return false;
    }
}
