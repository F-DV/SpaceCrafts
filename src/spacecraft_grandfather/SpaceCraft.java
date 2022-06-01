package spacecraft_grandfather;

/**
 * @author FelipeQG
 * Clase padre para los tipos de naves espaciales
 */
public abstract class SpaceCraft {
    private String name;
    private String nationality;
    private String yearOfActivity;
    private String gas;
    private String oxidizing;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getYearOfActivity() {
        return yearOfActivity;
    }

    public void setYearOfActivity(String yearOfActivity) {
        this.yearOfActivity = yearOfActivity;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getOxidizing() {
        return oxidizing;
    }

    public void setOxidizing(String oxidizing) {
        this.oxidizing = oxidizing;
    }

    @Override
    public String toString() {
        return "SpaceCraft{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfActivity='" + yearOfActivity + '\'' +
                ", Fuel='" + gas + " + " + oxidizing + '\'' +
                '}';
    }
}
