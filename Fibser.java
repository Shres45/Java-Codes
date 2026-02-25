public class Fibser {
    Fibser(int num){
        int a= 0, b= 1, c;
        System.out.println("Fibonacci Series: ");
        for(int i =0;i<num;i++){
            System.out.println(a+"");
            c = a+b;
            a= b;
            b = c;
        }
    }    
    public static void main(String[] args) {
        Fibser obj= new Fibser(4);
        Fibser obj2= new Fibser(6);
    }
}
