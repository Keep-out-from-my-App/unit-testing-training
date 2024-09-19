package ru.mirea.unit_testing_training.practice.aviafaviaf

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidAnagramTest {

    @Test
    fun `anagram true`() {
        val validAnagram = ValidAnagram()
        val s1 = "abcd"
        val s2 = "dbca"

        val res = validAnagram.isValidAnagram(s1, s2)

        assertTrue(res)
    }

    @Test
    fun `anagram false`() {
        val validAnagram = ValidAnagram()
        val s1 = "abcd"
        val s2 = "dbha"

        val res = validAnagram.isValidAnagram(s1, s2)

        assertFalse(res)
    }

    @Test
    fun `anagram with one char`() {
        val validAnagram = ValidAnagram()
        val s1 = "a"
        val s2 = "a"

        val res = validAnagram.isValidAnagram(s1, s2)

        assertTrue(res)
    }

    @Test
    fun `anagram with one different char`() {
        val validAnagram = ValidAnagram()
        val s1 = "a"
        val s2 = "b"

        val res = validAnagram.isValidAnagram(s1, s2)

        assertFalse(res)
    }
}