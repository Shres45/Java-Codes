public abstract class AbstractProduct {
    int product_id;
    String title;
    double price;

    AbstractProduct(int id, String title, double price) {
        this.product_id = id;
        this.title = title;
        this.price = price;
    }

    abstract void display();
}

class TravelGuide extends AbstractProduct {
    String author;

    TravelGuide(int id, String title, double price, String author) {
        super(id, title, price);
        this.author = author;
    }

    void display() {
        System.out.println("Travel Guide Book");
        System.out.println(product_id + " " + title + " " + price + " " + author);
    }
}

class CD extends AbstractProduct {
    String singer;

    CD(int id, String title, double price, String singer) {
        super(id, title, price);
        this.singer = singer;
    }

    void display() {
        System.out.println("CD");
        System.out.println(product_id + " " + title + " " + price + " " + singer);
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractProduct p;

        p = new TravelGuide(1, "Goa Guide", 500, "Ramesh");
        p.display();

        p = new CD(2, "Hits Album", 300, "Arijit");
        p.display();
    }
}