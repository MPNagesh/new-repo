public class Program {
	public static void main(String[] args) {
	// Program 2 - pyramid of numbers 
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
