bool canJump(int* nums, int numsSize){
    int check = 0;
    for(numsSize -= 2; numsSize >= 0; numsSize--){
        nums[numsSize] - check > 0 ? check = 0: check++;
    }
    return check == 0;
}