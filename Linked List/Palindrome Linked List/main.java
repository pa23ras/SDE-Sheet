public static ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode getmid(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean isPalindrome(ListNode head)
    {
        ListNode mid = getmid(head);
        ListNode headsecond = reverse(mid);

        ListNode reversehead = headsecond;

        while(head!=null && headsecond!=null)
			{
				if(head.val != headsecond.val)
				{
					break;
				}
				head = head.next;
				headsecond = headsecond.next;
			}
		reverse(reversehead);
		if(head==null || headsecond ==null){
			return true;
		}
		else{
			return false;
		}
    }