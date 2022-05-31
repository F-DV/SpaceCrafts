package spacecraft_father;

import spacecraft_grandfather.SpaceCraft;

public class Shuttle extends SpaceCraft {

    private String usefulLoad;

    public String getUsefulLoad() {
        return usefulLoad;
    }

    public void setUsefulLoad(String usefulLoad) {
        this.usefulLoad = usefulLoad;
    }
}
