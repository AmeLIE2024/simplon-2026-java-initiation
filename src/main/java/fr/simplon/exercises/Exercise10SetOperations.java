package fr.simplon.exercises;

import java.util.Arrays;

/**
 * Exercice 10: Opérations sur les ensembles
 * 
 * Objectif: Apprendre les opérations mathématiques sur les ensembles (union, intersection, différence)
 */
public class Exercise10SetOperations {
    
    /**
     * Vérifie si une valeur est présente dans un tableau (sur une portion)
     * @param array le tableau à parcourir
     * @param value la valeur recherchée
     * @return true si la valeur est trouvée dans les length premiers éléments
     */
    public boolean contains(int[] array, int value) {
        for(int i : array){
            if(i == value){
            return true;
            }
        }
        return false;
    }

    /**
     * Union de deux tableaux (tous les éléments uniques des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant tous les éléments uniques des deux tableaux
     */
    public int[] union(int[] array1, int[] array2) {
          
        int[] combined = new int [array1.length + array2.length];
        
        for(int i=0; i < array1.length; i++){
            combined[i] = array1[i];
        }
        for(int j=0; j< array2.length; j++){
            combined[array1.length + j] = array2[j];
        }
        Arrays.sort(combined);
        if(combined.length == 0) return new int[0];

        int unique = 1;
        for(int k = 1 ; k < combined.length ; k++){
            if(combined[k] != combined[k -1]){
                unique++;
            }
        }
        
        int [] result = new int[unique];
        result[0] = combined[0];
        int currentIndex = 1;
        for(int z=1 ; z < combined.length; z++) {
            if(combined[z] != combined[z - 1]) {
                result[currentIndex] = combined[z];
                currentIndex++;
            }
        }
        return result;
         }
        

    /**
     * Intersection de deux tableaux (éléments présents dans les deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans les deux tableaux
     */
    public int[] intersection(int[] array1, int[] array2) {
     
    Arrays.sort(array1);
    Arrays.sort(array2);

    int count = 0;
    int i = 0, j = 0;
    while (i < array1.length && j < array2.length) {
        if (array1[i] < array2[j]) {
            i++;
        } else if (array1[i] > array2[j]) {
            j++;
        } else {
          
            if (count == 0 || array1[i] != array1[i - 1]) {
                count++;
            }
            i++;
            j++;
        }
    }
   
    int[] result = new int[count];
    int k = 0;
    i = 0; j = 0;
    while (i < array1.length && j < array2.length) {
        if (array1[i] < array2[j]) {
            i++;
        } else if (array1[i] > array2[j]) {
            j++;
        } else {
            if (k == 0 || array1[i] != result[k - 1]) {
                result[k++] = array1[i];
            }
            i++;
            j++;
        }
    }

    return result;
}

    
    /**
     * Différence de deux tableaux (éléments de array1 qui ne sont pas dans array2)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments de array1 absents de array2
     */
    public int[] difference(int[] array1, int[] array2) {
       int countElement = 0;
       for(int i=0 ; i < array1.length ; i++){
            boolean exists = false;
            for(int j=0 ; j < array2.length ; j++){
                if(array1[i] == array2[j]){
                    exists = true;
                    break;
                }
        }
        if (!exists){
            countElement++;
        }
       }
        
       int[] result = new int[countElement];
       int index = 0;

       for(int i=0 ; i< array1.length; i++){
            boolean exists = false;
            for(int j=0 ; j < array2.length ; j++){
                if(array1[i] == array2[j]){
                    exists = true;
                    break;
                }
       }
       if(!exists){
        result[index] = array1[i];
        index++;
       }
    }
       return result; 

    }
    
    /**
     * Différence symétrique (éléments présents dans un seul des deux tableaux)
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans un seul tableau
     */
    public int[] symmetricDifference(int[] array1, int[] array2) {
        
        int[] union = union(array1, array2);
        int[] intersection = intersection(array1, array2);
        return difference(union, intersection);
    }
    
    /**
     * Vérifie si array1 est un sous-ensemble de array2
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return true si tous les éléments de array1 sont dans array2
     */
    public boolean isSubset(int[] array1, int[] array2) {
        int[] diff = difference(array1, array2);

        return diff.length == 0;
    }
    
    /**
     * Supprime les doublons d'un tableau
     * @param array le tableau
     * @return un tableau contenant uniquement les éléments uniques
     */
    public int[] removeDuplicates(int[] array) {
        
        Arrays.sort(array);
        int unique = 1;
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] != array[i -1]){
                unique++;
            }
        }
        
        int [] result = new int[unique];
        result[0] = array[0];
        int currentIndex = 1;
        for(int j=1 ; j < array.length; j++) {
            if(array[j] != array[j - 1]) {
                result[currentIndex++] = array[j];   
            }
        }
        return result;  
    }
    
    /**
     * Compte le nombre d'éléments uniques dans un tableau
     * @param array le tableau
     * @return le nombre d'éléments uniques
     */
    public int countUnique(int[] array) {
        if(array.length == 0) return 0;
        Arrays.sort(array);
        int count = 1;
        for(int i = 1; i < array.length ; i++ ){
            if(array[i] != array[i - 1]){
                count++;
            }
        }
        return count;
    }
}
