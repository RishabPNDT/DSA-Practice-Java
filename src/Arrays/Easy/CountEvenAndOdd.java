package Arrays.Easy;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int []arr={5,81,76,30,19,110,2,60,110,10};

        OddEven(arr);
    }
    public static void OddEven(int []arr){
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
                System.out.println("Odd numbers:"+odd);
                System.out.println("Even numbers:"+even);
    }
}
