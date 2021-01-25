class Solution {
    public boolean ArrayThreePartsEqualSum(int[] arr) {
        
        
        if (arr == null || arr.length == 0) return true;
    
        int sum = 0, temp = 0, found = 0;
        
        for (int num : arr) sum += num; // total sum
        
        if (sum % 3 != 0) return false;
        
        
        for (int num : arr)
        {
            temp += num;
            
            if (temp == sum / 3)
            {
                temp = 0;
                found++;
            }
            
            if (found == 3) return true;
        }
       
        return false;
    
    }
}

/*
Given an array of integers arr, return true if we can partition the array into three non-empty parts with equal sums.

Formally, we can partition the array if we can find indexes i + 1 < j with (arr[0] + arr[1] + ... + arr[i] == arr[i + 1] + arr[i + 2] + ... + arr[j - 1] == arr[j] + arr[j + 1] + ... + arr[arr.length - 1])

 

Example 1:

Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
Example 2:

Input: arr = [0,2,1,-6,6,7,9,-1,2,0,1]
Output: false
*/
