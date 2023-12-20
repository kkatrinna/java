public class Computer {
    private final String vendor;
    private final String name;
    private double totalWeight;
    private Processor processor;
    private Keyboard keyboard;
    private RAM ram;
    private Monitor monitor;
    private Storage storage;

    public Computer(String vendor, String name, Processor processor, Keyboard keyboard, RAM ram, Monitor monitor, Storage storage) {
        this.vendor = vendor;
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.keyboard = keyboard;
        this.processor = processor;
        this.monitor = monitor;
    }
    public String getName() {return name;}
    public String getVendor() {return vendor;}
    public Keyboard getKeyboard() {return keyboard;}
    public Processor getProcessor() {return processor;}
    public RAM getRam() {return ram;}
    public Monitor getMonitor() {return monitor;}
    public Storage getStorage() {return storage;}
    public double getTotalWeight() {
        return totalWeight = keyboard.getWeight() + processor.getWeight()
                + ram.getWeight() + monitor.getWeight() + storage.getWeight();
    }
    public void setProcessor(Processor processor) {this.processor = processor;}
    public void setKeyboard(Keyboard keyboard) {this.keyboard = keyboard;}
    public void setRam(RAM ram) {this.ram = ram;}

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public void setStorage(Storage storage) {this.storage = storage;}
    public void setTotalWeight(double totalWeight) {
        this.totalWeight=totalWeight;
    }
    public String toString() {
       return "Компьютер: " + name + "\n" +
              "Производитель: " + vendor + "\n"
               + "Процессор: " + "\n"
                + " частота: " + processor.getFrequency() + "\n"
                + " производитель: " + processor.getManufacturer() +"\n"
                + " Количество ядер: " + processor.getNumberCores() + "\n"
                + " вес: " + processor.getWeight() +"\n"
               + "Оперативная память: " + "\n"
                + " тип: " + ram.getType() +"\n"
                + " объем: " + ram.getMemory() +"\n"
                + " вес: " + ram.getWeight() +"\n"
               + "Монитор: " + "\n"
                + " тип: " + monitor.getType() +"\n"
                + " диагональ: " + monitor.getDiagonal()
                + " вес: " + monitor.getWeight() +"\n"
               + "Накопитель информации: " +"\n"
                + " тип: " + storage.getType() + "\n"
                + " объем: " + storage.getMemory()+"\n"
                + " вес: " + storage.getWeight() +"\n"
               + "клавиатура: " + "\n"
                + " тип: " + keyboard.getType() +"\n"
                + " наличие подсветки: " + keyboard.getIllumination() +"\n"
                + " вес: " + keyboard.getWeight()+ "\n"
               + "Общий вес ПК: " + getTotalWeight();
    }
}
