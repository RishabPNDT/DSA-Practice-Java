package Arrays.Medium;

import java.util.HashSet;

public class CheckDuplicate {
    public static void main(String[] args) {
        int arr[]={10,92,51,40,10,73,64,14,40,92};
        HashSet<Integer> set=new HashSet<>();
        for (int num:arr){
            if(set.contains(num)){
                System.out.println("duplicate:"+num);
            }else{
                set.add(num);
            }
        }
    }
}
