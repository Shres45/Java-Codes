class Calculator {
    void calc(){
        int a=10 , b=20;
        System.out.println("The sum of 2 numbers are: "+(a+b));
    }
}
class Substraction extends Calculator{
    void calc(){
        int a=10,b=20;
        System.out.println("The substaction of two numbers are: "+(a-b));
    }
}
class Multiplication extends Calculator{
    void calc(){
        int a=10,b=20;
        System.out.println("The multiplication of two numbers are: "+(a*b));
    }
}
public class metoverride{
    public static void main(String [] args){
        Calculator obj;
        obj= new Calculator();
        obj.calc();
        obj = new Substraction();
        obj.calc();
        obj = new Multiplication();
        obj.calc();
    }
}