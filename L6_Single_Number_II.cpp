#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ones = 0;
        int twos = 0;

        for(auto it: nums){
            ones = (ones^it)&(~twos);
            twos = (twos^it)&(~ones);
        }
        return ones;
    }
};
/*
| will be used to set 
^ will be used to toggle 
& will be used to check
&~ will be used to clear
*/
int main(){
    int n; cin>>n;
    vector<int> nums(n);
    for(int i = 0; i<n; i++)
        cin>>nums[i];
    
    Solution obj;
    cout<<obj.singleNumber(nums);
    return 0;
}