public class RemoveNthNodeFromBehind {
//    /**
//     * Definition for singly-linked list.
//     * public class ListNode {
//     *     int val;
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//    class Solution {
//        static int lastIndex;
//        static ListNode nxt;
//        static ListNode removeNode(ListNode head, int currIndex, int n){
//            if(head.next==null){
//                lastIndex = currIndex;
//                return head;
//            }
//
//            nxt = removeNode(head.next, currIndex+1, n);
//            if(currIndex == lastIndex - n){
//                head.next = head.next.next;
//            }
//            return head;
//        }
//
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            ListNode prev = new ListNode(0, head);
//            return removeNode(prev, 0, n).next;
//        }
//    }
}
