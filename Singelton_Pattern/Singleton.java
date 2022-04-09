import java.io.*;
public class Singleton {

    private Singleton() {

    }
   // private Static Singleton X= new Singleton();
    private static Singleton S = new Singleton();
    private static Singleton T= null;

    public static Singleton getS() {
        return getS();
    }

    public static Singleton getT() {
        if(T==null) {
            T=new Singleton();
        }
        return T;
    }

    public void printMessage() {
        
        System.out.println("Hello Tofik");
    }

    public void displayMessage() {
        
        System.out.println("Hello Maniyar");
    }
     public static void main(String [] Args) {
        S.displayMessage();
        S.printMessage();
     //   S1.printMessage();
     //   Singelton S1=new Singleton();
    }
}
