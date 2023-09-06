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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        int partSize = length / k;
        int largerParts = length % k;
        ListNode result[] = new ListNode[k];
        curr = head;
        for(int i = 0; i < k; i++){
            result[i] = curr;
            int currentPartSize;
            if(largerParts-- > 0){
                currentPartSize = partSize + 1;
            }else{
                currentPartSize = partSize;
            }
            for(int j = 0; j < currentPartSize - 1; j++){
                curr = curr.next;
            }
            if(curr != null){
                ListNode next = curr.next;
                curr.next = null;
                curr = next;
            }
        } 
        return result;
    }
}