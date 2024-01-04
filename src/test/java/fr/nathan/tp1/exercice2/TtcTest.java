package fr.nathan.tp1.exercice2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TtcTest {

    private Ttc ttc;
    public final double TVA = 1.20;

    @BeforeEach
    public void setUp() {
        ttc = new Ttc();
    }

    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {15, 5, 38, 18})
    @DisplayName("Test de l'ajout de la TVA")
    public void testAjoutTVA(int prixHt) {


        double result = ttc.HtToTtc(prixHt);

        double expected = prixHt * TVA;

    }

    @DisplayName("Test du prix HT inferieur a 0 ")
    @ParameterizedTest(name = "Test {index} : {0}")
    @ValueSource(ints = {-25, -15})
    public void testHtInfA0(int prixHt) {
        // Act

        // Assert
        assertThrows(IllegalArgumentException.class, () -> ttc.HtToTtc(prixHt));
    }


}