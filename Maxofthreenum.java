public class Maxofthreenum {
    Maxofthreenum(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("The number "+a+" is Greater...");
        }
        else if(a<b && c<b){
            System.out.println("The number "+b+" is Greater...");
        }
        else{
            System.out.println("The number "+c+" is Greater...");
        }
    }
    public static void main(String[] args) {
        Maxofthreenum obj= new Maxofthreenum(10, 12, 9);
        Maxofthreenum obj2= new Maxofthreenum(13, 10, 7);
    }
}
