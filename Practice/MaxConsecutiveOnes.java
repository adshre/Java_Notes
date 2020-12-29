class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
    
     int count=0, max=0;
        
       for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                if(max<count)
                    max=count;
            }
            else
                count=0;
        }
        
        // concise level code of above : 
        /*
        for(int i : nums)
            max = Math.max(max, count = i==0 ? 0:count+1);
        */
        return max;
    }
}
