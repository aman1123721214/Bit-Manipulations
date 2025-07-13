import java.util.*;
class L6_Single_Number_II {
    public static int singleNumber(int[] nums) {
        int ones = 0;
        int two = 0;

        for(int it: nums){
            ones = (ones^it)&(~two);
            two = (two^it) &(~ones);
        }
        return two;
    }
/*
| will be used to set 
^ will be used to toggle 
& will be used to check
&~ will be used to clear
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(singleNumber(nums));
    }
}