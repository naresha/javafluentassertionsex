package demo;

import org.junit.Test;

public class StringTest {
    @Test
    public void equals() {
        final String expected = "Hello";
        final String message = "Hello";
        // TODO: Assert
    }

    @Test
    public void equalsIgnoreCase() {
        final String expected = "Hello";
        final String actual = "hello";
    }

    @Test
    public void equalsIgnoringSpace() {
        final String expected = "Hello World!";
        final String actual = " Hello World! ";
    }

    @Test
    public void nameNotNullAndNotEmpty() {
        final String name = "Mark";
        // TODO: name should not be null and should not be empty
    }

    @Test
    public void containsWord() {
        final String sentence = "I like Java programming";
        // TODO: sentence should contain the word 'Java'
    }

    @Test
    public void containsAllAlphabets() {
        final String sentence = "the quick brown fox jumps over a lazy dog";
        //TODO: The sentence should contain all the alphabets
    }

    @Test
    public void phoneNumberShouldContainOnlyDigits() {
        final String phoneNumber = "1234512345";

    }

    @Test
    public void fileNamesShouldEndWithExtensionJava() {
        final String fileName = "Person.java";
    }

    @Test
    public void sentenceShouldContainMoreThanOneWord() {
        final String sentence = "Hello World";

    }

    @Test
    public void shouldMatchIgnoringMultipleSpaces() {
        final String sentence = "Java is an object oriented and   functional   programming   language";
        final String expected = "Java is an object oriented and functional programming language";
    }
}
