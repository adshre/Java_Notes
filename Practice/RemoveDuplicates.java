class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
     int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[index]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }
}

/*
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2,
with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.
*/
