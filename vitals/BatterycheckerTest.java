package vitals;

import org.junit.jupiter.api.Test;

class BatterycheckerTest {

	@Test
	void testBatteryIsOk() {
		assert(Batterychecker.batteryIsOk(25, 70, 0.7f) == true);
		assert(Batterychecker.batteryIsOk(43, 70, 0.7f) == true);
		assert(Batterychecker.batteryIsOk(2, 70, 0.7f) == true);
		assert(Batterychecker.batteryIsOk(25, 23, 0.7f) == true);
		assert(Batterychecker.batteryIsOk(25, 77, 0.7f) == true);
		assert(Batterychecker.batteryIsOk(25, 70, 0.77f) == true);
		assert(Batterychecker.batteryIsOk(25, 90, 0.7f) == false);
		assert(Batterychecker.batteryIsOk(25, 70, 0.9f) == false);
        assert(Batterychecker.batteryIsOk(50, 85, 0.0f) == false);
	}

	@Test
	void testIsChargeRateInRange() {
		assert(Batterychecker.isChargeRateInRange(0.7f) == true);
		assert(Batterychecker.isChargeRateInRange(0.9f) == false);
	}

	@Test
	void testIsSOCinRange() {
		assert(Batterychecker.isSOCinRange(10.7f) == false);
		assert(Batterychecker.isSOCinRange(20.9f) == true);
		assert(Batterychecker.isSOCinRange(70.7f) == true);
		assert(Batterychecker.isSOCinRange(80.9f) == false);
	}

	@Test
	void testIsTempInRange() {
		assert(Batterychecker.isTempInRange(-10.7f) == false);
		assert(Batterychecker.isTempInRange(0.9f) == true);
		assert(Batterychecker.isTempInRange(40.7f) == true);
		assert(Batterychecker.isTempInRange(50.9f) == false);
	}

}
