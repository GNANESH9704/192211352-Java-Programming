package mediem_java;

public class polindromeOrNot {

    public static void main(String[] args) {
        String n = "MADAM";
        String r = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            r += n.charAt(i);
        }
        System.out.println(r);
        if (n.equals(r)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
