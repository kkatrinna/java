public class Keyboard {
    private final String type;
    private final boolean illumination;
    private final double weight;
    public Keyboard(String type, boolean illumination, int weight) {
        this.type = type;
        this.illumination = illumination;
        this.weight = weight;
    }
    public String getType() {return type;}

    public boolean getIllumination() {
        return illumination;
    }
    public double getWeight() {
        return weight;
    }

}
