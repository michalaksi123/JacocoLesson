package pl.kurs;

public class Strings {

    // napisz metode, ktora zwraca odpowiedni napis w zaleznosci od tego ktory string jest wiekszy
    // 1 -> "First string is longer"
    // 2 -> "Second string is longer"
    // 3 -> "Strings are equal and longer than 5"
    // 4 -> "Strings are equal"

    public String compareStrings(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return "First string is longer";
        } else if (str2.length() > str1.length()) {
            return "Second string is longer";
        } else {
            if (str1.length() > 5) {
                return "Strings are equal and longer than 5";
            } else {
                return "Strings are equal";
            }
        }
    }

}