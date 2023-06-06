class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        

        ListNode l1 = list1;
        ListNode l2 = list2;
        
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while(l1!=null && l2!=null)
        {
            if(l1.val>l2.val)
            {
                prev.next = new ListNode(l2.val);
                prev = prev.next;
                l2 = l2.next;
            }
            else
            {
                prev.next = new ListNode(l1.val);
                prev = prev.next;
                l1 = l1.next;
            }
        }

        while(l1!=null)
        {
            prev.next = new ListNode(l1.val);
            prev = prev.next;
            l1 = l1.next;
        }

        while(l2!=null)
        {
            prev.next = new ListNode(l2.val);
            prev = prev.next;
            l2 = l2.next;
        }

        return dummy.next;
    }
}