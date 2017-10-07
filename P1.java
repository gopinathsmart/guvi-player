import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		String s2=(sb.reverse()).toString();
		System.out.println(s2);
	}

}
