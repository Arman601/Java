import java.util.*;
public class StuMarks{
    public static void main(String args[]){
        int StuMarks[ ] = new int [ 10];
        Scanner sc  = new Scanner(System.in);
       

        
        StuMarks[0]   = sc.nextInt();
        StuMarks[1] = sc.nextInt(); 
        StuMarks[2] = sc.nextInt();
        System.out.println(" phy: "  +StuMarks[0]);
        System.out.println(" che: " +StuMarks[1]);
        System.out.println("Math: " +StuMarks[2]);




    }
}