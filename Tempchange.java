public class Tempchange {
    void change(double celcius){
        double farenheit = (celcius*9/5)+32;
        System.out.println("Celcius to Farenheit is : "+farenheit);
    }
    public static void main(String [] args){
        Tempchange obj= new Tempchange();
        obj.change(30);
    }
}
