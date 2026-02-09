# simplon-2026-algo

Une collection d'exercices pour apprendre l'algorithmique en Java, étape par étape.

## 📚 Description

Ce projet contient une série d'exercices progressifs conçus pour apprendre les bases de l'algorithmique en Java. Chaque exercice introduit une nouvelle notion et s'appuie sur les concepts précédents.

## 🎯 Objectifs pédagogiques

Les exercices couvrent les notions suivantes, dans l'ordre de difficulté croissante:

1. **Exercise 01** - Assignation de variables (int, String, boolean)
2. **Exercise 02** - Opérations arithmétiques (+, -, *, /, %)
3. **Exercise 03** - Instructions conditionnelles (if/else)
4. **Exercise 04** - Boucles (for, while)
5. **Exercise 05** - Tableaux - Opérations de base
6. **Exercise 06** - Tableaux - Recherche du maximum et minimum
7. **Exercise 07** - Tableaux - Somme et moyenne
8. **Exercise 08** - Manipulation de chaînes de caractères
9. **Exercise 09** - Tableaux - Transformations (copie, filtrage, inversion)
10. **Exercise 10** - Opérations sur les ensembles (union, intersection, différence)
11. **Exercise 11** - Tableaux à deux dimensions (matrices)
12. **Exercise 12** - Comparaison et échange d'éléments (préparation au tri)
13. **Exercise 13** - Recherche dans un tableau (linéaire et binaire)
14. **Exercise 14** - Tri à bulles (Bubble Sort)
15. **Exercise 15** - Tri par sélection (Selection Sort)
16. **Exercise 16** - Tri par insertion (Insertion Sort)

## 🚀 Comment utiliser ce projet

### Prérequis

- Java 11 ou supérieur
- Git (pour cloner le projet)

### Installation

1. Clonez le dépôt:
```bash
git clone https://github.com/shiipou/simplon-2026-algo.git
cd simplon-2026-algo
```

2. Le projet utilise Gradle Wrapper, aucune installation supplémentaire n'est nécessaire.

### Workflow de travail

1. **Choisissez un exercice** - Commencez par `Exercise01VariableAssignment.java` dans `src/main/java/fr/simplon/exercises/`

2. **Lisez les commentaires** - Chaque méthode contient des commentaires `TODO` qui expliquent ce qu'il faut faire

3. **Implémentez votre solution** - Remplacez le code de retour par défaut par votre implémentation

4. **Testez votre code** - Exécutez les tests pour vérifier votre solution:
```bash
./gradlew test
```

5. **Testez un exercice spécifique**:
```bash
./gradlew test --tests Exercise01VariableAssignmentTest
./gradlew test --tests Exercise02ArithmeticOperationsTest
# etc.
```

6. **Passez à l'exercice suivant** - Une fois tous les tests d'un exercice réussis, passez au suivant

### Exemple d'output

Quand tous les tests passent:
```
BUILD SUCCESSFUL in 2s
4 actionable tasks: 2 executed, 2 up-to-date
```

Quand un test échoue:
```
Exercise01VariableAssignmentTest > testAssignInteger() FAILED
    org.junit.jupiter.api.AssertionFailedError at Exercise01VariableAssignmentTest.java:12
```

## 📖 Structure du projet

```
simplon-2026-algo/
├── src/
│   ├── main/java/fr/simplon/exercises/
│   │   ├── Exercise01VariableAssignment.java
│   │   ├── Exercise02ArithmeticOperations.java
│   │   ├── Exercise03ConditionalStatements.java
│   │   ├── Exercise04Loops.java
│   │   ├── Exercise05ArraysBasics.java
│   │   ├── Exercise06ArraysMaxMin.java
│   │   ├── Exercise07ArraysSumAverage.java
│   │   ├── Exercise08StringManipulation.java
│   │   ├── Exercise09ArrayTransformations.java
│   │   ├── Exercise10SetOperations.java
│   │   ├── Exercise11TwoDimensionalArrays.java
│   │   ├── Exercise12SwappingElements.java
│   │   ├── Exercise13SimpleSearch.java
│   │   ├── Exercise14BubbleSort.java
│   │   ├── Exercise15SelectionSort.java
│   │   └── Exercise16InsertionSort.java
│   └── test/java/fr/simplon/exercises/
│       └── [Tests correspondants]
├── build.gradle
└── README.md
```

## 💡 Conseils

- **Progressez pas à pas**: Ne sautez pas d'exercices, chaque notion s'appuie sur les précédentes
- **Lisez les messages d'erreur**: Ils vous donnent des indices sur ce qui ne fonctionne pas
- **N'hésitez pas à expérimenter**: Testez différentes approches
- **Commentez votre code**: Expliquez votre logique, cela vous aidera à mieux comprendre
- **Les tests ne révèlent pas les solutions**: Ils vérifient seulement que votre algorithme fonctionne correctement

## 🤝 Contribution

Ce projet est destiné à l'apprentissage. N'hésitez pas à proposer des améliorations via des Pull Requests!

## 📝 Licence

Ce projet est open source et disponible pour tous les apprenants.
