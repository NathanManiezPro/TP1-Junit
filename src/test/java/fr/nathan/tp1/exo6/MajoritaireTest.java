package fr.nathan.tp1.exo6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MajoritaireTest {
    private Majoritaire majoritaire;

    @BeforeEach
    public void setUp(){
        majoritaire = new Majoritaire();
    }


    @ParameterizedTest
    @MethodSource("elemMajo")
    public void testTrouverElementMajo(int[] nombres){
        int resultat = majoritaire.hashMap(nombres);
        assertEquals(1, resultat);
    }

    public static Stream<Arguments> elemMajo() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 1, 1, 3}),
                Arguments.of((Object) new int[]{1,1,1,3,6,7,1,1,5})

        );
    }
    @ParameterizedTest
    @MethodSource("elemPasMajo")
    public void testElementPasMajo(int[] nombres){
        int resultat = majoritaire.hashMap(nombres);
        assertEquals(0, resultat);
    }
    public static Stream<Arguments> elemPasMajo() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 1, 2, 3}),
                Arguments.of((Object) new int[]{2,3,4,5})

        );
    }
}