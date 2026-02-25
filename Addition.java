import java.util.*;
public class Addition {
    void sum(int n1, int n2){
        int c =  n1+n2;
        System.out.println("The sum is : "+c);
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        Addition obj= new Addition();
        obj.sum(a,b);
        sc.close();
    }
}
