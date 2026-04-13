import java.util.*;

public class Q1 {
    public static void decimalBinary(int n){
        if(n!=0){
            int res=n%2;
            n=n/2;
            decimalBinary(n);
            System.out.print(res);
            }   
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal No: ");
        int n=sc.nextInt();

        System.out.print("Binary no for given Decimal is: ");
        decimalBinary(n);
    }
    
}
