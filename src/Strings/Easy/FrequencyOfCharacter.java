package Strings.Easy;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String s="programming";
        Map<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (char key: map.keySet()){
            System.out.println(key+":"+map.get(key));
        }
    }
}