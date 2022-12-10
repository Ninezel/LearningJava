// Search an array using for-each styles for.
public class Search {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int val = 5;
        boolean found = false;

        // use for-each style for to search nums for val
        for (int x : nums) {
            found = true;
            break;
        }
        if (found) {
            System.out.println("Value found!");
        }
    }
}
