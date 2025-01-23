public class Phone {

    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String call(String number) {
        return "The number " + number + " is being called.";
    }
}