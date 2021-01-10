class SubsetGeneration_MLP {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<Integer>(), subsets);
        return subsets;
    }
    
    public void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> subsets){
        subsets.add(new ArrayList<>(current));
        for(int i=index; i<nums.length; i++){
            current.add(nums[i]);
            generateSubsets(i+1, nums, current, subsets);
            current.remove(current.size()-1);
        }
        
    }
}

/*
Given an integer array nums, return all possible subsets (the power set).

The solution set must not contain duplicate subsets.

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Explaination :
https://www.youtube.com/watch?v=LdtQAYdYLcE
*/
