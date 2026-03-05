public class constoverload {
        int length;
    int width;
    constoverload(){
        length=30;
        width=30;
    }
    constoverload(int n){
        length=n;
        width=40;
    }
    constoverload(int n, int b){
        length=n;
        width=b;
    }
    void display(){
        System.out.println("Perimeter of rectangle is: "+ (2*(length+width)));
    }
    public static void main(String[] args) {
        constoverload obj1= new constoverload();
        constoverload obj2= new constoverload(20);
        constoverload obj3= new constoverload(17, 29);
        obj1.display();
        obj2.display();
        obj3.display();
    }
    
}