#include<iostream>
using namespace std;

    void swap(int &a, int &b){
        a = a^b;
        b = a^b;    // b = (a^b)^b = a
        a = a^b;    // a = (a^b)^a = b;
    }
/*
    int setIthBit(int num, int i){
        return (num | (1<<i));
    }

    int resetIthBit(int num, int i){
            return (num & ~(1<<2)); 
    }

    int toggleIthBit(int num, int i){
        return (num ^(1<<i));
    }

    int removeLastSetBit(int num){
        return (num & (num-1));
    }

    boolean numIsPowerOfTwo(int num){
        return (num & (num-1)) == 0;
    }

    int countNumberOfSetBits(int num){
        int count = 0;
        while(num>1){
            if((num&1) == 1) count++;
            num = num>>1;
        }
        if(num == 1) count++;
        return count;
    }

    bool checkIthBit(int num, int i){
        //return (num>>i)&1;    right shift operation
        //OR
        return (num & (1<<i));  //left shift operation
    }
*/

int main(){
    int a, b;
    cin>>a>>b;
    cout<<"a = "<<a<<" b = "<<b<<endl;
    swap(a, b);
    cout<<"a = "<<a<<" b = "<<b<<endl;
    //int num; cin>>num;
    //int i; cin>>i;
    //cout<<setIthBit(num, i);
    //cout<<resetIthBit(num, i);
    //cout<<toggleIthBit(num, i);
    //cout<<removeLastSetBit(num);
    //cout<<numIsPowerOfTwo(num);
    //cout<<countNumberOfSetBits(num);
    //cout<<checkIthBit(num, i);
    return 0; 
}