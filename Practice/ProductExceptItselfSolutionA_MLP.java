class ProductExceptItselfSolutionA_MLP {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        
        int left_product[] = new int[length];
        int right_product[] = new int[length];
        
        int ans[] = new int[length];
        
        left_product[0]=1;
        for(int i=1; i<length; i++){
            left_product[i] = left_product[i-1] * nums[i-1];
        }
        
        right_product[length-1]=1;
        for(int i=length-2; i>=0; i--){
            right_product[i] = right_product[i+1] * nums[i+1];
        }
        
        for(int i=0; i<length; i++){
            ans[i] = left_product[i]*right_product[i];
        }
        return ans;
    }    
}

/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).
*/
