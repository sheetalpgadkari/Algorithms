public class Palindrome
{
    static void isPalindromme(String str)
    {
        String str1  = reverse (str);
        if(str.equals(str1))System.out.println("Palindromme ");
        else System.out.println("Not Palindromme");
    }

    private static String reverse(String str)
    {
        if(str.length() < 2) {
            return str;
        }
        return  str.substring(str.length() -1 ) + reverse( str.substring( 0, str.length() - 1));
    }

    public static void main(String[] args)
    {
        isPalindromme("madam");
        isPalindromme("madam1");

        isPalindromme("madammadam");

    }
}
