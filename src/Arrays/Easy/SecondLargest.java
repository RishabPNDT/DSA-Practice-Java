package Arrays.Easy;

public class SecondLargest {

    public static void main(String[] args) {
        int []nums={5,81,76,30,19,110,2,60,110,10};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                secondMax=max;
                max=nums[i];
            }
            else if(nums[i]>secondMax && nums[i]!=max){
                secondMax=nums[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found!");
        } else {
            System.out.println("Largest: " + max);
            System.out.println("Second Largest: " + secondMax);
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
