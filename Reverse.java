public class Reverse {
    Reverse(int n){
        int rev = 0;
        System.out.println("Before Reversing the Number is : "+n);
        while(n !=0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        System.out.println("The reverse of The number is : "+rev);
    }
    public static void main(String[] args) {
        Reverse obj= new Reverse(121);
        Reverse obj2= new Reverse(345);
    }
}
