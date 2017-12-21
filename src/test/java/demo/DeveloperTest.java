package demo;

import org.junit.Test;

import java.util.HashSet;

public class DeveloperTest {

    @Test
    public void developerPropertiesShouldBeCorrect() {
        Developer mark = new Developer("Mark1", 36, new HashSet<>());

    }

}
