import java.util.Scanner;

public class DSAinJava {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] array = new int[n];

        int count = 0;
        for(int i =0; i<n; i++){
            array[i] = scn.nextInt();
        }
        for(int i=0; i<n ; i++){
            count = count+array[i];
        }
        System.out.print(count);
    }
}