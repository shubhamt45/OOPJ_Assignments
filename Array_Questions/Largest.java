public class Largest {
    public static void main(String[] args) {
         int arr[] ={2,7,1,12,3,21,7,1,42};

         int largest = arr[0];
         int smallest = arr[0];

         for(int i =1;i<arr.length;i++){
             if(arr[i]>largest){
                largest = arr[i];
             }
         }
         System.out.println("Largest element in the array is"+largest);


        //  for(int i =1;i<arr.length;i++){
        //     if(arr[i]<smallest){
        //        smallest = arr[i];
        //     }
        // }
        // System.out.println("Smallest element in the array is"+smallest);
    }
}
