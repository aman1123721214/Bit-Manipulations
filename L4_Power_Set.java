import java.util.*;
class L4_Power_Set{
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int n = 0; n<(1<<nums.length); n++){
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                if((n & (1<<i))==1)
                    res.add(nums[i]);
            }
            ans.add(new ArrayList<>(res));
        }return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ans =  subsets(arr);
        for(List<Integer> innerList : ans){
            for(int i = 0; i<innerList.size(); i++){
                System.out.print(innerList.get(i)+" ");
            }
            System.out.println();
        }
    }
}