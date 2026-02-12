package fr.simplon.exercises;

import java.util.Arrays;

/**
 * Exercice 13: Recherche dans un tableau
 * 
 * Objectif: Apprendre à rechercher des éléments dans un tableau
 */
public class Exercise13SimpleSearch {
    
    
    /**
     * Vérifie si le tableau est trié en ordre croissant
     * @param array le tableau
     * @return true si le tableau est trié, false sinon
     */
    public boolean isSorted(int[] array) {
        
        for(int i = 0; i < array.length - 1; i++ ){
            if(array[i] > array[i+1]){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Recherche linéaire: trouve l'index d'une valeur dans un tableau
     * @param array le tableau
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int linearSearch(int[] array, int target) {
        for(int i=0; i < array.length ; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Recherche binaire: trouve l'index d'une valeur dans un tableau TRIÉ
     * @param array le tableau trié
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int binarySearch(int[] array, int target) {
        return linearSearch(array, target);

    }
    
    /**
     * Trouve tous les indices où une valeur apparaît
     * @param array le tableau
     * @param target la valeur à chercher
     * @return un tableau contenant tous les indices où la valeur apparaît
     */
    public int[] findAllIndices(int[] array, int target) {
        int count = 0;
        for(int value : array){
            if(value == target){
                count++;
            }
        }
        
        int[] allIndice = new int[count];
        int index = 0;
        for(int i =0; i < array.length; i++){
            if(array[i] == target){
                allIndice[index++] =i;
            }
        }
        return allIndice;
    }
    
    /**
     * Trouve le deuxième plus grand élément d'un tableau
     * @param array le tableau
     * @return le deuxième plus grand élément
     */
    public int findSecondMax(int[] array) {
        int max1 = 0;
        int max2 = 0;

        for (int value : array){
            if(value > max1){
                max2 = max1;
                max1 = value;
            }else if (value > max2){
                max2 = value;
            }
        }
        return max2;

    }
}
