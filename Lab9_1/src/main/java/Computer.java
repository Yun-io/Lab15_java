abstract class Computer {
    private String processor;
    private int ram;
    private int storage;

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public abstract String getPerformance();
    public abstract String getPurpose();

    public void displayInfo() {
        System.out.print("Процессор: " + processor + ", ОЗУ: " + ram + " ГБ, Накопитель: " + storage + " ГБ");
    }

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        computers[0] = new GamingPC("Intel i9", 32, 2000, "NVIDIA RTX 4090");
        computers[1] = new GamingPC("AMD Ryzen 7", 16, 1000, "AMD Radeon RX 7800 XT");

        computers[2] = new OfficePC("Intel i3", 8, 256, 21.5);
        computers[3] = new OfficePC("AMD Ryzen 3", 8, 512, 23.8);
        computers[4] = new OfficePC("Intel i5", 16, 512, 27.0);

        for (Computer c : computers) {
            c.displayInfo();
            System.out.println("Производительность: " + c.getPerformance());
        }
    }
}