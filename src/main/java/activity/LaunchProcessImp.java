package main.java.activity;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author FelipeQG
 * Implementa y da funcionalidad al proceso antes del despegue
 */
public class LaunchProcessImp implements LaunchProcess{

    private boolean isRefuel = false;
    private boolean isStrongbackRetract = false;
    private boolean isStartup = false;

    public LaunchProcessImp() {
    }

    @Override
    public boolean refuel(int period,int count) throws InterruptedException {
        System.out.println("Cargando combustible...");
        Timer gasTimer = new Timer();
        TimerTask gasTask = new TimerTask() {

            int time = 0;

            @Override
            public void run() {
                System.out.print(time + " ");
                if (time >= count) {
                    isRefuel = true;
                    System.out.println(" ");
                    gasTimer.cancel();
                }else {
                    isRefuel = false;
                }

                time++;
            }
        };
        gasTimer.schedule(gasTask,0,period);
        Thread.sleep(period * (count + 1));
        return isRefuel;
    }

    @Override
    public boolean strongbackRetract(int period,int count) throws InterruptedException {
        System.out.println("Retrayendo Brazo...");

        Timer retractTimer = new Timer();
        TimerTask retractTask = new TimerTask() {
            int time = 0;

            @Override
            public void run() {
                System.out.print(time + " ");
                if (time >= count && isRefuel) {
                    isStrongbackRetract = true;
                    System.out.println(" ");
                    retractTimer.cancel();
                }else{
                    isStrongbackRetract = false;
                }

                time++;
            }
        };
        retractTimer.schedule(retractTask,0,period);
        Thread.sleep(period * (count + 1));
        return isStrongbackRetract;
    }

    @Override
    public boolean startup() throws InterruptedException {
        int cheking = 3000;

        System.out.println("Verificando Parametros...");
        Thread.sleep(cheking);

        if (isRefuel && isStrongbackRetract){
            isStartup = true;
        }
        System.out.println("Todo listo!!");
        return isStartup;
    }

    @Override
    public void liftoff(int countdown) throws InterruptedException {

        int period = 1000;

        System.out.println("Despegue en...");
        Timer launchTimer = new Timer();
        TimerTask launchTask = new TimerTask() {
            int time = 0;
            int count = countdown;
            @Override
            public void run() {
                System.out.println(count);
                if (time >= countdown) {
                    launchTimer.cancel();
                }
                time++;
                count--;
            }
        };
        launchTimer.schedule(launchTask,0,period);
        Thread.sleep(countdown * (period+1));
    }
}
