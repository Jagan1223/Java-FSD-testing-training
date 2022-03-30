package String;

public class StringCompare {

	public static void main(String[] args) {
		String s1="Amazon";
		String s2="amazon";
		String s4="Amazon";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3=new String("Amazon");
		System.out.println(s1==s3);
		System.out.println(s1==s4);

	}

}
