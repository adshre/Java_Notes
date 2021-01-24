class InsertionSort{

	public void sort(int nums[]){

		int length =  nums.length; // length of array

		for(int i = 1; i < length; i++){  // loop from 1 to n-1 elements of array

			int currentElement = nums[i]; // let ith element be current element

			int j = i - 1; // set j as index to track predecessors

			while(j >= 0 && nums[j] > currentElement){ // check boundary condition as j >= 0 and if predecessor > Current element

				nums[j+1] = nums[j]; // shift all elements one position ahead of current position.
				j = j - 1; // decrease by 1 to go over all predecessors present in sub sorted array
			}

			nums[j+1] = currentElement; // Set currentElement in expected position. j+1 since j is decremented in while loop.

		}


	}


	public void printElements(int nums[]){

		for(int i : nums){

			System.out.print(i + " ");  // print all elements
		}
	}

	public static void main(String args[]){

		int arr[] = { 12, 11, 13, 5, 6 }; 
		InsertionSort obj = new InsertionSort();
		obj.sort(arr);
		obj.printElements(arr);
	}
}

/ *
https://www.geeksforgeeks.org/insertion-sort/
*/
