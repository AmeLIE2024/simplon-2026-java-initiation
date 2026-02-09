package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 3
 */
class Exercise03ConditionalStatementsTest {
    
    Exercise03ConditionalStatements exercise = new Exercise03ConditionalStatements();
    
    @Test
    void testMax() {
        assertEquals(5, exercise.max(3, 5));
        assertEquals(10, exercise.max(10, 7));
        assertEquals(0, exercise.max(-5, 0));
        assertEquals(100, exercise.max(50, 100));
        assertEquals(7, exercise.max(7, -3));
        assertEquals(42, exercise.max(15, 42));
    }
    
    @Test
    void testIsPositive() {
        assertTrue(exercise.isPositive(5));
        assertFalse(exercise.isPositive(-5));
        assertFalse(exercise.isPositive(0));
        assertTrue(exercise.isPositive(100));
        assertFalse(exercise.isPositive(-1));
        assertTrue(exercise.isPositive(42));
    }
    
    @Test
    void testAbsoluteValue() {
        assertEquals(5, exercise.absoluteValue(5));
        assertEquals(5, exercise.absoluteValue(-5));
        assertEquals(0, exercise.absoluteValue(0));
        assertEquals(100, exercise.absoluteValue(-100));
        assertEquals(42, exercise.absoluteValue(42));
        assertEquals(17, exercise.absoluteValue(-17));
    }
    
    @Test
    void testIsEven() {
        assertTrue(exercise.isEven(4));
        assertFalse(exercise.isEven(5));
        assertTrue(exercise.isEven(0));
        assertTrue(exercise.isEven(-2));
        assertFalse(exercise.isEven(7));
        assertTrue(exercise.isEven(100));
        assertFalse(exercise.isEven(99));
    }
    
    @Test
    void testGetGrade() {
        assertEquals("A", exercise.getGrade(95));
        assertEquals("B", exercise.getGrade(85));
        assertEquals("C", exercise.getGrade(75));
        assertEquals("D", exercise.getGrade(65));
        assertEquals("F", exercise.getGrade(55));
        assertEquals("A", exercise.getGrade(100));
        assertEquals("A", exercise.getGrade(90));
        assertEquals("B", exercise.getGrade(80));
        assertEquals("C", exercise.getGrade(70));
        assertEquals("D", exercise.getGrade(60));
        assertEquals("F", exercise.getGrade(0));
    }
}
