package recursion;

public class CheckIfStringIsAPalindrome {
    public static Boolean isPalindrome(String s) {
        if (s.charAt(0) == s.charAt(s.length()-1)) {
            isPalindrome(s.substring(0, s.length() - 1));
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("bob"));
        System.out.println(isPalindrome("hi!"));
        System.out.println(isPalindrome("level"));
    }
}
