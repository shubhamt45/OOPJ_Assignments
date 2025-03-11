import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] ={1,2,2,1,3};
        int[] arr2 ={2,2,3};

        int size = arr1.length +arr2.length;

        int arr3[] = new int[size];
        int count =0;
        HashSet<Integer> hs = new HashSet<>();

        for(int i =0;i<arr1.length;i++){
            count = 0;
            for(int j=0;j<arr2.length;j++){
               if(arr1[i] == arr2[j]){
                   count++;
               } 
            }
            if(count >= 1 ){
                // System.out.println("the common elements are"+arr1[i]);
               
                hs.add(arr1[i]);
                
            }

            //below is commented logic without JCF
            // if(count >= 1 )
            // for(int k =0;k<size;k++){
            //    if(arr3[k] != arr1[i]){
            //     if(count == 1)
            //       arr3[k] = arr1[i];
            //    }
            // }
        }
        System.out.println("Elements in HashSet: " + hs);
    }
}
