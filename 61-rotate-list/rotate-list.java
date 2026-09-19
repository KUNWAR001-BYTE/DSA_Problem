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
    public ListNode findNthNode(ListNode head, int len){
        int cnt = 1;
        while(head != null){
            if(cnt == len){
                return head;
            }
            cnt++;
            head = head.next;
        }
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
         if(head == null || head.next == null){
            return head;
        }
        int len = 1;
        ListNode tail = head;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        if(k%len == 0)return head;
        k = k%len;
        tail.next = head;
        
        ListNode newlastNode = findNthNode(head,len-k);
        head = newlastNode.next;
        newlastNode.next = null;
        return head;
    }
}