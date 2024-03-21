public class palindromeString {

    private static boolean checkExtremes(String s, int leftBound, int rightBound) {

        if (s.charAt(rightBound) == s.charAt(leftBound))
            return true;

        return false;
    }

    private static boolean checkPalindrome(String s, int leftBound, int rightBound) {

        if (leftBound >= rightBound)
            return true;

        if (checkExtremes(s, leftBound, rightBound))
            return checkPalindrome(s, leftBound + 1, rightBound - 1);

        return false;

    }

    public static void main(String[] args) {

        String s = "abcd";
        System.out.println(checkPalindrome(s, 0, s.length() - 1));

    }
}