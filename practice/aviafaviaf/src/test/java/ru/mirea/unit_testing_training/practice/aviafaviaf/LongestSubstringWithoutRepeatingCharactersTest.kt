package ru.mirea.unit_testing_training.practice.aviafaviaf

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    fun `longest in the middle`() {
        val longestSubstringWithoutRepeatingCharacters = LongestSubstringWithoutRepeatingCharacters()
        val s = "pwwkew"

        val res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s)

        assertEquals(5, res)
    }

    @Test
    fun `longest in the start`() {
        val longestSubstringWithoutRepeatingCharacters = LongestSubstringWithoutRepeatingCharacters()
        val s = "dfghaa"

        val res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s)

        assertEquals(5, res)
    }

    @Test
    fun `only repeating characters`() {
        val longestSubstringWithoutRepeatingCharacters = LongestSubstringWithoutRepeatingCharacters()
        val s = "aaaaaaaaa"

        val res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s)

        assertEquals(1, res)
    }

    @Test
    fun `empty string`() {
        val longestSubstringWithoutRepeatingCharacters = LongestSubstringWithoutRepeatingCharacters()
        val s = ""

        val res = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s)

        assertEquals(0, res)
    }
}