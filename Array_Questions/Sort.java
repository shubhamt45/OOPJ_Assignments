public class Sort {
    public static void main(String args[]){

        int arr[] = {2,7,1,14,13,3,5,9};

        int temp,temp2 = 0;
        
         for(int i =0;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i] =arr[i+1];
                arr[i+1] = temp;
             }

             temp = 0;
         }
         
         if(arr[0]>arr[1]){
           temp2 = arr[1];
           arr[1] = arr[0];
           arr[0]= temp2;
           
         }

         for(int i =0;i<arr.length;i++){
            System.out.println("The sorted array is "+arr[i]);
         }
    }
}