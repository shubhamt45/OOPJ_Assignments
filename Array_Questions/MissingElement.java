public class MissingElement {
    public static void main(String[] args) {
        int arr[] = {3, 0, 1}; 
        int n = 3; 
        int count = 0;

        for (int j = 0; j <= n; j++) { // Checking for each number from 0 to n
            count = 0; // Reset count for each j

            for (int i = 0; i < n; i++) { // Searching if j exists in array
                if (arr[i] == j) {//bhai idhar dhyan de game hota hai sirf variable ka khrl hai
                    
                    count++;
                }
            }

            if (count == 0) { // If j is missing, print it
                System.out.println(j);
                break; // Only one number is missing, so we can exit
            }
        }
    }
}
