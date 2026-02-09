package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 8
 */
class Exercise08StringManipulationTest {
    
    Exercise08StringManipulation exercise = new Exercise08StringManipulation();
    
    @Test
    void testReverseString() {
        assertEquals("olleh", exercise.reverseString("hello"));
        assertEquals("dcba", exercise.reverseString("abcd"));
        assertEquals("a", exercise.reverseString("a"));
        assertEquals("dlrow", exercise.reverseString("world"));
        assertEquals("avaJ", exercise.reverseString("Java"));
    }
    
    @Test
    void testIsPalindrome() {
        assertTrue(exercise.isPalindrome("radar"));
        assertTrue(exercise.isPalindrome("level"));
        assertFalse(exercise.isPalindrome("hello"));
        assertTrue(exercise.isPalindrome("a"));
        assertTrue(exercise.isPalindrome("noon"));
        assertFalse(exercise.isPalindrome("world"));
    }
    
    @Test
    void testCountVowels() {
        assertEquals(2, exercise.countVowels("hello")); // e, o
        assertEquals(5, exercise.countVowels("aeiou")); // a, e, i, o, u
        assertEquals(5, exercise.countVowels("AEIOU")); // A, E, I, O, U (majuscules)
        assertEquals(0, exercise.countVowels("xyz"));
        assertEquals(3, exercise.countVowels("programming")); // o, a, i
        assertEquals(0, exercise.countVowels("sky"));
    }
    
    @Test
    void testCountWords() {
        assertEquals(3, exercise.countWords("hello world test"));
        assertEquals(1, exercise.countWords("hello"));
        assertEquals(4, exercise.countWords("one two three four"));
        assertEquals(2, exercise.countWords("Java programming"));
        assertEquals(5, exercise.countWords("this is a simple test"));
    }
    
    @Test
    void testCapitalizeWords() {
        assertEquals("Hello World", exercise.capitalizeWords("hello world"));
        assertEquals("Java Programming", exercise.capitalizeWords("java programming"));
        assertEquals("A", exercise.capitalizeWords("a"));
        assertEquals("Test Case", exercise.capitalizeWords("test case"));
        assertEquals("Simple Example", exercise.capitalizeWords("simple example"));
    }
}
