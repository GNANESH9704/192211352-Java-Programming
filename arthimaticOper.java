package java_class;

public class arthimaticOper {

	public static void main(String[] args) {
		int a=3;
		int b=3;
		char o='*';
		if(o=='+') {
			System.out.println(a+b);
		}
		else if(o=='-') {
			System.out.println(a-b);
		}
		else if(o=='/') {
			System.out.println(a/b);
		}
		else if(o=='*') {
			System.out.println(a*b);
		}
		else if(o=='%') {
			System.out.println(a%b);
		}
		else {
			System.out.println("invalid o ");
		}
	}

}
