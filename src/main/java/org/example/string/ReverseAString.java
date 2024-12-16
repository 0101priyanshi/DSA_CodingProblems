package org.example.string;

public class ReverseAString {
    public static void main(String[] args) {
        // Call the reverse method with the input string "aatheifdg"
        reverse("aatheifdg");
    }

    public static void reverse(String str) {
        // Convert the input string to a mutable StringBuilder to allow in-place modifications
        StringBuilder s = new StringBuilder(str);

        // Initialize two pointers: 'i' pointing to the start of the string
        // and 'j' pointing to the end of the string
        int i = 0;
        int j = str.length() - 1;

        // Loop until the two pointers meet in the middle
        while (i < j) {
            // Swap the characters at positions 'i' and 'j'
            char temp = s.charAt(i); // Temporarily store the character at index 'i'
            s.setCharAt(i, s.charAt(j)); // Set the character at 'i' to the character at 'j'
            s.setCharAt(j, temp); // Set the character at 'j' to the character stored in 'temp'

            // Move the pointers closer to the middle
            i++;
            j--;
        }

        // Print the reversed string
        System.out.println(s);
    }
}