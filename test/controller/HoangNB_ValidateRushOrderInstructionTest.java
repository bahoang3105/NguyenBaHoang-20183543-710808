package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.implement.RushOrderValidator;

/**
 * @author HoangNB - 20183543
 */
public class HoangNB_ValidateRushOrderInstructionTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() {
    	placeRushOrderController = new PlaceRushOrderController(new RushOrderValidator());
    }

    @ParameterizedTest
    @CsvSource({
            "Dung giao hang vao thu 3 nhe,true",
            "@@123123,false",
            "Tim nha so 3 mau do nhe,true",
            "@123@,false"
    })
    void test(String instruction, boolean expected) {
        boolean isValid = placeRushOrderController.validateRushOrderInstruction(instruction);
        Assertions.assertEquals(isValid, expected);
    }
}
