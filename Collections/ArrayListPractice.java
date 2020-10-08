import java.util.ArrayList;
import java.util.Arrays;

class ArrayListPractice{
	
	public static void main(String args[]){

	/* --Normal Arrays Implementatiom starts-- */
	int arr[] = new int[2];
	arr[0] = 10;
	arr[1] = 20;

	System.out.println(" Elements in array = " + arr[0] + " and " + arr[1]);
	/* --Normal Arrays Implementatiom ends-- */

	/* -- ArraysList Implementatiom starts-- */
	
	ArrayList<Integer> al = new ArrayList<Integer>();

	// add(object) : add element at end of arraylist
	//add(index, object) :  add element at index given
	al.add(101);
	al.add(102);
	al.add(105);
	al.add(105);
	al.add(106);
	al.add(2, 103);


	//set(index, updatedObjectValue) : Changing element present at an index
	al.set(3, 104);

	//get(index) fetches the element at particular index
	for (int i = 0; i < al.size(); i++)
		System.out.println("Before removal = " + al.get(i) + " "); 

	//remove(object) : remove object from array list
	// remove(index) : remove element present at that index
	al.remove(Integer.valueOf(106)); // Since not string object 106 will directly be consider index and throw IndexOutofBoundException
	al.remove(0);

	for(int i = 0; i < al.size(); i++)
		System.out.println("After removal= " + al.get(i) + " "); 

	/* --ArrayList Implementatiom ends-- */

	}
}
