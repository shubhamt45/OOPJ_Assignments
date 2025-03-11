public class SecondLargest {
    public static void main(String[] args) {
        int arr[] ={2,7,1,12,3,21,7,1,42};

         int largest = arr[0];
         int smallest = arr[0];
         int largestIndex = Integer.MAX_VALUE;
        //  int largestIndex = arr[0];
         for(int i =1;i<arr.length;i++){
             if(arr[i]>largest){
                largest = arr[i];
                largestIndex = i;
             }
         }
         System.out.println("Largest element in the array is"+largest);


         int SecondLargest = Integer.MIN_VALUE;
        //  int SecondLargest = arr[0];

         for(int i =0;i<arr.length;i++){
                if(arr[largestIndex] != arr[i]  && arr[i]>SecondLargest){
                    SecondLargest = arr[i];
                }
         }

         System.out.println("Second Largest element in the array is"+ SecondLargest);

        
    }
}
