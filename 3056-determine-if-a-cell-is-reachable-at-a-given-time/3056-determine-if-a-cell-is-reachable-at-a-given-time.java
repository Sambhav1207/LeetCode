class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx == fx && sy == fy){
            return (t > 1 || t == 0);
        }
        int heightDifference = Math.abs(sy - fy);
        int widthDifference = Math.abs(sx - fx);
        int extraTime = Math.abs(heightDifference - widthDifference);
        return (Math.min(heightDifference, widthDifference) + extraTime) <= t;
    }
}