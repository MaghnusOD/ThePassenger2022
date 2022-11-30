package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThePassenger2022Test {

    ThePassenger2022 passanger;

    @BeforeEach
    void setUp() {
        passanger = new ThePassenger2022("Mr", "Joe", "1234abcd5678efgh", 1426475874l,35);
    }

    @Test
    void setUsr_title() {
        String title = "Mr";
        assertArrayEquals(title.toCharArray(), passanger.getUsr_title().toCharArray());
    }

    @Test
    void setUsr_name() {
        String name = "Joe";
        assertArrayEquals(name.toCharArray(), passanger.getUsr_name().toCharArray());
    }

    @Test
    void setUsr_id() {
        String id = "1234abcd5678efgh";
        assertArrayEquals(id.toCharArray(), passanger.getUsr_id().toCharArray());
    }

    @Test
    void setUsr_phone_num() {
        long phone = 1426475874l;
        assertEquals(phone, passanger.getUsr_phone_num());
    }

    @Test
    void setUsr_age() {
        int age = 35;
        assertEquals(age, passanger.getUsr_age());
    }

    @AfterEach
    void tearDown() {
    }
}