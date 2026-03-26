class Point{
    int a,b;
    Point(int a,int b){
        this.a= a;
        this.b= b;

    }
    void displayp(){
        System.out.print("Center point is(" + a + "," + b + ")");
    }
}
    class Circle{
    double r;
    Point c;
    Circle(double r, int a, int b){
        this.r=r;
        c=new Point(a,b);
    }
    void displaya(){
        double area= Math.PI*r*r;
        c.displayp();
        System.out.print("Area of the circle is"+ area);
    }
}
public class Area{
        public static  void main(String[] args){
            Circle c = new Circle(3,4,5);
            c.displaya();
        }
}