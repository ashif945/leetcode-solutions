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
        ListNode current = head;
        int size = 0;
        while(current != null){
            current=current.next;
            size++;
            
        }
        if(n == size){
            return head.next;
        }
        
        int i = 1;
        int nth = size-n;
        ListNode prev = head;
        while(i<nth){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
}