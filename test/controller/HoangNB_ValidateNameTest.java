package controller;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HoangNB_ValidateNameTest {

	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"HoangNB, true",
		"Nguyen Ba Hoang, false",
		"hoang@, false",
		"hoang1 , false",
		", false",
		"hoang01@, false"
		
	})
	void test(String name, boolean expected) {
		// when
		boolean isValided = placeOrderController.validateName(name);
		
		// then
		assertEquals(expected, isValided);
	}

}
