package se.lexicon;

public class Car {
    String brandName;
    String modelName;
    int speed;
    String color;
    String ownerName;
    String registerNumber;
    Car(String brandName, String modelName, int speed, String color, String ownerName,
        String registerNumber) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        this.registerNumber = registerNumber;
    }
    public static void displayDetails(Car carObject) {
        System.out.println("Brand Name: "+carObject.brandName);
        System.out.println("Model Name: "+carObject.modelName);
        System.out.println("Speed: "+carObject.speed);
        System.out.println("Color: "+carObject.color);
        System.out.println("Owner Name: "+carObject.ownerName);
        System.out.println("Registration Number: "+carObject.registerNumber);
    }
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "V60", 100, "Red", "John", "SE1051");
        Car car2 = new Car("Volvo", "S60", 120, "Black", "Peter", "SE1222");
        System.out.println("Car1 Details:");
        displayDetails(car1);
        System.out.println();
        System.out.println("Car2 Details:");
        displayDetails(car2);
    }
}
