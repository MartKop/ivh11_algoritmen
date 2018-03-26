package Examples.Palindrome;

public class main {
    public static void main(String[] args) {

        String word = "1234567877687654321";


        System.out.println("Starting...");
        long startTime = System.nanoTime();

        System.out.println("palindrome -> " + word + " = " + isPalindrome(word));

        long endTime = System.nanoTime();
        System.out.println("Ending...");

        System.out.println("Time elapsed: " + String.valueOf((endTime - startTime)  ));


    }

    public static boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));

        return false;
    }

}