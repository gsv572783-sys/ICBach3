class Vehical {
    String Brand = "Veno";
    void honk(){
    
       System.out.println("Beep!  Beep!");

   }
}

public class Car extends Vehical{
    String Modelname = "veero";
    void displayDetails(){
        System.out.println("Brand"+Brand);
        System.out.println("Model"+Modelname);

    }
    public static void main(String[] args) {
        Car c=new Car();
        c.displayDetails();
    }
}