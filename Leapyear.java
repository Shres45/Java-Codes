public class Leapyear {
    void display(int year){
        if((year %4 == 0 && year%100 !=0)||(year%400==0))
        {
            System.out.println(year+" is a leap year...");
        }
        else{
            System.out.println(year+" is not a leap year...");
        }
    }
    public static void main(String[] args) {
        Leapyear obj= new Leapyear();
        obj.display(2024);
        obj.display(2026);
    }
}
