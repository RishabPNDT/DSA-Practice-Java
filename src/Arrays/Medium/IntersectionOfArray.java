package Arrays.Medium;

import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();

        for (int val:arr1){
            set.add(val);
        }
        for (int val:arr2){
            if(set.contains(val)){
                result.add(val);
            }
        }
        System.out.println(result);

    }
}
