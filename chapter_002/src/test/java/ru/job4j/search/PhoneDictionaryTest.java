package ru.job4j.search;

import org.junit.Test;
import ru.job4j.search.Person;
import ru.job4j.search.PhoneDictionary;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Ivanov", "1234567", "Ivanovo")
        );
        ArrayList<Person> persons = phones.find("Ivan");
        assertThat(persons.get(0).getAddress(), is("Ivanovo"));
    }
}