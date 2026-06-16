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
    public ListNode copy(ListNode head){
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(head != null){
            cur.next = new ListNode(head.val);
            cur = cur.next;
            head = head.next;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null, curr = head;
        while(curr != null){
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = reverse(copy(head));
        while(temp1 != null){
            if(temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
}
