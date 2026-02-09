package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 1
 */
class Exercise01VariableAssignmentTest {
    
    @Test
    void testAssignInteger() {
        Exercise01VariableAssignment exercise = new Exercise01VariableAssignment();
        assertEquals(42, exercise.assignInteger(), "La méthode doit retourner 42");
    }
    
    @Test
    void testAssignString() {
        Exercise01VariableAssignment exercise = new Exercise01VariableAssignment();
        String result = exercise.assignString();
        assertNotNull(result, "La méthode ne doit pas retourner null");
        assertFalse(result.isEmpty(), "La méthode doit retourner un prénom non vide");
    }
    
    @Test
    void testAssignBoolean() {
        Exercise01VariableAssignment exercise = new Exercise01VariableAssignment();
        assertTrue(exercise.assignBoolean(), "La méthode doit retourner true");
    }
}
