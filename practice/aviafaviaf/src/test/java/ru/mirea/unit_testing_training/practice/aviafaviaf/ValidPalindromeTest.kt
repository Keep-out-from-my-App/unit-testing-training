package ru.mirea.unit_testing_training.practice.aviafaviaf

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidPalindromeTest {

    @Test
    fun `palindrome true even`() {
        val validPalindrome = ValidPalindrome()
        val s = "abc ba"

        val res = validPalindrome.isPalindrome(s)

        assertTrue(res)
    }

    @Test
    fun `palindrome true not even`() {
        val validPalindrome = ValidPalindrome()
        val s = "ab ba"

        val res = validPalindrome.isPalindrome(s)

        assertTrue(res)
    }

    @Test
    fun `palindrome false even`() {
        val validPalindrome = ValidPalindrome()
        val s = "a, bcbc"

        val res = validPalindrome.isPalindrome(s)

        assertFalse(res)
    }

    @Test
    fun `palindrome false not even`() {
        val validPalindrome = ValidPalindrome()
        val s = "abbc "

        val res = validPalindrome.isPalindrome(s)

        assertFalse(res)
    }

    @Test
    fun `palindrome one char`() {
        val validPalindrome = ValidPalindrome()
        val s = "a"

        val res = validPalindrome.isPalindrome(s)

        assertTrue(res)
    }
}