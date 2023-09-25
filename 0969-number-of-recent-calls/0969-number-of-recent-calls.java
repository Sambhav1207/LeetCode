class RecentCounter {
    Queue<Integer> pingList;
    public RecentCounter() {
        pingList = new LinkedList<>();
    }    
    public int ping(int t) {
        pingList.add(t);
        int min = t - 3000;
        while(pingList.peek() < min){
            pingList.remove();
        }   
        return pingList.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */