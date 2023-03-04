public class Program {
	public static void main(String[] args) {
	// Program 1 - Reverse String 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = sc.next();
		char c[] = s.toCharArray();
		char cr[]= new char[c.length];
		int j=cr.length-1;
		for(int i=0; i<=c.length-1; i++) {
			cr[j]=c[i];
			j--;
		}
		String s1 = new String(cr);
		System.out.println("Reversed String : "+s1);
	}
}

