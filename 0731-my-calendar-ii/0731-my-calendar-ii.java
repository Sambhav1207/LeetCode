class MyCalendarTwo {
    private List<int[]> cal;
    private List<int[]> over;
    public MyCalendarTwo() {
        cal = new ArrayList<>();
        over = new ArrayList<>();
    }    
    public boolean book(int start, int end) {
        for(int[] o : over){
            if(start < o[1] && end > o[0]){
                return false;
            }
        }
        for(int[] c : cal){
            if(start < c[1] && end > c[0]){
                int s = Math.max(start, c[0]);
                int e = Math.min(end, c[1]);
                over.add(new int[]{s, e});
            }
        }
        cal.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */