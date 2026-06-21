/*Problem: Find Sum of Element in Array
Difficulty: Easy*/

package Arrays.Easy;
public class SumOfElements {
    public static void main(String[] args) {

    int []num={5,81,76,30,19,2,60,110,10};

    int sum=add(num);
        System.out.println(sum);

    }

    public static int add(int []num){
        int sum=0;
//        for (int i = 0; i < num.length; i++) {
//            sum=sum+num[i];
//        }

        for(int value:num){
            sum=sum+value;
        }

        return sum;
    }

}

