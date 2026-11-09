class OfficePC extends Computer {
    private double monitorSize;

    public OfficePC(String processor, int ram, int storage, double monitorSize) {
        super(processor, ram, storage);
        this.monitorSize = monitorSize;
    }

    @Override
    public String getPerformance() {
        return "Средняя";
    }

    @Override
    public String getPurpose() {
        return "Для офисной работы";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Монитор: " + monitorSize + "\" | Назначение: " + getPurpose());
    }
}