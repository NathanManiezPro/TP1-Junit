package fr.nathan.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class SalarieCdiTest {
    @InjectMocks
    private SalarieCdi salarieCdi;
    @Mock
    private Salaire salaireMock;

    @Mock
    private Identite identiteMock;

    @Test
    public void testDemenager(){
        Adresse nouvelleAdresseMock = mock(Adresse.class);
        salarieCdi.demenager(nouvelleAdresseMock);
        verify(
                identiteMock,
                times(1)).setAdresse(nouvelleAdresseMock);

    }
    @Test
    public void testAugmentation(){
        when(salaireMock.getTauxHoraire()).thenReturn(10.0);
        salarieCdi.augmenter(20);
        verify(
                salaireMock,
                times(1)
        ).setTauxHoraire(12);

    }

    @Test
    public void testTravailler(){
        salarieCdi.travailler();
        verify(
                salaireMock
        ).payer(151.67);
        }
    }
