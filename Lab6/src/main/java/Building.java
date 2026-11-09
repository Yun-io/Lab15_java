public class Building {
    private String address;
    private int floors;
    private double totalArea;

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double averageAreaPerFloor() {
        if (floors <= 0) {
            return 0;
        }
        return totalArea / floors;
    }

    public static void main(String[] args) {
        Building myBuilding = new Building("ул. Ленина, д. 10", 5, 2500.50);

        System.out.println("Адрес: " + myBuilding.getAddress());
        System.out.println("Этажей: " + myBuilding.getFloors());
        System.out.println("Общая площадь: " + myBuilding.getTotalArea());
        System.out.println("Средняя площадь этажа: " + myBuilding.averageAreaPerFloor());

        myBuilding.setFloors(6);
        myBuilding.setTotalArea(3000.0);

        System.out.println("Новая средняя площадь этажа: " + myBuilding.averageAreaPerFloor());
    }
}
