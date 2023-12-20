public class Monitor {
    private final MonitorType type;
    private final int diagonal;
    private final double weight;

    public Monitor(MonitorType type, int diagonal, double weight) {
        this.type = type;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public MonitorType getType() {
        return type;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public double getWeight() {
        return weight;
    }
}