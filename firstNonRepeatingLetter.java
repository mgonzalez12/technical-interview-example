/*
Write a function that takes a string input, and returns the first character that is not repeated anywhere in the string. Characters in strings consist of printable characters.

As an added challenge, upper- and lowercase letters are considered the same character, but the function should return the correct case for the initial letter. For example, the input 'sTreSS' should return 'T'.

If a string contains all repeating characters, it should return the empty string ("").

*/

public static String firstNonRepeatingLetter(String str) {
        // Create a map to store the count of each character in the string
        Map<Character, Integer> counts = new HashMap<>();

        // Loop through each character in the string and update the count in the map
        for (char c : str.toCharArray()) {
            char lowerCase = Character.toLowerCase(c);
            counts.put(lowerCase, counts.getOrDefault(lowerCase, 0) + 1);
        }

        // Loop through each character in the string again and return the first one that has a count of 1 in the map
        for (char c : str.toCharArray()) {
            char lowerCase = Character.toLowerCase(c);
            if (counts.get(lowerCase) == 1) {
                return String.valueOf(c);
            }
        }

        // If we didn't find any non-repeating characters, return an empty string
        return "";
    }