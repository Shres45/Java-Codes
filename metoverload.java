public class metoverload {
    void Area(int s){
        System.out.println("Area of square= "+ (s*s));
    }
    void Area(int l, int b){
        System.out.println("Area of rectangle= "+ (l*b));
    }
    void Area(double r){
        System.out.println("Area of circle= "+ (3.14*r*r));
    }

    public static void main(String[] args) {
        metoverload obj1= new metoverload();
        metoverload obj2= new metoverload();
        metoverload obj3= new metoverload();
        obj1.Area(5);
        obj2.Area(13,2);
        obj3.Area(10.5);
    }
}
