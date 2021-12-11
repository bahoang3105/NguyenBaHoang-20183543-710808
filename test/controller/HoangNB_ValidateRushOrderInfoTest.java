package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author HoangNB - 20183543
 */
public class HoangNB_ValidateRushOrderInfoTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Hay giao hang vao thu 3,true",
            "@@@@Mi,false",
            "Co the giao hang moi luc,true",
            "- ngay thu 7,false"
    })
    void test(String info, boolean expected) {
        boolean isValid = placeRushOrderController.validateRushOrderInfo(info);
        Assertions.assertEquals(isValid, expected);
    }
}
