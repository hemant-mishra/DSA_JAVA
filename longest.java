public class longest {
    public static void main(String args[]) {
        String s = "EBBABAD";

        if (s.length() < 1) {
            System.out.println(s);
            return; // Exit if the string is empty
        }

        String lps = ""; // To store the longest palindromic substring

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            int low = i;
            int high = i;

            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            String palindrome = s.substring(low + 1, high); // Extract the palindrome
            if (palindrome.length() > lps.length()) {
                lps = palindrome; // Update lps if this palindrome is longer
            }

            // Even length palindrome
            low = i;
            high = i + 1;

            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            palindrome = s.substring(low + 1, high); // Extract the palindrome
            if (palindrome.length() > lps.length()) {
                lps = palindrome; // Update lps if this palindrome is longer
            }
        }

        System.out.println(lps); // Print the longest palindromic substring
    }
}