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
    public ListNode partition(ListNode head, int x) {
        ListNode current = head;
        ListNode less = new ListNode(0);
        ListNode lessTail = less;
        ListNode greater = new ListNode(0);
        ListNode greaterTail = greater;
        while(current != null){
            ListNode next = current.next; 

            if(current.val < x){
                lessTail.next = current;
                lessTail = lessTail.next;
             } else if(current.val >= x){
                greaterTail.next = current;
                greaterTail = greaterTail.next;
             }
            current = next;
        }
        lessTail.next = greater.next;
        greaterTail.next = null;
        return less.next;
        
    }
}