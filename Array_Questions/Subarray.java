public class Subarray {
    public static void main(String[] args) {
        int arr[] ={1,1,1};
        int sum =0;
        int kk =3;
        int count =0;

        for(int k =0;k<arr.length;k++){
            
            for(int i =k;i<arr.length;i++){
                sum = 0;
                for(int j =k;j<=i;j++){
                //    System.out.print(arr[j] +" ");

                sum =sum + arr[j];
                   
                }
                // System.out.println(" ");
                if(sum == kk){
                  count++;
                }



    
            }
            
        }
        System.out.println(count);
        
        
    }
}
