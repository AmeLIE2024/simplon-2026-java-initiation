package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 6
 */
class Exercise06ArraysMaxMinTest {
    
    Exercise06ArraysMaxMin exercise = new Exercise06ArraysMaxMin();
    
    @Test
    void testFindMax() {
        assertEquals(9, exercise.findMax(new int[]{1, 5, 3, 9, 2}));
        assertEquals(100, exercise.findMax(new int[]{100, 50, 75}));
        assertEquals(-1, exercise.findMax(new int[]{-5, -3, -1}));
        assertEquals(42, exercise.findMax(new int[]{10, 42, 15}));
        assertEquals(7, exercise.findMax(new int[]{7, 3, 5}));
        assertEquals(99, exercise.findMax(new int[]{11, 99, 33, 66}));
    }
    
    @Test
    void testFindMin() {
        assertEquals(1, exercise.findMin(new int[]{1, 5, 3, 9, 2}));
        assertEquals(50, exercise.findMin(new int[]{100, 50, 75}));
        assertEquals(-5, exercise.findMin(new int[]{-5, -3, -1}));
        assertEquals(3, exercise.findMin(new int[]{7, 3, 10}));
        assertEquals(-10, exercise.findMin(new int[]{5, -10, 0}));
        assertEquals(1, exercise.findMin(new int[]{10, 1, 20, 15}));
    }
    
    @Test
    void testFindMaxIndex() {
        assertEquals(3, exercise.findMaxIndex(new int[]{1, 5, 3, 9, 2}));
        assertEquals(0, exercise.findMaxIndex(new int[]{100, 50, 75}));
        assertEquals(2, exercise.findMaxIndex(new int[]{-5, -3, -1}));
        assertEquals(1, exercise.findMaxIndex(new int[]{10, 42, 15}));
        assertEquals(3, exercise.findMaxIndex(new int[]{11, 33, 66, 99}));
    }
    
    @Test
    void testFindMinIndex() {
        assertEquals(0, exercise.findMinIndex(new int[]{1, 5, 3, 9, 2}));
        assertEquals(1, exercise.findMinIndex(new int[]{100, 50, 75}));
        assertEquals(0, exercise.findMinIndex(new int[]{-5, -3, -1}));
        assertEquals(1, exercise.findMinIndex(new int[]{7, 3, 10}));
        assertEquals(2, exercise.findMinIndex(new int[]{10, 20, 1, 15}));
    }
    
    @Test
    void testRange() {
        assertEquals(8, exercise.range(new int[]{1, 5, 3, 9, 2})); // 9 - 1
        assertEquals(50, exercise.range(new int[]{100, 50, 75})); // 100 - 50
        assertEquals(4, exercise.range(new int[]{-5, -3, -1})); // -1 - (-5)
        assertEquals(15, exercise.range(new int[]{10, 25, 15})); // 25 - 10
        assertEquals(50, exercise.range(new int[]{0, 50, 25})); // 50 - 0
    }
}
