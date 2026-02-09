package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 2
 */
class Exercise02ArithmeticOperationsTest {
    
    Exercise02ArithmeticOperations exercise = new Exercise02ArithmeticOperations();
    
    @Test
    void testAdd() {
        assertEquals(5, exercise.add(2, 3));
        assertEquals(0, exercise.add(-5, 5));
        assertEquals(100, exercise.add(42, 58));
        assertEquals(15, exercise.add(7, 8));
        assertEquals(-15, exercise.add(-7, -8));
        assertEquals(1000, exercise.add(999, 1));
    }
    
    @Test
    void testSubtract() {
        assertEquals(1, exercise.subtract(3, 2));
        assertEquals(-10, exercise.subtract(0, 10));
        assertEquals(50, exercise.subtract(100, 50));
        assertEquals(12, exercise.subtract(20, 8));
        assertEquals(-5, exercise.subtract(-10, -5));
        assertEquals(98, exercise.subtract(100, 2));
    }
    
    @Test
    void testMultiply() {
        assertEquals(6, exercise.multiply(2, 3));
        assertEquals(0, exercise.multiply(5, 0));
        assertEquals(100, exercise.multiply(10, 10));
        assertEquals(56, exercise.multiply(7, 8));
        assertEquals(-24, exercise.multiply(-6, 4));
        assertEquals(144, exercise.multiply(12, 12));
    }
    
    @Test
    void testDivide() {
        assertEquals(2, exercise.divide(6, 3));
        assertEquals(5, exercise.divide(10, 2));
        assertEquals(3, exercise.divide(10, 3));
        assertEquals(7, exercise.divide(21, 3));
        assertEquals(4, exercise.divide(20, 5));
        assertEquals(11, exercise.divide(100, 9));
    }
    
    @Test
    void testModulo() {
        assertEquals(1, exercise.modulo(10, 3));
        assertEquals(0, exercise.modulo(10, 5));
        assertEquals(2, exercise.modulo(17, 5));
        assertEquals(3, exercise.modulo(23, 4));
        assertEquals(1, exercise.modulo(100, 9));
        assertEquals(0, exercise.modulo(50, 10));
    }
}
