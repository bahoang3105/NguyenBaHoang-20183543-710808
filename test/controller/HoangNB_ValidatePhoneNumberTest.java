package controller;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class HoangNB_ValidatePhoneNumberTest {
	
	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"0123456789, true",
		"016265, false",
		"abc1231, false",
		"1234567995, false"
	})
	void test(String phone, boolean expected) {
		// when
		boolean isValided = placeOrderController.validatePhoneNumber(phone);
		
		// then
		assertEquals(expected, isValided);
	}

}
