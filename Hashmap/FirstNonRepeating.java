import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeating {
    public static int FirstNonRepeatingElement (int[] arr){
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for(int n: arr){
            if(hm1.containsKey(n)==true){
                int temp = hm1.get(n);
                hm1.put (n,temp+1);
            }
            else{
                hm1.put(n,1);
            }
        }
        for(int n: arr){
            if(hm1.get(n)==1){
                return n;

            }
            
        }
        return -1;


    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                arr[i]=scn.nextInt();
            }
            System.out.println(FirstNonRepeatingElement(arr));
        }
    }
    
}
