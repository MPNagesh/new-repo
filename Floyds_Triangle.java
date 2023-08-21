public class Demo {
	public static void main(String[] args) {
		//Program 52- Floyd’s Triangle
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int value=1;
		for(int i=1; i<=num ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
	}
}
[A[A[A[A[A[A[A[A[A[A[A[A[A[A[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[B[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D[D