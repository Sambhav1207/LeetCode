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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = new ListNode();
        ListNode prev = temp;
        temp.next = head;
        for(int i = 0; i < left - 1; i++){
            prev = prev.next;
        }
        ListNode curr = prev.next;
        for(int i = 0; i < right - left; i++){
            ListNode ptr = prev.next;
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = ptr;
        }
        return temp.next;
    }
}