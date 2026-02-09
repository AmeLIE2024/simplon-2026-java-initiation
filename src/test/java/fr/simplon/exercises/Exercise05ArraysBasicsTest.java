package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 5
 */
class Exercise05ArraysBasicsTest {
    
    Exercise05ArraysBasics exercise = new Exercise05ArraysBasics();
    
    @Test
    void testCreateSequence() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.createSequence(5));
        assertArrayEquals(new int[]{1}, exercise.createSequence(1));
        assertArrayEquals(new int[]{1, 2, 3}, exercise.createSequence(3));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, exercise.createSequence(7));
        assertArrayEquals(new int[]{1, 2}, exercise.createSequence(2));
    }
    
    @Test
    void testGetFirstElement() {
        assertEquals(1, exercise.getFirstElement(new int[]{1, 2, 3}));
        assertEquals(10, exercise.getFirstElement(new int[]{10, 20, 30}));
        assertEquals(42, exercise.getFirstElement(new int[]{42}));
        assertEquals(5, exercise.getFirstElement(new int[]{5, 15, 25}));
    }
    
    @Test
    void testGetLastElement() {
        assertEquals(3, exercise.getLastElement(new int[]{1, 2, 3}));
        assertEquals(30, exercise.getLastElement(new int[]{10, 20, 30}));
        assertEquals(7, exercise.getLastElement(new int[]{3, 5, 7}));
        assertEquals(100, exercise.getLastElement(new int[]{50, 75, 100}));
    }
    
    @Test
    void testCountOccurrences() {
        assertEquals(3, exercise.countOccurrences(new int[]{1, 2, 3, 2, 2}, 2));
        assertEquals(0, exercise.countOccurrences(new int[]{1, 2, 3}, 5));
        assertEquals(1, exercise.countOccurrences(new int[]{1, 2, 3}, 3));
        assertEquals(4, exercise.countOccurrences(new int[]{5, 5, 3, 5, 5}, 5));
        assertEquals(2, exercise.countOccurrences(new int[]{7, 7, 8}, 7));
    }
    
    @Test
    void testContains() {
        assertTrue(exercise.contains(new int[]{1, 2, 3}, 2));
        assertFalse(exercise.contains(new int[]{1, 2, 3}, 5));
        assertTrue(exercise.contains(new int[]{10, 20, 30}, 30));
        assertTrue(exercise.contains(new int[]{42, 7, 15}, 42));
        assertFalse(exercise.contains(new int[]{1, 3, 5}, 2));
    }
}
