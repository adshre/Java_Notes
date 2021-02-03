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
 
// MY CODE: 
class BinaryToIntegerLinkedListConversion {
    public int getDecimalValue(ListNode head) {
        
        int length = getLength(head);
        int res = 0;
        while(head.next != null){
            
            res = res + (int)Math.pow(2, length--) * head.val;
            head = head.next;
        }
        
        return res+head.val; 
    }
    
    public int getLength(ListNode head){
        
        ListNode temp = head;
        int count = 0;
        while(temp.next != null){
            temp = temp.next;
            count ++;
        }
        return count;
    }
}



/*

PROBLEM :
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10


// OPTIMIZED SOLUTION:
USING FORMULA:
class Solution {
    public int getDecimalValue(ListNode head) {
      int res = 0;
        while (head != null) {
            res *= 2;
            res += head.val;
            head = head.next;
        }
        return res;
    }
}

USING BITWISE :
class Solution {
    public int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = (num << 1) | head.next.val;
            head = head.next;    
        }
        return num;
    }
}
*/
