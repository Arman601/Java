/* yha function name same hai jaise sum but number of parameters alg hai 
 jaise  first me sum(int a,int b) to second me sum( int a, int b , int c )*/ 

import java.util.*;
public class FunctionOverloading{
    public static int sum( int a, int b){  
        return a+b;


    }

    public static int sum( int a, int b , int c ){
        return a+b+c;


    }

    public static void main(String args[]){
       

        System.out.println(" the sum of two number is:"  +" " +sum(2,2));
        System.out.println(" the sum of three  number is: "  +" "  +sum(2,2,2));



      
    }

}