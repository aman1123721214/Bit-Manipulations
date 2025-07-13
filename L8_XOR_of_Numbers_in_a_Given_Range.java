import java.util.*;
class L8_XOR_of_Numbers_in_a_Given_Range {
    public static int XORfrom1toN(int n){
        if(n%4 == 1) return 1;
        else if(n%4 == 2) return n+1;
        else if(n%4 == 3) return 0;
        else return n;
    }
    public static int findXOR(int l, int r) {
        return XORfrom1toN(l-1)^XORfrom1toN(r);
    }
    /*if(n%4 == 0) return n;
        else if(n%4 == 1) return 1;
        else if(n%4 == 2) return n+1;
        else if(n%4 == 3) return 0;
     */
}