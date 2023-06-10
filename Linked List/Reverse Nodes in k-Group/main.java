class Solution {
    
    public static int length(ListNode head)
    {
        int len = 0;
        ListNode curr = head;

        while(curr!=null)
        {
            len++;
            curr = curr.next;
        }
        return len;
    }

    static ListNode th = null;
    static ListNode tt = null;

    public static void addfirst(ListNode node)
    {
        if(th==null)
        {
            th = node;
            tt = node;
        }
        else
        {
            node.next = th;
            th = node;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode oh = null, ot = null;

        if(head ==null || head.next == null || k==0) return head;

        int len = length(head);

        ListNode curr = head;

        while(len>=k)
        {
            int tempk = k;

            while(tempk-->0)
            {
                ListNode forw = curr.next;
                curr.next = null;

                addfirst(curr);
                curr = forw;
            }

            if(oh==null)
            {
                oh = th;
                ot = tt;
            }
            else
            {
                ot.next = th;
                ot = tt;
            }
            th = null;
            tt = null;
            len-=k;
        }

        ot.next = curr;
        
        return oh;
    }
}