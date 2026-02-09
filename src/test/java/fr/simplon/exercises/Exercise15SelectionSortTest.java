package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

/**
 * Tests pour l'exercice 15
 */
class Exercise15SelectionSortTest {
    
    Exercise15SelectionSort exercise = new Exercise15SelectionSort();
    
    @Test
    void testSelectionSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.selectionSort(new int[]{5, 2, 4, 1, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.selectionSort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.selectionSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 3, 6, 7}, exercise.selectionSort(new int[]{7, 3, 1, 6, 2}));
        assertArrayEquals(new int[]{10, 20, 30, 40}, exercise.selectionSort(new int[]{40, 10, 30, 20}));
    }
    
    @Test
    void testSelectionSortDescending() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.selectionSortDescending(new int[]{5, 2, 4, 1, 3}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.selectionSortDescending(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 6, 3, 2, 1}, exercise.selectionSortDescending(new int[]{7, 3, 1, 6, 2}));
        assertArrayEquals(new int[]{40, 30, 20, 10}, exercise.selectionSortDescending(new int[]{10, 40, 20, 30}));
    }
    
    @Test
    void testFindKSmallest() {
        int[] result = exercise.findKSmallest(new int[]{5, 2, 4, 1, 3}, 3);
        Arrays.sort(result); // On trie pour comparer car l'ordre n'est pas garanti
        assertArrayEquals(new int[]{1, 2, 3}, result);
        
        result = exercise.findKSmallest(new int[]{10, 5, 20, 15}, 2);
        Arrays.sort(result);
        assertArrayEquals(new int[]{5, 10}, result);
        
        result = exercise.findKSmallest(new int[]{7, 3, 9, 1, 5}, 4);
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 3, 5, 7}, result);
    }
    
    @Test
    void testCountComparisons() {
        assertTrue(exercise.countComparisons(new int[]{5, 2, 4, 1, 3}) > 0);
        assertTrue(exercise.countComparisons(new int[]{1, 2, 3, 4, 5}) > 0);
        assertTrue(exercise.countComparisons(new int[]{10, 20, 30}) > 0);
    }
}
