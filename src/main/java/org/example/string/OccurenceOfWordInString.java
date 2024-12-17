package org.example.string;

public class OccurenceOfWordInString {

    /**
     * This method checks if the substring starting at a given index in the input string `s`
     * matches the target string `t`.
     *
     * @param s     The main string where the word is searched.
     * @param t     The word to be matched.
     * @param index The starting index in the main string to begin the comparison.
     * @return      True if the word matches at the given index; otherwise, false.
     */
    public static boolean match(String s, String t, int index) {
        int j = 0; // Pointer for the target string `t`

        // Loop until either the main string `s` or the target string `t` is fully traversed
        while (index < s.length() && j < t.length()) {
            // If characters do not match, return false
            if (s.charAt(index) != t.charAt(j)) {
                return false;
            }
            index++; // Move to the next character in `s`
            j++;     // Move to the next character in `t`
        }

        // Return true if all characters in `t` have been matched
        return j == t.length();
    }

    public static void main(String[] args) {
        String input = "I love programming so much, I love what I do";

        // Iterate over each character in the input string
        for (int i = 0; i <= input.length() - 1; i++) {
            // Check if the word "love" matches starting at index `i`
            if (match(input, "love", i)) {
                // Print the starting index of the match
                System.out.println(i + " ");
            }
        }
    }
}