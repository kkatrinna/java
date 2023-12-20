public class Processor {
    private final String manufacturer;
    private final int frequency;
    private final double weight;
    private final int numberCores;
    public Processor (String manufacturer, int frequency, int numberCores, double weight) {
        this.manufacturer = manufacturer;
        this.frequency = frequency;
        this.weight = weight;
        this.numberCores = numberCores;
    }

    public String getManufacturer() {return manufacturer;}
    public int getFrequency() {return frequency;}
    public int getNumberCores() {return numberCores;}
    public int getWeight() {return (int) weight;}

}
