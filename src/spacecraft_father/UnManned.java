package spacecraft_father;

import spacecraft_grandfather.SpaceCraft;

/**
 * @author FelipeQG
 * Clase padre para las naves no tripuladas
 */
public class UnManned extends SpaceCraft {

    private String objective;

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }
}
