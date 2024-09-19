package ru.mirea.unit_testing_training.practice.aviafaviaf;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        while (s.charAt(s.length() - 1) == ' ') {
            s = s.substring(0, s.length() - 1);
            if (s.isEmpty())
                return 0;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                return s.length() - 1 - i;
        }
        return s.length();
    }
}
