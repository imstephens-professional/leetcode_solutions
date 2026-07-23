// 5 ms - beats 0.48%
// 46.51 mb - beats 5.51%

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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> allNums = new HashSet<>();
        ListNode nextOne = head;

        if(head==null) {
            return head;
        }
        
        // adds all numbers to hashset, removing duplicates
        while(true) {
            allNums.add(nextOne.val);
            if(nextOne.next == null) {
                break;
            }
            nextOne = nextOne.next;
        }

        // sorts the ArrayList
        List<Integer> list = new ArrayList<>(allNums);
        Collections.sort(list);

        ListNode newHead = new ListNode(list.get(0));
        ListNode current = newHead;

        // creates new LL from sorted list
        for(int i=1; i < list.size(); i++) {
            ListNode temp = new ListNode(list.get(i));
            current.next = temp;
            current = temp;
        }

        return newHead;
    }
}
