import java.util.Scanner;
public class Factorial {
    public static int factorial(int n){
     int facto =1;
     for(int i=1; i<=n;i++){
        facto*=i;   
     }
     return facto;
    }
    public static void main(String args[]){
        /*Scanner sc= new Scanner(System.in);  // To take input from user we're using Scanner file 
        int a =sc.nextInt();
        int fact=factorial(a);
        System.out.println(fact); */
        System.out.println(factorial(6));
    }
    
}


