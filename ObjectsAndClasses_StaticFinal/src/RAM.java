public class RAM {
    private final String type;
    private final int memory;
    private final double weight;
    public RAM (String type, int memory, double weight) {
        this.type = type;
        this.memory = memory;
        this.weight = weight;
    }
    public String getType() {return type;}
    public int getMemory() {return memory;}
    public double getWeight() {return weight;}

}
