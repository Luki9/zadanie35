import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Bike {

    private String brand;
    private String wheels;


    public Bike(String brand, String wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    public Bike() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

     static Bike createBike() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę");
        String brand = scanner.nextLine();
        System.out.println("Podaj liczbę kół");
        String wheels = scanner.nextLine();

        Bike bike = new Bike(brand, wheels);
        return bike;
    }

    static boolean check(Bike[] bikes, Bike bike) {
        return Arrays.asList(bikes).contains(bike);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;
        Bike bike = (Bike) o;
        return Objects.equals(brand, bike.brand) &&
                Objects.equals(wheels, bike.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, wheels);
    }
}

