package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author HoangNB - 20183543
 */
public class HoangNB_LocationSupportRushOrderTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Ha Noi,true",
            "Da Nang,false",
            "Cao Bang,false",
            "Lang Son,false"
    })
    void test(String province, boolean expected) {
    	// when
        boolean isValid = placeRushOrderController.isLocationSupportRushOrder(province);
        
        // then
        Assertions.assertEquals(isValid, expected);
    }
}
