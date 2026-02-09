package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 4
 */
class Exercise04LoopsTest {
    
    Exercise04Loops exercise = new Exercise04Loops();
    
    @Test
    void testSumUpToN() {
        assertEquals(15, exercise.sumUpToN(5)); // 1+2+3+4+5
        assertEquals(55, exercise.sumUpToN(10));
        assertEquals(1, exercise.sumUpToN(1));
        assertEquals(0, exercise.sumUpToN(0));
        assertEquals(6, exercise.sumUpToN(3));
        assertEquals(21, exercise.sumUpToN(6));
        assertEquals(36, exercise.sumUpToN(8));
    }
    
    @Test
    void testFactorial() {
        assertEquals(1, exercise.factorial(0));
        assertEquals(1, exercise.factorial(1));
        assertEquals(2, exercise.factorial(2));
        assertEquals(6, exercise.factorial(3));
        assertEquals(120, exercise.factorial(5));
        assertEquals(24, exercise.factorial(4));
        assertEquals(720, exercise.factorial(6));
    }
    
    @Test
    void testCountDigits() {
        assertEquals(1, exercise.countDigits(0));
        assertEquals(1, exercise.countDigits(5));
        assertEquals(3, exercise.countDigits(123));
        assertEquals(5, exercise.countDigits(12345));
        assertEquals(2, exercise.countDigits(42));
        assertEquals(4, exercise.countDigits(9876));
        assertEquals(6, exercise.countDigits(100000));
    }
    
    @Test
    void testReverseNumber() {
        assertEquals(321, exercise.reverseNumber(123));
        assertEquals(1, exercise.reverseNumber(100));
        assertEquals(54321, exercise.reverseNumber(12345));
        assertEquals(0, exercise.reverseNumber(0));
        assertEquals(87, exercise.reverseNumber(78));
        assertEquals(6789, exercise.reverseNumber(9876));
    }
    
    @Test
    void testIsPrime() {
        assertFalse(exercise.isPrime(1));
        assertTrue(exercise.isPrime(2));
        assertTrue(exercise.isPrime(3));
        assertFalse(exercise.isPrime(4));
        assertTrue(exercise.isPrime(7));
        assertFalse(exercise.isPrime(9));
        assertTrue(exercise.isPrime(13));
        assertTrue(exercise.isPrime(17));
        assertFalse(exercise.isPrime(15));
        assertTrue(exercise.isPrime(23));
        assertFalse(exercise.isPrime(100));
    }
}
