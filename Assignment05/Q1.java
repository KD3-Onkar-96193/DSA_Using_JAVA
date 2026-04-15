import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {
        int arr[]={12,15,10,9,12,18,17,12};

        Arrays.sort(arr);

        int mode=arr[0];
        int maxCount=1;
        int count=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }
            else{
                count=1;
            }

            if(count>maxCount){
                maxCount=count;
                mode=arr[i];
            }
        }

        System.out.println("Mode: "+mode);

    }
    
}
