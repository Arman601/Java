// Income Tax Calculator
import  java.util.*;
public class Tax{
    public static void main(String args[]){
        System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        if(income<=500000){
            System.out.println(" 0% Tax");
        }
        else if( income >500000 && income <1000000){
            System.out.println(" 20% tsx");
        }
      else if( income >1000000){
        System.out.println(" 30% Tax ");
      }

    }
}