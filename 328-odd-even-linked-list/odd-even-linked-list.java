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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ArrayList<Integer>list = new ArrayList<>();

        ListNode temp = head;
        while(temp!=null && temp.next!=null){
            list.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null)list.add(temp.val);

        ListNode temp1 = head.next;
        while(temp1!=null && temp1.next!=null){
            list.add(temp1.val);
            temp1 = temp1.next.next;
        }
        if(temp1 != null)list.add(temp1.val);

        int i = 0;
        ListNode temp2 = head;
        while(temp2!= null){
            temp2.val =list.get(i);
            i++;
            temp2 = temp2.next;
        }
        return head;

        
    }
}