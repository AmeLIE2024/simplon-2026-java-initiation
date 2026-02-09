package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 14
 */
class Exercise14BubbleSortTest {
    
    Exercise14BubbleSort exercise = new Exercise14BubbleSort();
    
    @Test
    void testBubbleSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.bubbleSort(new int[]{5, 2, 4, 1, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.bubbleSort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.bubbleSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 3, 6, 7}, exercise.bubbleSort(new int[]{7, 3, 1, 6, 2}));
        assertArrayEquals(new int[]{10, 20, 30, 40}, exercise.bubbleSort(new int[]{40, 10, 30, 20}));
    }
    
    @Test
    void testBubbleSortDescending() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.bubbleSortDescending(new int[]{5, 2, 4, 1, 3}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.bubbleSortDescending(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 6, 3, 2, 1}, exercise.bubbleSortDescending(new int[]{7, 3, 1, 6, 2}));
        assertArrayEquals(new int[]{40, 30, 20, 10}, exercise.bubbleSortDescending(new int[]{10, 40, 20, 30}));
    }
    
    @Test
    void testCountSwaps() {
        assertEquals(0, exercise.countSwaps(new int[]{1, 2, 3, 4, 5})); // Déjà trié
        assertTrue(exercise.countSwaps(new int[]{5, 4, 3, 2, 1}) > 0); // Plusieurs échanges nécessaires
        assertEquals(1, exercise.countSwaps(new int[]{1, 3, 2})); // Un seul échange
        assertTrue(exercise.countSwaps(new int[]{3, 1, 2}) > 0);
        assertEquals(0, exercise.countSwaps(new int[]{10, 20, 30}));
    }
    
    @Test
    void testPartialBubbleSort() {
        assertArrayEquals(new int[]{1, 2, 3, 5, 4}, exercise.partialBubbleSort(new int[]{5, 2, 3, 1, 4}, 3));
        assertArrayEquals(new int[]{1, 2, 5, 4, 3}, exercise.partialBubbleSort(new int[]{5, 2, 1, 4, 3}, 2));
        assertArrayEquals(new int[]{1, 2, 3, 4, 7, 5}, exercise.partialBubbleSort(new int[]{7, 3, 1, 4, 2, 5}, 4));
    }
}
