public class BiNomialCofficient{
    public static int factorial( int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f*i;
          
        }
        return f;
    }

    public static int bicoeff( int n , int r){
        int fac_n = factorial(n);
        int fac_r = factorial(r); 

        int fac_nmr = factorial(n-r);
        int bi = fac_n / ( fac_r*fac_nmr);  // Binomila Formula hai ye(n!/r!*(n-r)!)
        System.out.println(bi);
        return  bi;

    }


    public static void main(String args[]){
    //    System.out.println(factorial( 5)) ;
    bicoeff( 5,2);
       
    }
}