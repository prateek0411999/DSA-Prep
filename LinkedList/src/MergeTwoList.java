// LeetCode Question

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(0);
        ListNode head = newNode; 
        ListNode ref = head;
        if (list1 == null)
        {
            newNode.next = list2;
            head = newNode.next;
            return head;
        }
        if (list2 == null)
        {
            newNode.next = list1;
            head = newNode.next;
            return head;
        }
        
        while(list1 != null && list2 != null)
        {
            if (list1.val >= list2.val)
            {
                ref.next = list2;
                ref = ref.next;
                list2  = list2.next;
            }else {
                ref.next = list1;
                ref = ref.next;
                list1  = list1.next;
            }
           
            
        }
        if(list1 == null)
        {
            ref.next = list2;
        }
        if(list2 == null)
        {
            ref.next = list1;
        }
        return head.next;
    }
}