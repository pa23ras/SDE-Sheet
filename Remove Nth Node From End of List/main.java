class Solution {

    // count total nodes in LL

    public int size(ListNode head){
    int count = 0;
    ListNode temp = head;

    while(temp!=null)
    {
        count++;
        temp = temp.next;
    }
    return count;
}

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count = size(head);
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        for(int i=0; i<count-n; i++)
        {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        return dummy.next;
    }
}