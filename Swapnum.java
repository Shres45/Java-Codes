import java.util.Scanner;

public class Swapnum {
    int num;
    Swapnum(int n){
        num = n;
    }
    void Swap(Swapnum s){
        int temp = num;
        num = s.num;
        s.num = temp;
    }
    void show()
    {
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A= ");
        int a = sc.nextInt();
        System.out.println("Enter B= ");
        int b= sc.nextInt();
        System.out.println("Before Swapping: A= "+a+" B= "+b);
        Swapnum obj1 = new Swapnum(a);
        Swapnum obj2 = new Swapnum(b);
        obj1.Swap(obj2);
        System.out.println("After Swapping: ");
        System.out.print("A= ");
        obj1.show();
        System.out.print("B= ");
        obj2.show();
        sc.close();
    }
}
