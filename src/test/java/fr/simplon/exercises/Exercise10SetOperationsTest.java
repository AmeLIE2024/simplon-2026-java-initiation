package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

/**
 * Tests pour l'exercice 10
 */
class Exercise10SetOperationsTest {
    
    Exercise10SetOperations exercise = new Exercise10SetOperations();

    @Test
    void testContains() {
        assertTrue(exercise.contains(new int[]{1, 2, 3, 4}, 3));
        assertFalse(exercise.contains(new int[]{1, 2, 3, 4}, 5));
        assertTrue(exercise.contains(new int[]{5, 6, 7, 8}, 6));
        assertTrue(exercise.contains(new int[]{5, 6, 7, 8}, 7));
        assertFalse(exercise.contains(new int[]{}, 1));
    }
    
    @Test
    void testUnion() {
        int[] result = exercise.union(new int[]{1, 2, 3}, new int[]{3, 4, 5});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
        
        result = exercise.union(new int[]{1, 2}, new int[]{3, 4});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
        
        result = exercise.union(new int[]{1, 1, 2}, new int[]{2, 3, 3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3}, result);
        
        result = exercise.union(new int[]{5, 10, 15}, new int[]{10, 20, 30});
        Arrays.sort(result);
        assertArrayEquals(new int[]{5, 10, 15, 20, 30}, result);
    }
    
    @Test
    void testIntersection() {
        int[] result = exercise.intersection(new int[]{1, 2, 3}, new int[]{3, 4, 5});
        Arrays.sort(result);
        assertArrayEquals(new int[]{3}, result);
        
        result = exercise.intersection(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        assertArrayEquals(new int[]{}, result);
        
        result = exercise.intersection(new int[]{1, 2, 3, 4}, new int[]{2, 3, 4, 5});
        Arrays.sort(result);
        assertArrayEquals(new int[]{2, 3, 4}, result);
        
        result = exercise.intersection(new int[]{10, 20, 30}, new int[]{20, 30, 40});
        Arrays.sort(result);
        assertArrayEquals(new int[]{20, 30}, result);
    }
    
    @Test
    void testDifference() {
        int[] result = exercise.difference(new int[]{1, 2, 3}, new int[]{3, 4, 5});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2}, result);
        
        result = exercise.difference(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3}, result);
        
        result = exercise.difference(new int[]{1, 2, 3, 4}, new int[]{2, 3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 4}, result);
        
        result = exercise.difference(new int[]{10, 20, 30}, new int[]{20});
        Arrays.sort(result);
        assertArrayEquals(new int[]{10, 30}, result);
    }
    
    @Test
    void testSymmetricDifference() {
        int[] result = exercise.symmetricDifference(new int[]{1, 2, 3}, new int[]{3, 4, 5});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 4, 5}, result);
        
        result = exercise.symmetricDifference(new int[]{1, 2}, new int[]{3, 4});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
        
        result = exercise.symmetricDifference(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 6});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 5, 6}, result);
        
        result = exercise.symmetricDifference(new int[]{10, 20}, new int[]{20, 30});
        Arrays.sort(result);
        assertArrayEquals(new int[]{10, 30}, result);
    }
    
    @Test
    void testIsSubset() {
        assertTrue(exercise.isSubset(new int[]{1, 2}, new int[]{1, 2, 3, 4}));
        assertFalse(exercise.isSubset(new int[]{1, 5}, new int[]{1, 2, 3, 4}));
        assertTrue(exercise.isSubset(new int[]{2, 3}, new int[]{1, 2, 3, 4, 5}));
        assertFalse(exercise.isSubset(new int[]{6, 7}, new int[]{1, 2, 3, 4, 5}));
        assertTrue(exercise.isSubset(new int[]{}, new int[]{1, 2, 3})); // Ensemble vide est sous-ensemble
    }
    
    @Test
    void testRemoveDuplicates() {
        int[] result = exercise.removeDuplicates(new int[]{1, 2, 2, 3, 3, 3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3}, result);
        
        result = exercise.removeDuplicates(new int[]{1, 1, 1, 1});
        assertArrayEquals(new int[]{1}, result);
        
        result = exercise.removeDuplicates(new int[]{1, 2, 3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{1, 2, 3}, result);
        
        result = exercise.removeDuplicates(new int[]{5, 3, 5, 7, 3});
        Arrays.sort(result);
        assertArrayEquals(new int[]{3, 5, 7}, result);
    }
    
    @Test
    void testCountUnique() {
        assertEquals(3, exercise.countUnique(new int[]{1, 2, 2, 3, 3, 3}));
        assertEquals(1, exercise.countUnique(new int[]{5, 5, 5, 5}));
        assertEquals(5, exercise.countUnique(new int[]{1, 2, 3, 4, 5}));
        assertEquals(3, exercise.countUnique(new int[]{10, 20, 10, 30, 20}));
        assertEquals(0, exercise.countUnique(new int[]{}));
    }
}
