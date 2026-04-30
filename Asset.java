abstract class Asset {
    abstract void displayDetails();
}

class Stock extends Asset {
    void displayDetails() {
        System.out.println("This is Stock Asset");
    }
}

class Bond extends Asset {
    void displayDetails() {
        System.out.println("This is Bond Asset");
    }
}

class Savings extends Asset {
    void displayDetails() {
        System.out.println("This is Savings Asset");
    }
}

public class Main {
    public static void main(String[] args) {
        Asset a;

        a = new Stock();
        a.displayDetails();

        a = new Bond();
        a.displayDetails();

        a = new Savings();
        a.displayDetails();
    }
}
