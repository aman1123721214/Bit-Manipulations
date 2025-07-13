import java.util.*;

class L4_Single_Number_I {
    public static int getSingle(int arr[]) {
        // code here
        int num = arr[0];
        //for(int it:arr) 
        //--> use of iterator just like we use auto it:arr in c++
        for(int i = 1; i<arr.length; i++)
            num ^= arr[i];
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        
        System.out.print(getSingle(arr));
    }
}