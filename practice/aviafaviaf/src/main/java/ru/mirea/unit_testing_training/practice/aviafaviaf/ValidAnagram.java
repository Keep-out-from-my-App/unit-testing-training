package ru.mirea.unit_testing_training.practice.aviafaviaf;

public class ValidAnagram {
    public boolean isValidAnagram(String string1, String string2) {
        for (int i = 0; i < string1.length(); i++) {
            if (count(string1, string1.charAt(i)) != count(string2, string1.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private int count(String s, char c) {
        return s.length() - s.replace(Character.toString(c), "").length();
    }
}