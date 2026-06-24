package Arrays.Easy;

public class CheckOrder {
    public static void main(String[] args) {
        int[] sortedArr = {1, 2, 3, 4, 5};
        int[] unsortedArr = {1, 3, 2, 4, 5};

        System.out.println("Is sortedArr sorted?: "+CheckOrder(sortedArr));
        System.out.println("Is sortedArr sorted?: "+CheckOrder(unsortedArr));

    }

    public static boolean CheckOrder(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;

            }
        }
        return true;
    }
}

