package pl.kurs;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {

    private Strings strings = new Strings();

    @Test
    public void shouldReturnFirstStringIsLonger(){
        assertEquals("First string is longer", strings.compareStrings("abc", "ab"));
    }

    // dopiszcie testy do pozostalych opcji

    // dodajcie wiecej metod do poprzedniego zadania i testy wyjtkow z uzyciem assertJ

}