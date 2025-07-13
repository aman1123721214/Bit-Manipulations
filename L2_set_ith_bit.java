import java.util.*;

class L2_set_ith_bit{
    public static void swap(int a, int b){
        a = a^b;
        b = a^b;    // b = (a^b)^b = a
        a = a^b;    // a = (a^b)^a = b;
        System.out.println("a = "+a+" b = "+b);
    }
    /*public static int setIthBit(int num, int i){
        return (num | (1<<i));
    }*/

    /*public static int resetIthBit(int num, int i){
            return (num & ~(1<<2)); 
    }*/

    /*public static int toggleIthBit(int num, int i){
        return (num ^(1<<i));
    }*/

    /*public static int removeLastSetBit(int num){
        return (num & (num-1));
    }*/

    /*public static boolean numIsPowerOfTwo(int num){
        return (num & (num-1)) == 0;
    }*/

    /*public static int countNumberOfSetBits(int num){
        int count = 0;
        while(num>1){
            if((num&1) == 1) count++;
            num = num>>1;
        }
        if(num == 1) count++;
        return count;
    }*/

    public static boolean checkIthBit(int num, int k){
        //return (num & (1<<k))!=0;
        return ((num>>k)&1) != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = "+a+" b = "+b);
        swap(a, b);
        //int num = sc.nextInt();
        //int i = sc.nextInt();
        //System.out.print(setIthBit(num, i));
        //System.out.print(resetIthBit(num, i));
        //System.out.print(toggleIthBit(num, i));
        //System.out.print(removeLastSetBit(num));
        //System.out.print(numIsPowerOfTwo(num));
        //System.out.print(countNumberOfSetBits(num));
        //System.out.print(checkIthBit(num, i));
    }
}