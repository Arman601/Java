//Q. Math operation using function
import java.util.*;
public class MathOptByfunc{
    public static int MathOpt(int n1, int n2){
         int sum = n1+n2;
         int subtract = n1-n2;
         int mult = n1*n2;
         int div = n1/n2;
         int mod = n1%n2;
     



     System.out.println( " The sum of two number is:"+  " " +sum);
     System.out.println( " The subtraction of two number is:"+  " " +subtract);
     System.out.println( " The multiplication of two number is:"+  " " +mult);
     System.out.println( " The Division of two number is:"+  " " +div);
     System.out.println( " The Modulo of two number is:"+  " " +mod);
  


        return sum;

    }

    public static void main(String args[]){
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        MathOpt( n1,  n2);

    }
}

             
        

        
      
