public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        if(fast==null || fast.next==null)
        {
            return null;
        }
        while(fast!=null && fast.next!= null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                break;
            }
        }
        if(fast == slow)
        {
            slow = head;

            while(slow!=fast)
            {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        
        return null;
    }
}