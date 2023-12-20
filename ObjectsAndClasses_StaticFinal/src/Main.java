public class Main {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("type1", true, 342);
        RAM ram = new RAM("type", 86, 78);
        Monitor monitor = new Monitor(MonitorType.IPS, 32, 43);
        Storage storage = new Storage(StorageType.HDD, 38, 34);
        Processor processor = new Processor("manufacturer", 3, 5, 50);
        Computer computer = new Computer("vendor", "name", processor, keyboard, ram, monitor, storage);

        Keyboard keyboard2 = new Keyboard("type2", true, 34);
        RAM ram2 = new RAM("type", 80, 80);
        Monitor monitor2 = new Monitor(MonitorType.TN, 30, 40);
        Storage storage2 = new Storage(StorageType.HDD, 40, 30);
        Processor processor2 = new Processor("manufacturer2", 5, 4, 60);
        Computer computer2 = new Computer("vendor2", "name2", processor2, keyboard2, ram2, monitor2, storage2);

        System.out.println(computer);
        System.out.println();
        System.out.println(computer2);
    }
}