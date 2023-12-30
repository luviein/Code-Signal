import java.util.HashMap;


public class Solution {
    public static int answer(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // sets min index at max value so lower index can be replaced
        int minIndex = Integer.MAX_VALUE;
        int duplicate = -1;
        for(int i = 0; i < a.length; i++) {
            int num = a[i];
            if (map.containsKey(num) && i < minIndex) {
                // sets min index and number of min index if map already contains number
                minIndex = i;
                duplicate = num;
            } else {
                map.put(num, i);
            }
            
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int[] intArray = { 8, 4, 6, 2, 6, 4, 7, 9, 5, 8 };
        System.out.println(answer(intArray));
    }
}
