public class SumDigits {
    public static void main(String[] args) {
        String s = "sbcd45dcfH45ab"; // Input string
        int sum = 0; // Variable to store the sum of digits
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                // Add the digit to the sum
                sum += Character.getNumericValue(c);
            }
        }
        
        // Output the result
        System.out.println("Sum of digits: " + sum);
    }
}
