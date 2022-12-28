package Searching_Algorithm;


// Time Complexity O(log N)
// Apply only on sorted array
public class Binary_Search {
	static int isFound(int[] arr, int n, int key) {
		int ans=-1;
		int start = 0, end=n-1;
		int mid = start + (end-start)/2;
		while(start<=end) {
			if (key == arr[mid]) 
				return mid; // if key is in the middle
			else if(key>arr[mid]) {
				start = mid+1; // if key is right side of mid
			}else if(key< arr[mid]) {
				end =mid-1;  // if key is left side of mid
			}
			mid = start + (end-start)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {2,4,6,8,10,100,700,20000};
		int key=20000;
		int index = isFound(array, array.length, key);
		if(index !=-1)
		System.out.println("Key is present at this "+index+" index");
		else {
			System.out.print("Key is not found");
		}

	}

}
