package spacecraft_child;

import activity.LaunchProcessImp;
import spacecraft_father.UnManned;

/**
 * @author FelipeQG
 * Creación de la Voyager1
 */
public class Voyage1 extends UnManned {

    private boolean isParametersReady = false;
    LaunchProcessImp launchProcessImp = new LaunchProcessImp();

    /**
     * Define los atributos propios de la nave espacial
     * Voyager1
     * @param objetive : planeta de destino
     */
    public Voyage1(String objetive) {
        super.setName("Voyager1");
        super.setNationality("EEUU");
        super.setYearOfActivity("1975");
        super.setGas("N.comp");
        super.setOxidizing("H2H4");
        super.setObjective(objetive);
    }

    /**
     * Metodo para orquestar el lanzamiento de la nave espacial
     */
    public void launch() throws InterruptedException {
        int number = 0;
        boolean flag= true;

        while(flag){
            switch (number){
                case 0:
                    launchProcessImp.refuel(1000,3);
                    break;
                case 1:
                    launchProcessImp.strongbackRetract(1000,2);
                    break;
                case 2:
                    isParametersReady = launchProcessImp.startup();
                    if(isParametersReady){
                        launchProcessImp.liftoff(10);
                    }
                default:
                    flag = false;
                    break;
            }
            number++;
        }
    }

}
