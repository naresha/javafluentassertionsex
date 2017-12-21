package demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SimpleListTest {

    @Test
    public void shouldNotBeNullShouldNotBeEmpty() {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Mango");

    }

    @Test
    public void shouldContainAppleAndOrange() {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Mango");
    }

    @Test
    public void shouldContainOnlyCoffeeAndTea() {
        List<String> drinks = Arrays.asList("Tea", "Coffee");

    }

    @Test
    public void foodShouldStartWithSoup() {
        List<String> food = Arrays.asList("Soup", "Salad", "Biriyani", "Ice Cream");

    }

    @Test
    public void namesShouldBeSortedByNumberOfCharacters() {
        List<String> friends = Arrays.asList("Ram", "Raghu", "Nirmala", "Ramanujan");

    }
}
