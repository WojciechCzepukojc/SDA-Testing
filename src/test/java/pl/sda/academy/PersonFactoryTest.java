package pl.sda.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonFactoryTest {

    private static final String MALE_NAME = "Andrzej";
    private static final String FEMALE_NAME = "Anna";
    private static final String SURNAME = "Nowak";
    private static final String MALE_PREFIX = "Mr";
    private static final String FEMALE_PREFIX = "Ms";

    @Test
    void shouldCreateMalePerson() {
        // given
        PersonFactory personFactory = new PersonFactory();

        // when
        Person person = personFactory.createPerson(MALE_NAME, SURNAME);

        // then
        assertNotNull(person);
        assertAll(
                () -> assertEquals(MALE_PREFIX, person.getPrefix()),
                () -> assertEquals(MALE_NAME, person.getFirstName()),
                () -> assertEquals(SURNAME, person.getLastName())
        );
//        assertEquals(MALE_PREFIX, person.getPrefix());
//        assertEquals(MALE_NAME, person.getFirstName());
//        assertEquals(SURNAME, person.getLastName());
    }

    @Test
    void shouldCreateFemalePerson() {
        // given
        PersonFactory personFactory = new PersonFactory();

        // when
        Person person = personFactory.createPerson(FEMALE_NAME, SURNAME);

        // then
        assertNotNull(person);
        assertAll(
                () -> assertEquals(FEMALE_PREFIX, person.getPrefix()),
                () -> assertEquals(FEMALE_NAME, person.getFirstName()),
                () -> assertEquals(SURNAME, person.getLastName())
        );

//        assertEquals(FEMALE_PREFIX, person.getPrefix());
//        assertEquals(FEMALE_NAME, person.getFirstName());
//        assertEquals(SURNAME, person.getLastName());
    }
}




















