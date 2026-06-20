/*Problem: Find minimum Element in Array
Difficulty: Easy*/
package Arrays.Easy;

public class FindMin {

    public static void main(String[] args) {
        int []num={5,81,76,30,19,2,60,110,10};
        int min=min(num);
        System.out.println(min);
    }

    public static int min(int []num){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(min>num[i]){
                min=num[i];
            }
        }
        return min;
    }

}