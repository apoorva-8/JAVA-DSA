import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50};
        
        Reverse(arr);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]);
        
        }
    public static void Reverse(int[] num){
        int SP = 0;
        int EP= num.length-1;

        while(SP<EP){
            int temp = num[SP];
            num[SP] =num[EP];
            num[EP]=num[SP];

            SP++;
            EP--;

        }
    }    


        
    }
}

public class reverse {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverse(nums);
        System.out.println("Reversed array:");
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void reverse(int[] nums) {
        int SP = 0;
        int EP = nums.length - 1;
        while (SP < EP) {
            int temp = nums[SP];
            nums[SP] = nums[EP];
            nums[EP] = temp;
            SP++;
            EP--;
        }
    }
}
