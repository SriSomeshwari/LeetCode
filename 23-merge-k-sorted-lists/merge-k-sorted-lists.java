class Solution
{
     public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        if(list1==null &&list2==null)
        {
            return list1;
        } 
        if(list1==null)
        {
            return list2;
        }
        if(list2==null)
        {
            return list1;
        }
        ListNode dummy = new ListNode(-1);  
        ListNode temp = null; 
        if(list1.val <= list2.val)
        {
            dummy.next = list1;  
            temp = list1;
            list1 = list1.next;
        }
        else 
        {
            dummy.next = list2; 
            temp = list2; 
            list2 = list2.next;
        }
        while(list1!=null && list2!=null)
        {
             if(list1.val <=list2.val)
             {
                temp.next = list1;  
                temp = list1; 
                list1 = list1.next;

             }
             else 
             {
                temp.next = list2; 
                temp = list2; 
                list2 = list2.next;
             }
        } 
        if(list1==null)
        {
            temp.next = list2;
        }
        else 
        {
            temp.next = list1;
        }
       return dummy.next; 
    }
    public ListNode mergeKLists(ListNode[] lists)
    {
        if(lists.length==0)
        {
            return null;
        }
       ListNode head = lists[0]; 
       for(int i=1 ; i<lists.length ; i++) // i  = 2 
       {
         head =  mergeTwoLists(head,lists[i]);
       }       
         return head;     
          
    }
}