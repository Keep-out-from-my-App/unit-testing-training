package ru.mirea.unit_testing_training.practice.aviafaviaf

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLastWordTest {

    @Test
    fun `check last word with length 5`() {
        val lengthOfLastWord = LengthOfLastWord()
        val s = "Hello world"

        val res = lengthOfLastWord.lengthOfLastWord(s)

        assertEquals(5, res)
    }

    @Test
    fun `check last word with length 5 with spaces after`() {
        val lengthOfLastWord = LengthOfLastWord()
        val s = "Hello world     "

        val res = lengthOfLastWord.lengthOfLastWord(s)

        assertEquals(5, res)
    }

    @Test
    fun `check last word with length 5 with more spaces before`() {
        val lengthOfLastWord = LengthOfLastWord()
        val s = "Hello world     "

        val res = lengthOfLastWord.lengthOfLastWord(s)

        assertEquals(5, res)
    }

    @Test
    fun `one word with length 5`() {
        val lengthOfLastWord = LengthOfLastWord()
        val s = "world"

        val res = lengthOfLastWord.lengthOfLastWord(s)

        assertEquals(5, res)
    }
}