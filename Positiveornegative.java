import java.util.Scanner;

public class Positiveornegative {
    Positiveornegative(int n){
        if(n>0){
            System.out.println("The number "+n+" is positive....");
        }
        else if(n<0){
            System.out.println("The number "+n+" is Negative....");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int a= sc.nextInt();
        Positiveornegative obj = new Positiveornegative(a);
        sc.close();
    }
}
