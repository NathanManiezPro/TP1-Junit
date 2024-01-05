package fr.nathan.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaireTest {

    private Salaire salaire;
    @BeforeEach
    public void setUp(){
        salaire = new Salaire(15);
    }
    @Test
    public void testPayerSansHeuresSup(){
        double result = salaire.payer(15);

        assertEquals(225, result);
    }

   @Test
    public void testPayerAvecHeuresSup(){
        double result = salaire.payer(152.67);

        assertEquals(2293.80 , result);

    }
    @Test
    public void testPayerHeuresClassiques(){
        double result =salaire.payer(151.67);

        assertEquals(2275.05, result);
        }
    }

