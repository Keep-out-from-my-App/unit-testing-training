package ru.mirea.unit_testing_training.practice.aviafaviaf;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];
        String s;
        for (int i = 1; i < strs.length; i++) {
            s = strs[i];
            longestPrefix = longestPrefix.substring(0, Math.min(longestPrefix.length(), s.length()));
            s = s.substring(0, Math.min(longestPrefix.length(), s.length()));
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != longestPrefix.charAt(j)) {
                    longestPrefix = longestPrefix.substring(0, j);
                    break;
                }
            }
        }
        return longestPrefix;
    }
}
