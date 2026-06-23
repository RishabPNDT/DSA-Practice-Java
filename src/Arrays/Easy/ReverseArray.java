/*Problem: Reverse Element in Array
Difficulty: Easy*/

package Arrays.Easy;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []nums={5,81,76,30,19,110,2,60,110,10};
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));

    }
}
