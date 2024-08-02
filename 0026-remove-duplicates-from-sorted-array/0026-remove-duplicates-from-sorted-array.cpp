class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        // set<int> set;
        // for(int i = 0; i < nums.size(); i++){
        //     set.insert(nums[i]);
        // }
        // int index = 0; 
        // for(auto it : set){
        //     nums[index] = it;
        //     index++;
        // }
        // return set.size();

        int i = 0;
        for(int j = 1; j < nums.size(); j++){
            if(nums[j] != nums[i]){
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
};