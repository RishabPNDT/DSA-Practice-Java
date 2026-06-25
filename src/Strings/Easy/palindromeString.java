package Strings.Easy;

public class palindromeString {
    public static void main(String[] args) {
        String str="anna";
        String s="hello";
        String a="madam";
        System.out.println("is the string palindrome? "+isPalindrome(str));
        System.out.println("is the string palindrome? "+isPalindrome(s));
        System.out.println("is the string palindrome? "+isPalindrome(a));

    }
    public static boolean isPalindrome(String string){
        int left=0;
        int right=string.length()-1;
        while(left<right){
            if(string.charAt(left)!=string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
