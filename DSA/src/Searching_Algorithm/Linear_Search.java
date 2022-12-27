package Searching_Algorithm;
// Time Complexity = O(n)
public class Linear_Search {
	static int isFound(int[] arr, int n, int key) {
		int ans=-1;
		
		for (int i=0; i<n; i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		int key=90;
		int index = isFound(array, array.length, key);
		if(index !=-1)
		System.out.println("Key is present at this "+index+" index");
		else {
			System.out.print("Key is not found");
		}
	}

}
