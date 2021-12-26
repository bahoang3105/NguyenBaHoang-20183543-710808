package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.implement.RushOrderValidator;

/**
 * @author HoangNB - 20183543
 */
public class HoangNB_ValidateReceiveTimeTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() {
    	placeRushOrderController = new PlaceRushOrderController(new RushOrderValidator());
    }

    @ParameterizedTest
    @CsvSource({
            "12-11-2021 01:00,true",
            "12/11/2021 01:00,false",
            "12/13/2021 01:00,false",
            "12-11/2021 01:00,false",
            "12-11-2021 30:00,false",
            "53-11-2021 01:00,false"
    })
    void test(String time, boolean expected) {
    	// when
        boolean isValid = placeRushOrderController.validateReceiveTime(time);
        
        // then
        Assertions.assertEquals(isValid, expected);
    }
}
