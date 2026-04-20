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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i=0,j=0;
        if(l1 == null && l2 == null)
            return null;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        while(l1 != null){
            i = i*10+l1.val;
            l1 = l1.next;
        }

        while(l2 != null){
            j = j*10+l2.val;
            l2 = l2.next;
        }

        System.out.println(i+", "+j);
        int num = rev(i)+rev(j);
        ListNode res = new ListNode(0);
        if(num == 0)
            return res;
        ListNode temp = res;
        while(num>0){
            ListNode newNode = new ListNode(num%10);
            num/=10;
            temp.next = newNode;
            temp = temp.next;
        }
        return res.next;
    }

    public int rev(int n){
        int rev = 0;

        while(n>0){
            rev = rev*10+n%10;
            n/=10;
        }

        return rev;
    }
}
