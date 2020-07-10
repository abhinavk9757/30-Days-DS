// check in leet code https://leetcode.com/problems/add-two-numbers/

public class Add2LinkedList {
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
//    class Solution {
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            ListNode preHead = new ListNode();
//            ListNode pointer = preHead;
//            int carry =0;
//
//            while(l1!=null || l2!=null){
//                int sum = l1==null ? 0 :  + l1.val;
//                sum = l2==null ? sum : sum+l2.val;
//                sum = sum+carry;
//
//                carry = sum/10;
//                sum = sum%10;
//
//                pointer.next = new ListNode(sum);
//                pointer = pointer.next;
//
//                if(l1!=null)l1=l1.next;
//                if(l2!=null)l2=l2.next;
//            }
//
//            if(carry==1){
//                pointer.next = new ListNode(1);
//            }
//
//
//            return preHead.next;
//        }
//    }
}
