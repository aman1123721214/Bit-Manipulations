import java.util.*;
class L3_Minimum_Bit_Flips_to_Convert_Number {
    public static int countNumberOfSetBits(int num){
        int count = 0;
        while(num>1){
            if((num&1) == 1) count++;
            num = num>>1;
        }
        if(num == 1) count++;
        return count;
    }
    public int minBitFlips(int start, int goal) {
        return countNumberOfSetBits(start^goal);
        //start^goal will gives us how many bits are
        //changed in goals ie.the places where bits 
        //are different will become 1 and we need to
        // count only those set bits in start^goal
    }
}