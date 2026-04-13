import java.util.Scanner;

public class Q2 {

    public static int Fibonacci(int n){
        if(n<=1)
            return n;

        return Fibonacci(n-1)+Fibonacci(n-2);

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth term: ");
        int n=sc.nextInt();

        int res=Fibonacci(n);
        System.out.print("Fibonacci Series Upto: "+res);
    }
    
}
