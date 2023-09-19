class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        result = 0
        nums.sort()
        for i in range(len(nums) - 1):
            if(nums[i] == nums[i + 1]):
                result = nums[i]
        return result