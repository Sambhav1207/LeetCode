/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size() / 2; i++){
            int twinSum = list.get(i) + list.get(list.size() - 1 - i);
            if(twinSum > max){
                max = twinSum;
            }
        }
        return max;
    }
}