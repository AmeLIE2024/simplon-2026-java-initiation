package fr.simplon.exercises;

import java.util.Arrays;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux existants
 */
public class Exercise09ArrayTransformations {
    
    /**
     * Double tous les éléments d'un tableau
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {
        int [] element = new int [array.length];
        for(int i =0; i < array.length ; i++){
           element[i] = array[i]*2;
        }  
        return element;
    }
    
    /**
     * Filtre les nombres pairs d'un tableau
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {
        int newLength = 0;
        for (int i : array){
            if(i % 2 == 0){
                newLength++;
            }
        }
        int [] resultEven = new int [newLength];
        int index = 0;

        for(int i : array){
            if(i % 2 == 0 ){
                resultEven[index++] = i; 
            }
        }
       
        return resultEven;

    }
    
    /**
     * Copie un tableau dans l'ordre inverse
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {
        int[] reversedTab = new int[array.length];
        for(int i = 0; i < array.length ; i++){
            reversedTab[i] = array[array.length -1 -i];
        }
        return reversedTab;
    }
    
    /**
     * Concatène deux tableaux
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
        int lengthNewTab = array1.length + array2.length;
        int [] response = new int[lengthNewTab];
        int position = 0;
        for(int i : array1){
            response[position] = i;
            position++;
        }
        for(int i : array2){
            response[position] = i;
            position++;
        }
        return response;
    }
    
    /**
     * Extrait une sous-partie d'un tableau
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
              
        int response [] = new int[end-start];
        for(int i= start; i < end ; i++){
            response [i - start] = array[i];
        }
        return response;
    }
}
