import java.util.HashSet;
import java.util.Scanner;

public class NumOfDistinctElements {
    public static int UniqueEl (int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int n: arr){
            hs.add(n);
        }
        return hs.size();

    }
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)){
            int n= scn.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }
            System.out.print("No of unique elements in the array are:");
            System.out.println(UniqueEl(arr));

        }
        
    }
    
}
