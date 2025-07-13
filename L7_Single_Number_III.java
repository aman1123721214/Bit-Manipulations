import java.util.*;

class L7_Single_Number_III{
    public int[] twoOddNum(int Arr[], int N){
        // code here
        int arr[] = new int[2];
        int num = 0;
        for(int it:Arr)
            num ^= it;
        int rightMost = (num&(num-1))^num;

        int b1 = 0; int b2 = 0;
        for(int it:Arr){
            if((it&rightMost)!=0)
                b1^=it;
            else 
            b2^=it;  
        }
        if(b1>b2){
            arr[0] = b1;    arr[1] = b2;
        }
        else {
            arr[0] = b2;    arr[1] = b1;
        }
        return arr;
    }
}