package demo;

import java.util.Set;

public class Developer {
    private String name;
    private int age;
    private Set<String> languagesKnown;

    public Developer(String name, int age, Set<String> languagesKnown) {
        this.name = name;
        this.age = age;
        this.languagesKnown = languagesKnown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getLanguagesKnown() {
        return languagesKnown;
    }

    public void setLanguagesKnown(Set<String> languagesKnown) {
        this.languagesKnown = languagesKnown;
    }
}
