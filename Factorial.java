public class Factorial {
    int n=5;
    void fact(){
        int f=1,i;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial is:" +f);
    }
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        obj.fact();
    }
}
