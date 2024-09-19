package ru.mirea.unit_testing_training.practice.aviafaviaf

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestCommonPrefixTest {

    @Test
    fun `3 words with common prefix an`() {
        val longestCommonPrefix = LongestCommonPrefix()
        val words = arrayOf("anon", "anime", "anton")

        val res = longestCommonPrefix.longestCommonPrefix(words)

        assertEquals("an", res)
    }

    @Test
    fun `words without common prefix`() {
        val longestCommonPrefix = LongestCommonPrefix()
        val words = arrayOf("sanon", "qanime", "ranton")

        val res = longestCommonPrefix.longestCommonPrefix(words)

        assertEquals("", res)
    }

    @Test
    fun `only one word`() {
        val longestCommonPrefix = LongestCommonPrefix()
        val words = arrayOf("anon")

        val res = longestCommonPrefix.longestCommonPrefix(words)

        assertEquals("anon", res)
    }

    @Test
    fun `multi equals words`() {
        val longestCommonPrefix = LongestCommonPrefix()
        val words = arrayOf("anon", "anon", "anon")

        val res = longestCommonPrefix.longestCommonPrefix(words)

        assertEquals("anon", res)
    }

    @Test
    fun `one word is common prefix`() {
        val longestCommonPrefix = LongestCommonPrefix()
        val words = arrayOf("anont", "anon", "anonui")

        val res = longestCommonPrefix.longestCommonPrefix(words)

        assertEquals("anon", res)
    }
}