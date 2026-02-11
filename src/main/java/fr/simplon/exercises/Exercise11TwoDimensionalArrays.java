package fr.simplon.exercises;

/**
 * Exercice 11: Tableaux à deux dimensions
 * 
 * Objectif: Apprendre à manipuler des tableaux à deux dimensions (matrices)
 */
public class Exercise11TwoDimensionalArrays {

    /**
     * Crée une matrice remplie de zéros
     * @param rows nombre de lignes
     * @param cols nombre de colonnes
     * @return une matrice rows x cols remplie de 0
     */
    public int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for(int i=0; i < rows ; i++) {
            for(int j=0; j < cols ; j++){
                matrix [i][j] = matrix[0][0] ;
            }
        }
        return matrix;
    }
    
    /**
     * Calcule la somme de tous les éléments d'une matrice
     * @param matrix la matrice
     * @return la somme de tous les éléments
     */
    public int sumMatrix(int[][] matrix) {
        int somme = 0;
        for(int i=0; i < matrix.length ; i++){
            for(int j=0; j < matrix[i].length ; j++){
                somme += matrix[i][j];
            }
        }
        return somme;
    }
    
    /**
     * Trouve le maximum dans une matrice
     * @param matrix la matrice
     * @return la valeur maximale
     */
    public int findMaxInMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for(int i=0; i < matrix.length ; i++){
            for(int j=0; j < matrix[i].length ; j++){
                if(matrix[i][j] > max){
                max = matrix[i][j];
                }
            }              
        }
        return max;
    }
    
    /**
     * Transpose une matrice (lignes ↔ colonnes)
     * @param matrix la matrice à transposer
     * @return la matrice transposée
     */
    public int[][] transpose(int[][] matrix) {
        int[][] transpMatrix = new int [matrix[0].length][matrix.length];
        for(int i=0 ; i < matrix.length ; i++){
            for(int j=0 ; j < matrix[0].length ; j++){
                transpMatrix[j][i] = matrix[i][j];
            }
        }
        return transpMatrix;
    }
    
    /**
     * Retourne la diagonale principale d'une matrice carrée
     * @param matrix la matrice carrée
     * @return un tableau contenant les éléments de la diagonale
     */
    public int[] getDiagonal(int[][] matrix) {
        int[] diagonale = new int[matrix.length];
        for(int i = 0 ; i < matrix.length ; i++){
           diagonale[i] = matrix[i][i];
        }
        return diagonale;
    }
    
}
