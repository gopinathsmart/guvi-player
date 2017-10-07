import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s[]=s1.split(" ");
		char c=0;
		String s3="";
		for(int i=0;i<s.length;i++) {
			c=s[i].charAt(0);
			
			if(Character.isLowerCase(c)) {
				s3=Character.toUpperCase(c)+"";
			}
			s3+=s[i].substring(1);
		
		System.out.println(s3);
	}
	}
}
