package fr.simplon.exercises;

/**
 * Exercice 4: Boucles
 * 
 * Objectif: Apprendre à utiliser les boucles for et while
 */
public class Exercise04Loops {
    
    /**
     * Calcule la somme des nombres de 1 à n
     * @param n le nombre maximum
     * @return la somme de 1 + 2 + ... + n
     */
    public int sumUpToN(int n) {
      int sum = 0;
      for (int i=1; i<=n; i++) {
        sum += i;
      }
      return sum;
    }
    
    /**
     * Inverse un nombre (ex: 123 -> 321)
     * @param number le nombre à inverser
     * @return le nombre inversé
     */
    public int reverseNumber(int number) {
        int reversed = 0;
        while (number !=0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number/=10;
        }
        return reversed;
    }
    
    /**
     * Calcule la factorielle d'un nombre (n!)
     * @param n le nombre
     * @return n! (n factorielle)
     */
    public int factorial(int n) {
        int fact = 1;
        for(int i=2; i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    
    /**
     * Compte le nombre de chiffres dans un nombre
     * @param number le nombre
     * @return le nombre de chiffres
     */
    public int countDigits(int number) {
        int count =0;
        if(number == 0) return 1;
        
        while (number != 0){
            number = number / 10;
            ++count;
        }
        return count;

    }
    
    /**
     * Vérifie si un nombre est premier
     * @param number le nombre à vérifier
     * @return true si le nombre est premier, false sinon
     */
    public boolean isPrime(int number) {

        if (number <= 1) return false;

        for (int i = 2; i < number; i++){
            if (number % i == 0) return false; 
        } return true;
    }
}
