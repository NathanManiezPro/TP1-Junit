package fr.nathan.tp1.exo5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToNumberTest {
    private RomanToNumber romanToNumber;

    @BeforeEach
    public void setUp(){
        romanToNumber = new RomanToNumber();
    }
    @ParameterizedTest(name = "Test {index} : {0}")
    @CsvSource({
            "DCLII, 652",
            "DXX,520"
    })
    @DisplayName("Test pour vérifier la conversion")
    public void testConvertirNombreRomainEnNombreArabe(String nombreRomain, int nombre){

        int result = romanToNumber.convertirNombreRomainEnNombreArabe(nombreRomain);
        assertEquals(nombre, result);




    }
}