/*Problem: Find Maximum Element in Array
Difficulty: Easy*/
package Arrays.Easy;

public class FindMax {
    public static void main(String[] args) {
        int []num={2,5,81,76,30,19,60,110,10};
        int max=max(num);
        System.out.println(max);

    }
    public static int max(int num[]){
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;
    }
}
