package fr.nathan.tp1.exercice3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    private Palindrome palindrome;

    @BeforeEach
    public void setUp(){
        palindrome = new Palindrome();
    }
    @ParameterizedTest(name = "Test {index} : {0}")
    @CsvSource({
            "151,true",
            "152,false"
    })
    @DisplayName("Test pour renverser le nombre")
    public void testEstUnPalindrome(long nombre, boolean estUnPalindrome ){

        boolean result = palindrome.estUnPalindrome(nombre);
         assertEquals(estUnPalindrome, result);




    }



    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {9, 5, 7, 3})
    @DisplayName("Test de la vérification du nombre")
    public void testVerifNombre(long nombre) {
        assertThrows(IllegalArgumentException.class, () -> palindrome.estUnPalindrome(nombre));

    }
}