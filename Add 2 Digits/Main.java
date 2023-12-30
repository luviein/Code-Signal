public class Main {
    public static int solution(int n) {
        String intString = String.valueOf(n);
        char[] charArray = intString.toCharArray();
        // converts to numeric by deducting the ASCII 
        // Example:

        // ASCII value of '2': 50
        // ASCII value of '0': 48
        // Result of subtraction: 50 - 48 = 2
        int result = (charArray[0] - '0') + (charArray[1] - '0');
        return result;
    }
    
}