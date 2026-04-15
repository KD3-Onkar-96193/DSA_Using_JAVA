
public class Q3{

     public static void insertionSort(int arr[], int N){

        for(int i=1;i<N;i++){
            int temp=arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]<temp){

                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int arr[]={25,14,7,8,13,9,20,15};
        int N=arr.length;
      
        Q3 obj=new Q3();
        obj.insertionSort(arr, N);

    }

}