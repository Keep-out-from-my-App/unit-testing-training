package ru.mirea.unit_testing_training.practice.aviafaviaf;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        String currentS = "";
        for (int i = 0; i < s.length(); i++) {
            if (!currentS.contains(Character.toString(s.charAt(i)))) {
                currentS += s.charAt(i);
            }
            else {
                answer = Math.max(currentS.length(), answer);
                i -= (currentS.length() - 1);
                currentS = "";
            }
        }
        return answer;
    };
}
