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
    public boolean isPalindrome(ListNode head) {
        
        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        int size = 0;

        while(current!=null){
            size++;
            current = current.next;
        }

        size = size/2;
        current = head;

        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        ListNode second = current;

        while(second != null){
            next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }
        ListNode secondHalf = prev;
        second = secondHalf;
        current = head;
        while(second != null){
            if(current.val == second.val){
                current = current.next;
                second = second.next;
            } else {
                return false;
            }
        }
        return true;
    }
}