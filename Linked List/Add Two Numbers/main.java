public ListNode addTwoNumbers(ListNode head1, ListNode head2)
{
    ListNode dummy = new ListNode(-1);
    ListNode prev = dummy;

    int carry = 0;
    int sum;

    while(head1 != null || head2 != null)
    {
        sum = carry;

        if(head1 !=null)
        {
            sum+=head1.val;
            head1 = head1.next;
        }
        if(head2 != null)
        {
            sum += head2.val;
            head2 = head2.next;
        }
        
        prev.next = new ListNode(sum%10);
        
        prev = prev.next;
        carry = sum/10;
    }
    if(carry==1)
    {
        prev.next = new ListNode(1);
    }
    ListNode ans = dummy.next;
    return ans;
}