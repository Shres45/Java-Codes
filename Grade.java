import java.util.Scanner;

public class Grade {
    int marks;
    Grade(int n){
        marks = n;
        System.out.println("Grade is : ");
        if(marks >=80){
            System.out.println("A");
        }
        else if (marks >=70 && marks < 80) {
            System.out.println("B");
        }
        else if (marks >=60 && marks < 70) {
            System.out.println("C");
        }
        else if (marks >= 50 && marks <60) {
            System.out.println("D");
        }
        else if (marks >=40 && marks <50) {
            System.out.println("E");
        }
        else if (marks < 40) {
            System.out.println("F");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks for grading: ");
        int a = sc.nextInt();
        Grade obj=new Grade(a);
        sc.close();
    }
}
