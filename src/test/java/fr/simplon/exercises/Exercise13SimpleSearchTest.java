package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 13
 */
class Exercise13SimpleSearchTest {
    
    Exercise13SimpleSearch exercise = new Exercise13SimpleSearch();
    
    @Test
    void testIsSorted() {
        assertTrue(exercise.isSorted(new int[]{1, 2, 3, 4, 5}));
        assertFalse(exercise.isSorted(new int[]{1, 3, 2, 4, 5}));
        assertTrue(exercise.isSorted(new int[]{1, 1, 2, 3}));
        assertTrue(exercise.isSorted(new int[]{1}));
        assertFalse(exercise.isSorted(new int[]{5, 4, 3, 2, 1}));
        assertTrue(exercise.isSorted(new int[]{10, 20, 30, 40}));
    }
    
    @Test
    void testLinearSearch() {
        assertEquals(2, exercise.linearSearch(new int[]{1, 5, 3, 9, 2}, 3));
        assertEquals(-1, exercise.linearSearch(new int[]{1, 5, 3, 9, 2}, 10));
        assertEquals(0, exercise.linearSearch(new int[]{1, 5, 3, 9, 2}, 1));
        assertEquals(4, exercise.linearSearch(new int[]{10, 20, 30, 40, 50}, 50));
        assertEquals(-1, exercise.linearSearch(new int[]{2, 4, 6}, 5));
        assertEquals(1, exercise.linearSearch(new int[]{7, 14, 21}, 14));
    }
    
    @Test
    void testBinarySearch() {
        assertEquals(2, exercise.binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
        assertEquals(-1, exercise.binarySearch(new int[]{1, 3, 5, 7, 9}, 4));
        assertEquals(0, exercise.binarySearch(new int[]{1, 3, 5, 7, 9}, 1));
        assertEquals(4, exercise.binarySearch(new int[]{1, 3, 5, 7, 9}, 9));
        assertEquals(3, exercise.binarySearch(new int[]{2, 4, 6, 8, 10}, 8));
        assertEquals(-1, exercise.binarySearch(new int[]{10, 20, 30}, 15));
    }
    
    @Test
    void testFindAllIndices() {
        assertArrayEquals(new int[]{1, 3, 4}, exercise.findAllIndices(new int[]{1, 2, 3, 2, 2}, 2));
        assertArrayEquals(new int[]{}, exercise.findAllIndices(new int[]{1, 2, 3}, 5));
        assertArrayEquals(new int[]{0}, exercise.findAllIndices(new int[]{5, 1, 2, 3}, 5));
        assertArrayEquals(new int[]{0, 2, 4}, exercise.findAllIndices(new int[]{7, 3, 7, 5, 7}, 7));
        assertArrayEquals(new int[]{1, 2}, exercise.findAllIndices(new int[]{10, 20, 20, 30}, 20));
    }
    
    @Test
    void testFindSecondMax() {
        assertEquals(8, exercise.findSecondMax(new int[]{1, 5, 3, 9, 2, 8})); // max=9, second=8
        assertEquals(75, exercise.findSecondMax(new int[]{100, 50, 75})); // max=100, second=75
        assertEquals(3, exercise.findSecondMax(new int[]{5, 3, 1})); // max=5, second=3
        assertEquals(40, exercise.findSecondMax(new int[]{10, 50, 30, 40})); // max=50, second=40
        assertEquals(15, exercise.findSecondMax(new int[]{7, 15, 20})); // max=20, second=15
    }
}
