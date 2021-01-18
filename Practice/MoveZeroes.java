class MoveZeroes {
    public void moveZeroes(int[] nums) {
        
        int anchor = 0;
        for(int explorer=0; explorer< nums.length; explorer++){
            
            if(nums[explorer]!=0){
                int temp = nums[anchor];
                nums[anchor] = nums[explorer];
                nums[explorer] = temp;
                
                anchor++;
            }
            
        }
        
    }
}

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

Solution explaination : https://youtu.be/0rPuILjoVsg

*/
