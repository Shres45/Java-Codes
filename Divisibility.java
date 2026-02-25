public class Divisibility {
    Divisibility(int n){
        if(n%5==0){
            System.out.println("The number "+n+" is divisible by 5...");
        }
        else{
            System.out.println("The number "+n+" is not divisible by 5....");
        }
    }
    public static void main(String[] args) {
        Divisibility obj= new Divisibility(10);
        Divisibility obj2= new Divisibility(7);
    }
}
