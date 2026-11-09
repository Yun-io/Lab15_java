public class City {
    private String name;
    private String country;
    private int population;

    private static int totalCities = 0;
    private static int totalPopulation = 0;

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
        totalCities++;
        totalPopulation += population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        totalPopulation = totalPopulation - this.population + population;
        this.population = population;
    }

    public static int getTotalCities() {
        return totalCities;
    }

    public static int getTotalPopulation() {
        return totalPopulation;
    }

    public static double getAveragePopulation() {
        if (totalCities == 0) {
            return 0;
        }
        return (double) totalPopulation / totalCities;
    }

    public static void test1(City city){
        System.out.println(city.name + city.country + city.population);
        System.out.println(totalCities);
        System.out.println(totalPopulation);
    }

    public  void test2(){
        System.out.println(this.name + this.country + this.population);
        System.out.println(totalCities);
        System.out.println(totalPopulation);
    }

    public static void main(String[] args) {
        City city1 = new City("Токио", "Япония", 3740);
        City city2 = new City("Дели", "Индия", 2930);
        City city3 = new City("Шанхай", "Китай", 2630);
        City city4 = new City("Бразилиа", "Бразилия", 2180);

        System.out.println("Город: " + city1.getName() + ", Страна: " + city1.getCountry());
        System.out.printf("Исходное ср. н.: %.2f\n", getAveragePopulation());

        city2.setPopulation(3000);

        System.out.println("Новое н. " + city2.getName() + ": " + city2.getPopulation());
        System.out.println("Общее н.: " + getTotalPopulation());
        System.out.printf("Новое ср. н.: %.2f\n", getAveragePopulation());
    }
}

