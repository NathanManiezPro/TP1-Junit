package fr.nathan.tp1.exercice4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DoublonTest {
    private Doublon doublon;

    @BeforeEach
    public void setUp(){
        doublon = new Doublon();
    }
   @ParameterizedTest(name = "Test {index} : {0}")
   @MethodSource({"testDoublon"})
   @DisplayName("Test pour vérifier le doublon")
    public void testVerifierSiDoublons(int[] liste, boolean bool){

        boolean result = doublon.verifierSiDoublons(liste);

        assertEquals(bool, result);

    }
private static Stream<Arguments> testDoublon() {
    return Stream.of(
            Arguments.of((Object) new int[]{21, 2, 10, 10}, true),
            Arguments.of((Object) new int[]{-2, 3, 4, 45}, false)

    );
}

}