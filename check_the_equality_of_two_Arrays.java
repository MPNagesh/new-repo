public class Program {
	public static void main(String[] args) {
	// Program 5 -   check the equality of two arrays
		int arr[] = {2,3,5,4,9,8};
		int arr1[] = {2,3,5,4,9,8};
		boolean b = true;
		if(arr.length==arr1.length) {
			for(int i=0; i<=arr.length-1; i++) {
				if(arr[i]!=arr1[i]) {
					b=false;
				}
			}
		}
		else {
			b=false;
		}
		if(!b) {
			System.out.println("Two Arrays Are not Equal");
		}
		else {
			System.out.println("Two Arrays Are Equal");
		}
	}
}
