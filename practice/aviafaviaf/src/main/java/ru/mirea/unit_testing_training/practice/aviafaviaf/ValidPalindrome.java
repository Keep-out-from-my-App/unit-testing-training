package ru.mirea.unit_testing_training.practice.aviafaviaf;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (alphabet.contains(Character.toString(s.charAt(i)))) {
                newS += s.charAt(i);
            }
        }
        s = newS;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
}
