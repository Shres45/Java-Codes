public abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String name, int number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String name, int number, double price, double discountRate) {
        super(name, number, price);
        this.discountRate = discountRate;
    }

    void discount() {
        double discount = modelPrice * discountRate / 100;
        System.out.println("Discount = " + discount);
    }

    void display() {
        System.out.println("Car Name = " + modelName);
        System.out.println("Model Number = " + modelNumber);
        System.out.println("Price = " + modelPrice);
        System.out.println("Discount Rate = " + discountRate);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW", 2024, 5000000, 10);

        c.display();
        c.discount();
    }
}
