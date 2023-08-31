class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int max = 0;
        int area;
        while(j > i){
            if(height[i] > height[j]){
                area = (j - i) * height[j];
            }else{
                area = (j - i) * height[i];
            }
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
            if(max < area){
                max = area;
            }
        }
        return max;
    }
}