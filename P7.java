import java.util.Scanner;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		int a = s1.length();
		char b[] = new char[a];
		b = s1.toCharArray();
		char tem = 0;
		String s2 = "";
		String s3 = "";
		String s4 = "";
		for (int i = 0; i < b.length; i++) {
			if (i % 2 != 0) {
				s2 += b[i];
			} else {

				s3 += b[i];
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			s4 += s2.charAt(i) + "" + s3.charAt(i);
		}
		if (s4.length() != s1.length()) {
			s4 += s1.charAt(s1.length() - 1);
			System.out.println(s4);
		}

		else {

			System.out.println(s4);
		}
		in.close();
	}

}
