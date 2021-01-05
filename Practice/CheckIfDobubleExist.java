class CheckIfDobubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int length = arr.length;
        if(length==0 || arr == null)
            return false;
        
        for(int i:arr){
           if(set.contains(i*2) || (i%2==0 && set.contains(i/2))) return true;
            set.add(i);
            
        }
        
        return false;
    }
}
/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
*/
