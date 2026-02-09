package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 7
 */
class Exercise07ArraysSumAverageTest {
    
    Exercise07ArraysSumAverage exercise = new Exercise07ArraysSumAverage();
    
    @Test
    void testSum() {
        assertEquals(15, exercise.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, exercise.sum(new int[]{-5, 5}));
        assertEquals(100, exercise.sum(new int[]{100}));
        assertEquals(30, exercise.sum(new int[]{10, 10, 10}));
        assertEquals(25, exercise.sum(new int[]{5, 7, 8, 5}));
        assertEquals(60, exercise.sum(new int[]{15, 20, 25}));
    }
    
    @Test
    void testAverage() {
        assertEquals(3, exercise.average(new int[]{1, 2, 3, 4, 5})); // 15 / 5
        assertEquals(5, exercise.average(new int[]{3, 5, 7})); // 15 / 3
        assertEquals(50, exercise.average(new int[]{50}));
        assertEquals(10, exercise.average(new int[]{10, 10, 10}));
        assertEquals(7, exercise.average(new int[]{5, 7, 9}));
        assertEquals(20, exercise.average(new int[]{15, 20, 25}));
    }
    
    @Test
    void testCountAboveAverage() {
        assertEquals(2, exercise.countAboveAverage(new int[]{1, 2, 3, 4, 5})); // moyenne=3, 4 et 5 sont supérieurs
        assertEquals(1, exercise.countAboveAverage(new int[]{3, 5, 7})); // moyenne=5, seulement 7 est supérieur
        assertEquals(0, exercise.countAboveAverage(new int[]{5, 5, 5})); // moyenne=5, aucun élément n'est supérieur
        assertEquals(1, exercise.countAboveAverage(new int[]{10, 20, 30})); // moyenne=20, seulement 30 est supérieur
        assertEquals(2, exercise.countAboveAverage(new int[]{1, 5, 10, 15})); // moyenne=7.75, 10 et 15 sont supérieurs
    }
    
    @Test
    void testSumEvenNumbers() {
        assertEquals(6, exercise.sumEvenNumbers(new int[]{1, 2, 3, 4})); // 2 + 4
        assertEquals(0, exercise.sumEvenNumbers(new int[]{1, 3, 5}));
        assertEquals(30, exercise.sumEvenNumbers(new int[]{10, 20}));
        assertEquals(12, exercise.sumEvenNumbers(new int[]{2, 4, 6}));
        assertEquals(60, exercise.sumEvenNumbers(new int[]{10, 15, 20, 30}));
    }
    
    @Test
    void testProduct() {
        assertEquals(120, exercise.product(new int[]{1, 2, 3, 4, 5})); // 1*2*3*4*5
        assertEquals(24, exercise.product(new int[]{2, 3, 4}));
        assertEquals(10, exercise.product(new int[]{10}));
        assertEquals(6, exercise.product(new int[]{2, 3}));
        assertEquals(100, exercise.product(new int[]{10, 10}));
        assertEquals(60, exercise.product(new int[]{3, 4, 5}));
    }
}
