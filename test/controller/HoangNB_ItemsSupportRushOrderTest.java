package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author HoangNB - 20183543
 */
public class HoangNB_ItemsSupportRushOrderTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "59,false",
            "238,false",
            "132,true",
            "158,false"
    })
    void test(int mediaID, boolean expected) {
    	// when
        boolean isValid = placeRushOrderController.isItemsSupportRushOrder(mediaID);
        
        // then
        Assertions.assertEquals(isValid, expected);
    }
}
