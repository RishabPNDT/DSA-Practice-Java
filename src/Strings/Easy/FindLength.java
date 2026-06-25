package Strings.Easy;

public class FindLength {
    public static void main(String[] args) {
        String s="hello";
        int length=0;
        for (char ch: s.toCharArray()) {
            length++;
        }
        System.out.println(length);
    }
}
