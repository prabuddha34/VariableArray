import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
    //Variable Arguments
   System.out.println(add(1,2,3,4)+" It is the total sum !");
   double add2=add(1,2,3,4);
   System.out.println("The Average of them is"+" "+(add2/4));

    }
    static double add(double...array){
        double sum=0.0,avg=0.0;
        for(double i:array){
            sum=sum+i;
        }
        return sum;
    }
}
