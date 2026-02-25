public class Area {
    void display(double length, double width){
        double area = length * width;
        System.out.println("Area of Rectangle is : "+area);
        double perimeter = 2*(length+width);
        System.out.println("Perimeter of Rectangle is : "+perimeter);
    }
    public static void main(String [] args){
        Area obj = new Area();
        obj.display(12,13);
    }
}
