import java.util.*;
public class Q4 {

    public static int indexoflastOccurence(int arr[], int target){
        int index=0;
        for(int i=0;i<arr.length;i++){    
            if(target==arr[i]){
                index=i;
            }
        }
        if(index>0)
           return index;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[]={10,30,10,50,60,70,80,10};
       System.out.println("Enter Target Value :");
       int target=sc.nextInt();
       int res=indexoflastOccurence(arr, target);
       System.out.println("Last Occurence of given target is at index:  "+res);

    }
    
}
