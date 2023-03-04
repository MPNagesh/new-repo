public class Program {
	public static void main(String[] args) {
	// Program 3 - remove all white spaces from a string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		String s1 = "";
		for(int i=0; i<=c.length-1; i++) {
			if(c[i]==' ') {
				continue;
			}
			else {
				s1 = s1+c[i];
			}
		}
		System.out.println(s1);
	}
}
