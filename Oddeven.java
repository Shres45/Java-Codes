public class Oddeven {
    void check(int n){
        if(n%2==0){
            System.out.println("The number "+n+" is Even!!");
        }
        else{
            System.out.println("The number "+n+" is Odd!!");
        }
     }
    public static void main(String[] args) {
        Oddeven obj = new Oddeven();
        obj.check(8);
        obj.check(3);
    }
}
