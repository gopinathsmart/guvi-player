import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s1=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s1);
		String s2=(sb.reverse()).toString();
		System.out.println(s2);
	}

}
