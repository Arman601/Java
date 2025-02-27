import java.util.Scanner;
public class BasicMathOperation{
    public static void main(String args[]){
     
        int num1, num2,result;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = input.nextInt(); //num1 is a variable

        System.out.println("Enter the second number");
        num2 = input.nextInt(); //num2 is a variable


       

        System.out.println( " The sum is:"  +(num1+num2));
        System.out.println("The subtract is:" +(num1-num2 ));
        System.out.println(" The mult is:" +(num1*num2));
        System.out.println( "The div is:" +(num1/num2));
        System.out.println("The mod is:" +(num1%num2));
  
    }
}