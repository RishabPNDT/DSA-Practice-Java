package Strings.Easy;

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello bhai";

        // Handle empty or blank strings to avoid incorrect counts
        if (str == null || str.trim().isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            // Split by whitespace
            String[] words = str.trim().split("\\s+");
            System.out.println("Word count: " + words.length);
        }
    }
}
