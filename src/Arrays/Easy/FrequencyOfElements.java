package Arrays.Easy;

import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int []arr={1,2,1,2,3,6,5,4,6,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int key: map.keySet()){
            System.out.println(key+":"+ map.get(key));
        }
    }
}
