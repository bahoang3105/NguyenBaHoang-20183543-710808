package controller;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class HoangNB_ValidateAddressTest {

	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		", false",
		"Dai Co Viet @!, false",
		"So 1 Nguyen Van A, false",
		"So1NguyenVanA, true"
	})
	void test(String address, boolean expected) {
		// when
		boolean isValided = placeOrderController.validateAddress(address);
		
		// then
		assertEquals(expected, isValided);
	}

}
