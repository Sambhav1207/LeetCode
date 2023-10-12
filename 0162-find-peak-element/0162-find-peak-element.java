class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1, mid;
        if(n == 1){
            return 0;
        }
        if(nums[low] > nums[low + 1]){
            return low;
        }else if(nums[high] > nums[high - 1]){
            return high;
        }else{
            low++;
            high--;
        }
        while(low <= high){
            mid = (low + high) / 2;
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return mid;
            }else if(nums[mid - 1] > nums[mid]){
                if(nums[mid + 1] > nums[mid] && nums[mid + 1] != nums[mid - 1]){
                    return mid + 1;
                }
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}