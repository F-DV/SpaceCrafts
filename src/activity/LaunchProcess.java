package activity;

public interface LaunchProcess {

    public void refuel() throws InterruptedException;
    public void strongbackRetract() throws InterruptedException;
    public void startup() throws InterruptedException;
    public void liftoff() throws InterruptedException;
}
