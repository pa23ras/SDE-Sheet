class main {
    public ListNode middleNode(ListNode head) {
        //  FIRST APPROACH WITH TC - O(N)+O(N/2)
                        // SC - O(1)
        // int count = 0;
        // ListNode temp = head;

        // while(temp!=null)
        // {
        //     count++;
        //     temp = temp.next;  
        // }

        // temp = head;
        // for(int i=0; i<count/2; i++)
        // {
        //     temp = temp.next;
        // }
        // return temp;

    

// SECOND APPROACH TORTOISE METHOD

           ListNode fast = head;
           ListNode slow = head;

           while(fast!=null && fast.next!=null)
           {
               fast = fast.next.next;
               slow = slow.next;
           }
        return slow;
    }
}