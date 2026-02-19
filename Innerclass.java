class Outer {
        void display(){
            System.out.println("Hello world");
        }
class Inner extends Outer{
    void show(){
        System.out.println("Hello world from Inner class");
    }
}
}
public class Innerclass{
    public static void main(String[] args) {
        Outer obj= new Outer();
        obj.display();
        Outer.Inner obj2= obj.new Inner();
        obj2.display();
        obj2.show();
    }
}
