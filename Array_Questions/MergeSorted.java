public class MergeSorted {
    public static void main(String[] args) {
        
        int num1[] ={1,2,3,0,0,0};
        int num2[] ={2,5,6};

        int m =3;
        int n =3;
        int size =m +n;
        int track =0;
        int k =0;

        int arr[] =new int[size];

        for(int i =0;i<m;i++){
             arr[i] =num1[i];
             track =i;
        }

        // for(int i=0;i<size;i++){
        //     System.out.println(arr[i]);
        //  }
        //  System.out.println(track);
      
         for(int j=track+1;j<size;j++){
              arr[j] = num2[k];
              k++;
         }
         for(int i=0;i<size;i++){
            System.out.println(arr[i]);
         }

         //use bubble sort to sort

         
    }
}
