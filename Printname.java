import java.util.*;
class Printname{
    void display(String name){
        System.out.println("My name is : "+name);
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String nam=sc.nextLine();
        Printname obj= new Printname();
        obj.display(nam);
        sc.close();
    }
}