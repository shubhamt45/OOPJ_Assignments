import java.util.ArrayList;
import java.util.Collections;

public class RotateArray {
    public static void main(String args[]){

        int arr[] ={1,2,3,4,5,6,7};

        int n = arr.length;
        int k =3;

        ArrayList<Integer> rotated = new ArrayList<>();

        for(int i =arr.length -1;i>=n-k;i--){
             rotated.add(arr[i]);
        }

       
        
        Collections.reverse(rotated);

        for(int i=0;i<n-k;i++){
            rotated.add(arr[i]);
        }
        
         for (int i = 0; i < rotated.size(); i++) {
            System.out.print(rotated.get(i) + " ");
        }
        
         //try doing using simple array
       
       }
    }

