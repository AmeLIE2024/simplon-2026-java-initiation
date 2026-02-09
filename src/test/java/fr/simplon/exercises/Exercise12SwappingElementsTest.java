package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 12
 */
class Exercise12SwappingElementsTest {
    
    Exercise12SwappingElements exercise = new Exercise12SwappingElements();
    
    @Test
    void testSwap() {
        int[] array = {1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{5, 2, 3, 4, 1}, exercise.swap(array, 0, 4));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.swap(array, 1, 3));
        
        int[] array2 = {10, 20, 30};
        assertArrayEquals(new int[]{30, 20, 10}, exercise.swap(array2, 0, 2));
    }
    
    @Test
    void testShiftLeft() {
        // Shift from right to left
        assertArrayEquals(new int[]{4, 1, 2, 3, 5}, exercise.shiftLeft(new int[]{1, 2, 3, 4, 5}, 3, 0));
        assertArrayEquals(new int[]{1, 5, 2, 3, 4}, exercise.shiftLeft(new int[]{1, 2, 3, 4, 5}, 4, 1));
        assertArrayEquals(new int[]{1, 2, 4, 3, 5}, exercise.shiftLeft(new int[]{1, 2, 3, 4, 5}, 3, 2));
    }
    
    @Test
    void testShiftRight() {
        // Shift from left to right
        assertArrayEquals(new int[]{2, 3, 4, 1, 5}, exercise.shiftRight(new int[]{1, 2, 3, 4, 5}, 0, 3));
        assertArrayEquals(new int[]{1, 3, 4, 5, 2}, exercise.shiftRight(new int[]{1, 2, 3, 4, 5}, 1, 4));
        assertArrayEquals(new int[]{1, 3, 2, 4, 5}, exercise.shiftRight(new int[]{1, 2, 3, 4, 5}, 1, 2));
    }
    
    @Test
    void testMoveSmallestToFront() {
        assertArrayEquals(new int[]{1, 5, 3, 2, 4}, exercise.moveSmallestToFront(new int[]{5, 3, 2, 1, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, exercise.moveSmallestToFront(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 5, 3}, exercise.moveSmallestToFront(new int[]{5, 3, 1}));
        assertArrayEquals(new int[]{7, 10, 15, 20}, exercise.moveSmallestToFront(new int[]{10, 15, 20, 7}));
    }
    
    @Test
    void testMoveLargestToEnd() {
        assertArrayEquals(new int[]{1, 3, 2, 4, 5}, exercise.moveLargestToEnd(new int[]{1, 5, 3, 2, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, exercise.moveLargestToEnd(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 3, 5}, exercise.moveLargestToEnd(new int[]{5, 1, 3}));
        assertArrayEquals(new int[]{7, 10, 15, 20}, exercise.moveLargestToEnd(new int[]{7, 20, 10, 15}));
    }
    
    @Test
    void testIsInOrder() {
        int[] array = {1, 2, 5, 3, 4};
        assertTrue(exercise.isInOrder(array, 0)); // 1 <= 2
        assertTrue(exercise.isInOrder(array, 1)); // 2 <= 5
        assertFalse(exercise.isInOrder(array, 2)); // 5 > 3
        assertTrue(exercise.isInOrder(array, 3)); // 3 <= 4
        
        int[] array2 = {10, 20, 30};
        assertTrue(exercise.isInOrder(array2, 0));
        assertTrue(exercise.isInOrder(array2, 1));
    }
    
    @Test
    void testBubblePass() {
        assertArrayEquals(new int[]{1, 2, 4, 3, 5}, exercise.bubblePass(new int[]{2, 1, 4, 5, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.bubblePass(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 3, 2, 5, 4}, exercise.bubblePass(new int[]{3, 1, 5, 2, 4}));
    }
    
    @Test
    void testCountInversions() {
        assertEquals(0, exercise.countInversions(new int[]{1, 2, 3, 4, 5})); // Déjà trié
        assertEquals(4, exercise.countInversions(new int[]{5, 4, 3, 2, 1})); // 5>4, 4>3, 3>2, 2>1
        assertEquals(1, exercise.countInversions(new int[]{1, 3, 2})); // 3>2
        assertEquals(2, exercise.countInversions(new int[]{3, 2, 1})); // 3>2, 2>1
        assertEquals(0, exercise.countInversions(new int[]{10, 20, 30, 40}));
    }
}
