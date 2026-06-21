/*Problem: Linear Search in Array
Difficulty: Easy*/
package Arrays.Easy;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int []nums={5,81,76,30,19,2,60,110,10};
        System.out.print("Enter element to search : ");
        int target=sc.nextInt();
        int result=linearSearch(nums,target);
        if (result!=-1) {
            System.out.println("Target is at index : " + result);
        }else{
            System.out.println("Not found!");
        }
        sc.close();
    }

    public static int linearSearch(int []num,int t){

        for (int i = 0; i < num.length; i++) {
            if(t==num[i]){
                 return i;
            }
        }
        return -1;
    }
}
