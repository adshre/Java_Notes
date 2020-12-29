class EvenNumberDigits{
    //int counter = 0; simple method approach
    
    static int count_digits(int n){
        
        // method 2 : recurssive
       /*
       if(n ==0)
            return 0;
        return 1 + count_digits(n/10);
        */
        
        // method 3 : using log function
        return (int)Math.floor(Math.log10(n) + 1);
        
    }
    
    public int findNumbers(int[] nums) {
            int even_num_count = 0;
            for(int i : nums){

            // method 1 : n/10  
             /*
                 int count_of_digits = 0;
                 while(i!=0){
                     i = i/10;
                     ++count_of_digits;
                     }
             */
                
            // simple method but saves memory :
                /*
                    if((9 < nums[i] && nums[i] < 100) || (999 < nums[i] && nums[i] < 10000) || (nums[i]                     == 100000))
                     ++counter;
                */
        
             int count_of_digits = count_digits(i);
         
            
             if(count_of_digits%2==0){
                 ++even_num_count;
             }
            
            
         }
        
        return even_num_count;
        
        
    }
}
