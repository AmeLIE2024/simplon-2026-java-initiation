package fr.simplon.exercises;

/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {
    
    /**
     * Inverse une chaîne de caractères
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {
        String reversed ="";
        
       for (int i = str.length()-1; i>=0;i--){
        reversed=reversed + str.charAt(i);
       }
       return reversed;
    }
    
    /**
     * Vérifie si une chaîne est un palindrome
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {
        for(int i = 0, j=str.length()-1; i < j; i++ , j--){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Compte le nombre de voyelles dans une chaîne
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {
        int vowels = 0;
        str = str.toLowerCase();
        for (int i= 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e'||c == 'i'||c == 'o'||c == 'u'){
                vowels++;
            }
        }
        return vowels;

    }
    
    /**
     * Compte le nombre de mots dans une chaîne
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {
        int words = str.split(" ").length;
        return words;

    }
    
    /**
     * Met la première lettre de chaque mot en majuscule
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public String capitalizeWords(String str) {
        String myChaine = "";
        String [] words = str.split(" ");
        for (String word : words){
            myChaine += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()+" ";
        }
       return myChaine.trim();


       

       
    }
    
}
