package Arrays.Medium;

public class TwoSum {
    public static void main(String[] args) {
        int []arr={12,14,24,35,68,70,99};
        int target=80;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(left + " " + right);
                break;
            } else if (sum>target) {
                right--;
            }else {
                left++;
            }
        }
    }
}
