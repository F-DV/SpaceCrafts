package activity;

/**
 * @author FelipeQG
 *
 * Interfaz para definir que se debe hacer en el proceso de despegue
 */
public interface LaunchProcess {

    /**
     *
     * @param period : cuantos segundos demora cada paso
     * @param count : recibe los pasos de carga de combustible de la nave
     * @return : Si la carga de combustible fue exitosa o no
     * @throws InterruptedException
     */
    public boolean refuel(int period,int count) throws InterruptedException;

    /**
     *
     * @param period : cuantos segundos demora cada paso
     * @param count : recibe los pasos para retraer el brazo o soporte hacia la nave
     * @return : Si el proceso de retracción es exitoso o no
     * @throws InterruptedException
     */
    public boolean strongbackRetract(int period,int count) throws InterruptedException;

    /**
     * verificación que la carga de combustible y la retracción del soporte fueron exitosas
     * @return : Si todos los parametros estan en regla o no
     * @throws InterruptedException
     */
    public boolean startup() throws InterruptedException;

    /**
     * Cuenta regresiva para el lanzamiento
     * @param countdown : Recibe desde que segundo empezar la cuenta regresiva
     * @throws InterruptedException
     */
    public void liftoff(int countdown) throws InterruptedException;
}
