package Strings.Easy;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s="hello world";
        int vowels=0;
        int Consonants=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else {
                    Consonants++;
                }
            }
        }
        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of constonents: "+Consonants);
    }
}
