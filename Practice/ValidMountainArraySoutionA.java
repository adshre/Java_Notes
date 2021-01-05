class ValidMountainArraySoutionA {
    public boolean validMountainArray(int[] arr) {
        boolean uphill=true;
        if(arr.length<3 || arr[0]>=arr[1])
            return false;
        for(int i=1;i<arr.length;i++){ // start from 1 for keeping boudary check
            if(uphill){
               if(arr[i-1]>=arr[i]) //checking if not increasing
                   uphill=false;
            }
            if(!uphill){
                if(arr[i-1]<=arr[i]) // checking if not decreasing
                    return false;
            }
        }
        return !uphill; //since end should always have uphill as false
    }
}

/*
Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]


Input: arr = [0,3,2,1]
Output: true

Input: arr = [3,5,5]
Output: false
*/
