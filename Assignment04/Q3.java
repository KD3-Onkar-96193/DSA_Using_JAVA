
import java.util.*;
public class Q3{

      public static int nthOcurrence(int arr[],int target){

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        
        }
         if(count>0){
            return count;
         }  

        return -1;
      }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int arr[]={10,40,5,80,20,10,40,56,90,10};
        System.out.println("Enter target: ");
        int target=sc.nextInt();
        int res=nthOcurrence(arr, target);

        if(res!=-1){
        System.out.println("Total occurences are: "+res);
        }
        else{
            System.out.println("Target Not Found ");
        }

    }
}