package spacecraft_child;

import activity.LaunchProcess;
import spacecraft_father.Shuttle;


public class SaturnoV extends Shuttle implements LaunchProcess {

    public SaturnoV() {

    }

    public boolean launch(){
        refuel();
        strongbackRetract();
        startup();
        liftoff();
        return true;
    }

    @Override
    public void refuel() {
        System.out.println("Cargando combustible...");
    }

    @Override
    public void strongbackRetract() {;
        System.out.println("Retrayendo Brazo..");
    }

    @Override
    public void startup() {
        System.out.println("Parametros en regla...");
    }

    @Override
    public void liftoff() {
        System.out.println("Despegue...");

    }
}
