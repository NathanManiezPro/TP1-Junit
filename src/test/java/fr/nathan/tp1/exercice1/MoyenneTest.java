package fr.nathan.tp1.exercice1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MoyenneTest {
    private Moyenne moyenne;

    @BeforeEach
    public void setUp() {
        moyenne = new Moyenne();
    }


    @DisplayName("Test des Moyenne")
    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource({"argumentsMoyenne"})
    public void testCalculerMoyenne(int[] listenotes, float resultatAttendu) {
        // Act
        float result = moyenne.moyenne(listenotes);
    }

    private static Stream<Arguments> argumentsMoyenne() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 2, 3}, 2),
                Arguments.of((Object) new int[]{2, 3, 4}, 3)

        );
    }
    @DisplayName("Test des nombres supérieur a 20 ")
    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource({"argumentsTestnbsupA20"})
    public void testNbSupA20(int[] listenotes) {
        // Act

        // Assert
        assertThrows(IllegalArgumentException.class, () -> moyenne.moyenne(listenotes));
    }
    private static Stream<Arguments> argumentsTestnbsupA20() {
        return Stream.of(
                Arguments.of((Object) new int[]{21, 2, 10}, 11),
                Arguments.of((Object) new int[]{-2, 3, 4}, 3)

        );
    }
    @DisplayName("Test du nb de notes supérieur a 3")
    @ParameterizedTest(name = "Test {index} : {0}")
    @MethodSource({"argumentsTestNbNotesSup3"})
    public void testNbNotesIncorrect(int[] listenotes){
        assertThrows(IllegalArgumentException.class, () -> moyenne.moyenne(listenotes));

    }

    private static Stream<Arguments> argumentsTestNbNotesSup3() {
        return Stream.of(
                Arguments.of((Object) new int[]{20, 2, 10, 20}, 11),
                Arguments.of((Object) new int[]{3, 4}, 3)
        );

}





}
