package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void testHasCity() {
        list = MockCityList(); // Initialize your list using the existing mock method
        list.addCity(new City("Estevan", "SK"));
        assertTrue(list.hasCity("Estevan"), "List should have city Estevan");
        assertFalse(list.hasCity("Regina"), "List should not have city Regina");
    }
    @Test
    public void testDeleteCity() {
        list = MockCityList(); // Reuse the mock list
        list.addCity(new City("Estevan", "SK"));
        assertTrue(list.hasCity("Estevan"), "Before deletion, list should have city Estevan");
        list.deleteCity("Estevan");
        assertFalse(list.hasCity("Estevan"), "After deletion, list should not have city Estevan");
    }






}
