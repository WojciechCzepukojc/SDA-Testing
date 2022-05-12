package pl.sda.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameVeryfierTest {

    @Test
    void shouldValidateName(){

        //given

        String name = "Andrzej";
        NameVeryfier nameVeryfier = new NameVeryfier();



        //when

        boolean actualValidationResult = nameVeryfier.isnameValid(name);


        //then
        assertTrue(actualValidationResult);



    }




}