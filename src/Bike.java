import java.util.Objects;

class Bike {

   private String brand;
   private String wheels;




    public Bike(String brand, String wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    public Bike(){

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;
        Bike bike = (Bike) o;
        return wheels == bike.wheels &&
                Objects.equals(brand, bike.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, wheels);
    }
}
