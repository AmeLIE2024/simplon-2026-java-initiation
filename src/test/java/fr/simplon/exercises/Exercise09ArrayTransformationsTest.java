package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 9
 */
class Exercise09ArrayTransformationsTest {
    
    Exercise09ArrayTransformations exercise = new Exercise09ArrayTransformations();
    
    @Test
    void testDoubleElements() {
        assertArrayEquals(new int[]{2, 4, 6}, exercise.doubleElements(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{10, 20, 30}, exercise.doubleElements(new int[]{5, 10, 15}));
        assertArrayEquals(new int[]{}, exercise.doubleElements(new int[]{}));
        assertArrayEquals(new int[]{14, 28, 42}, exercise.doubleElements(new int[]{7, 14, 21}));
        assertArrayEquals(new int[]{100, 200}, exercise.doubleElements(new int[]{50, 100}));
    }
    
    @Test
    void testFilterEvenNumbers() {
        assertArrayEquals(new int[]{2, 4}, exercise.filterEvenNumbers(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{10, 20}, exercise.filterEvenNumbers(new int[]{10, 15, 20}));
        assertArrayEquals(new int[]{}, exercise.filterEvenNumbers(new int[]{1, 3, 5}));
        assertArrayEquals(new int[]{2, 4, 6, 8}, exercise.filterEvenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertArrayEquals(new int[]{100, 200, 300}, exercise.filterEvenNumbers(new int[]{100, 155, 200, 255, 300}));
    }
    
    @Test
    void testReverseArray() {
        assertArrayEquals(new int[]{3, 2, 1}, exercise.reverseArray(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.reverseArray(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1}, exercise.reverseArray(new int[]{1}));
        assertArrayEquals(new int[]{4, 3, 2, 1}, exercise.reverseArray(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{7, 6, 5}, exercise.reverseArray(new int[]{5, 6, 7}));
    }
    
    @Test
    void testConcatenate() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.concatenate(new int[]{1, 2}, new int[]{3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3}, exercise.concatenate(new int[]{1, 2, 3}, new int[]{}));
        assertArrayEquals(new int[]{4, 5}, exercise.concatenate(new int[]{}, new int[]{4, 5}));
        assertArrayEquals(new int[]{10, 20, 30, 40}, exercise.concatenate(new int[]{10, 20}, new int[]{30, 40}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, exercise.concatenate(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }
    
    @Test
    void testSlice() {
        assertArrayEquals(new int[]{2, 3}, exercise.slice(new int[]{1, 2, 3, 4, 5}, 1, 3));
        assertArrayEquals(new int[]{1, 2, 3}, exercise.slice(new int[]{1, 2, 3, 4, 5}, 0, 3));
        assertArrayEquals(new int[]{4, 5}, exercise.slice(new int[]{1, 2, 3, 4, 5}, 3, 5));
        assertArrayEquals(new int[]{3, 4, 5}, exercise.slice(new int[]{1, 2, 3, 4, 5, 6}, 2, 5));
        assertArrayEquals(new int[]{10, 20}, exercise.slice(new int[]{5, 10, 20, 30}, 1, 3));
    }
}
