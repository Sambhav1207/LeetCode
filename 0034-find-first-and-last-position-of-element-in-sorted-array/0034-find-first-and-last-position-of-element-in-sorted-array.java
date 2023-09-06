class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstOccurrence(nums, nums.length, target);
        result[1] = findLastOccurrence(nums, nums.length, target);
        return result;
    }

    int findFirstOccurrence(int[] A, int n, int target){
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + ((high - low) / 2);
            if((mid == 0 || A[mid - 1] < target) && A[mid] == target){
                return mid;
            }else if(target > A[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        } 
        return -1;
    }
    
    int findLastOccurrence(int[] A, int n, int target){
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = low + ((high - low) / 2);
            if((mid == n - 1 || A[mid + 1] > target) && A[mid] == target){
                return mid;
            }else if(target < A[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        } 
        return -1;
    }
}