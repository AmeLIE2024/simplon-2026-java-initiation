package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 11
 */
class Exercise11TwoDimensionalArraysTest {
    
    Exercise11TwoDimensionalArrays exercise = new Exercise11TwoDimensionalArrays();
    
    @Test
    void testCreateMatrix() {
        int[][] result = exercise.createMatrix(2, 3);
        assertEquals(2, result.length);
        assertEquals(3, result[0].length);
        assertEquals(0, result[0][0]);
        assertEquals(0, result[1][2]);
        
        int[][] result2 = exercise.createMatrix(3, 3);
        assertEquals(3, result2.length);
        assertEquals(3, result2[0].length);
    }
    
    @Test
    void testSumMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        assertEquals(21, exercise.sumMatrix(matrix)); // 1+2+3+4+5+6 = 21
        
        int[][] matrix2 = {{1, 1}, {1, 1}};
        assertEquals(4, exercise.sumMatrix(matrix2));
        
        int[][] matrix3 = {{10, 20}, {30, 40}, {50, 60}};
        assertEquals(210, exercise.sumMatrix(matrix3));
    }
    
    @Test
    void testFindMaxInMatrix() {
        int[][] matrix = {{1, 5, 3}, {9, 2, 7}};
        assertEquals(9, exercise.findMaxInMatrix(matrix));
        
        int[][] matrix2 = {{-5, -1}, {-10, -3}};
        assertEquals(-1, exercise.findMaxInMatrix(matrix2));
        
        int[][] matrix3 = {{100, 50}, {75, 200}};
        assertEquals(200, exercise.findMaxInMatrix(matrix3));
    }
    
    @Test
    void testTranspose() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};
        assertArrayEquals(expected, exercise.transpose(matrix));
        
        int[][] square = {{1, 2}, {3, 4}};
        int[][] expectedSquare = {{1, 3}, {2, 4}};
        assertArrayEquals(expectedSquare, exercise.transpose(square));
        
        int[][] matrix3 = {{10, 20, 30}};
        int[][] expected3 = {{10}, {20}, {30}};
        assertArrayEquals(expected3, exercise.transpose(matrix3));
    }
    
    @Test
    void testGetDiagonal() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(new int[]{1, 5, 9}, exercise.getDiagonal(matrix));
        
        int[][] matrix2 = {{1, 0}, {0, 1}};
        assertArrayEquals(new int[]{1, 1}, exercise.getDiagonal(matrix2));
        
        int[][] matrix3 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        assertArrayEquals(new int[]{10, 50, 90}, exercise.getDiagonal(matrix3));
    }
}
