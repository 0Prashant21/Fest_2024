class PalindromeString {
    public static void main(String[] args) {
        String str = "abccb";
        if (booleanornot(str)) {
            System.out.println("string is palindrome"); // You need to make the method static or create an object.
        } else {
            System.out.println("string is not palindrome");
        }

    }

    // Method should be static if you want to call it directly from the main method
    public static boolean booleanornot(String st) {
        int left = 0;
        int right = st.length() - 1;

        while (left < right) {
            // Compare characters from both ends
            if (st.charAt(left) != st.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }
}
