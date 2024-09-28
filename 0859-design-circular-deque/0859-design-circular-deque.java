class MyCircularDeque {
    private LinkedList<Integer> dq;
    private int n;
    public MyCircularDeque(int k) {
        dq = new LinkedList<>();
        n = k;
    }    
    public boolean insertFront(int value) {
        if(dq.size() < n){
            dq.addFirst(value);
            return true;
        }
        return false;
    }    
    public boolean insertLast(int value) {
        if(dq.size() < n){
            dq.addLast(value);
            return true;
        }
        return false;      
    }    
    public boolean deleteFront() {
        if(!dq.isEmpty()){
            dq.removeFirst();
            return true;
        }
        return false;
    }    
    public boolean deleteLast() {
        if(!dq.isEmpty()){
            dq.removeLast();
            return true;
        }
        return false;
    }    
    public int getFront() {
        return dq.isEmpty() ? -1 : dq.getFirst();
    }    
    public int getRear() {
        return dq.isEmpty() ? -1 : dq.getLast();
    }    
    public boolean isEmpty() {
        return dq.isEmpty();
    }    
    public boolean isFull() {
        return dq.size() == n;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */