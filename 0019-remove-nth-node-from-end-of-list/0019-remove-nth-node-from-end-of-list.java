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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        temp = head;
        if(n == len){
            head = head.next;
            return head;
        }
        int i = 1;
        int t = len - n;
        ListNode prev = head;
        while(i < t){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}