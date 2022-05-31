package spacecraft_child;

import activity.LaunchProcess;
import spacecraft_father.Shuttle;

import java.util.Timer;
import java.util.TimerTask;


public class SaturnoV extends Shuttle implements LaunchProcess {

    private boolean isRefuel = false;
    private boolean isStrongbackRetract = false;

    /**
     * Constructor
     */
    public SaturnoV() {

    }

    /**
     * SobreCarga del metodo Constructor
     * @param name
     * @param nationality
     * @param yearOfActivity
     * @param gas
     * @param oxidizing
     */
    public SaturnoV(String name,String nationality,String yearOfActivity,String gas,String oxidizing){
        super.setName(name);
        super.setNationality(nationality);
        super.setYearOfActivity(yearOfActivity);
        super.setGas(gas);
        super.setOxidizing(oxidizing);
    }

    /**
     * Metodo para el lanzamiento de la nave espacial
     */
    public void launch() throws InterruptedException {
        int number = 0;
        boolean flag= true;
        while(flag){
            switch (number){
                case 0:
                    refuel();
                    break;
                case 1:
                    strongbackRetract();
                    break;
                case 2:
                    startup();
                    break;
                case 3:
                    liftoff();
                    break;
                default:
                    flag = false;
                    break;
            }
            number++;
        }

    }
    public void timer(int time){

    }

    @Override
    public void refuel() throws InterruptedException {
        int period = 2000;
        int countdown = 5;
        System.out.println("Cargando combustible...");
        Timer gasTimer = new Timer();
        TimerTask gasTask = new TimerTask() {
            int time = 0;
            @Override
            public void run() {
                System.out.print(time + " ");
                if (time >= countdown) {
                    isRefuel = true;
                    System.out.println(" ");
                    gasTimer.cancel();
                }

                time++;
            }

        };
        gasTimer.schedule(gasTask,0,period);
        Thread.sleep(period * (countdown + 1));
    }

    @Override
    public void strongbackRetract() throws InterruptedException {
        int period = 1000;
        int countdown = 3;
        System.out.println("Retrayendo Brazo...");
        Timer retractTimer = new Timer();
        TimerTask retractTask = new TimerTask() {
            int time = 0;
            @Override
            public void run() {
                System.out.print(time + " ");
                if (time >= countdown) {
                    isStrongbackRetract = true;
                    System.out.println(" ");
                    retractTimer.cancel();
                }

                time++;
            }
        };
        retractTimer.schedule(retractTask,0,period);
        Thread.sleep(period * (countdown + 1));

    }

    @Override
    public void startup() throws InterruptedException {
        int cheking = 3000;

        System.out.println("Verificando Parametros...");
        Thread.sleep(cheking);
        if (isRefuel && isStrongbackRetract){

        }
    }

    @Override
    public void liftoff() throws InterruptedException {
        int delay = 5;
        int cuenta = 5;
        int period = 1000;
        System.out.println("Despegue en...");
        Timer launchTimer = new Timer();
        TimerTask launchTask = new TimerTask() {
            int time = 0;
            int countdown = 5;
            @Override
            public void run() {
                System.out.println(countdown);
                if (time >= delay) {
                    isRefuel = true;
                    launchTimer.cancel();
                }
                time++;
                countdown--;

            }

        };
        launchTimer.schedule(launchTask,0,period);
        Thread.sleep(delay * (period+1));
    }
}
