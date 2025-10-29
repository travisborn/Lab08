package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDelete() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        assertTrue(list.hasCity(edmonton));

        list.delete(edmonton);

        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertEquals(2, list.countCities());
    }
}
