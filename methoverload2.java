public class methoverload2 {
    void Perimeter(int s){
        System.out.println("Area of square= "+ (4*s));
    }
    void Perimeter(int l, int b){
        System.out.println("Area of rectangle= "+ (2*(l+b)));
    }
    void Perimeter(double r){
        System.out.println("Area of circle= "+ (3.14*r*2));
    }

    public static void main(String[] args) {
        methoverload2 obj1= new methoverload2();
        methoverload2 obj2= new methoverload2();
        methoverload2 obj3= new methoverload2();
        obj1.Perimeter(10);
        obj2.Perimeter(15,16);
        obj3.Perimeter(15.5);
    }
}
