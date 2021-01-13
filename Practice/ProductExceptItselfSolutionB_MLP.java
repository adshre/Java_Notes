class ProductExceptItselfSolutionB_MLP {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        
        int left_product[] = new int[length];
    
        
        left_product[0]=1;
        for(int i=1; i<length; i++){
            left_product[i] = left_product[i-1] * nums[i-1];
        }
        
       int right = 1;
        for(int i=length-1; i>=0; i--){
            left_product[i] = left_product[i] * right;
            right *= nums[i];
        }
       
        return left_product;
    }    
}

/*

With constant space time solution

*/
