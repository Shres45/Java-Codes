import java.util.Scanner;

abstract class ThreeDObject {
    abstract void wholeSurfaceArea();
    abstract void volume();
}

class Box extends ThreeDObject {
    double l, b, h;

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void wholeSurfaceArea() {
        System.out.println("Box Surface Area = " + (2 * (l*b + b*h + h*l)));
    }

    void volume() {
        System.out.println("Box Volume = " + (l * b * h));
    }
}

class Cube extends ThreeDObject {
    double a;

    Cube(double a) {
        this.a = a;
    }

    void wholeSurfaceArea() {
        System.out.println("Cube Surface Area = " + (6 * a * a));
    }

    void volume() {
        System.out.println("Cube Volume = " + (a * a * a));
    }
}

class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void wholeSurfaceArea() {
        System.out.println("Cylinder Surface Area = " + (2 * 3.14 * r * (r + h)));
    }

    void volume() {
        System.out.println("Cylinder Volume = " + (3.14 * r * r * h));
    }
}

class Cone extends ThreeDObject {
    double r, h, l;

    Cone(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    void wholeSurfaceArea() {
        System.out.println("Cone Surface Area = " + (3.14 * r * (r + l)));
    }

    void volume() {
        System.out.println("Cone Volume = " + ((1.0/3) * 3.14 * r * r * h));
    }
}

public class Main {
    public static void main(String[] args) {
        ThreeDObject obj;

        obj = new Box(2, 3, 4);
        obj.wholeSurfaceArea();
        obj.volume();

        obj = new Cube(5);
        obj.wholeSurfaceArea();
        obj.volume();
    }
}