package pl.kurs;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {

    private Strings strings = new Strings();

    @Test
    public void shouldReturnFirstStringIsLonger(){
        assertEquals("First string is longer", strings.compareStrings("abc", "ab"));
    }

    @Test
    public void shouldReturnSecondStringIsLonger() {
        assertEquals("Second string is longer",strings.compareStrings("ab","abcd"));
    }

    @Test
    public void shouldReturnThatStringsAreEqualAndLongerThan5() {
        assertEquals("Strings are equal and longer than 5",strings.compareStrings("abcdef","abcdef"));
    }

    @Test
    public void shouldReturnThatStringsAreEqual() {
        assertEquals("Strings are equal",strings.compareStrings("abc","abc"));
    }

    // dodajcie wiecej metod do poprzedniego zadania i testy wyjtkow z uzyciem assertJ

}