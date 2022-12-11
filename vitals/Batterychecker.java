package vitals;

public class Batterychecker {
	
	float temperatureLowerRange = 0.0f;
	float temperatureUpperRange = 45.0f;
	float socLowerRange = 20.0f;
	float socUpperRange = 80.0f;
	float chargeRateUpperRange = 0.8f;
	
    public static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        if(!isTempInRange(temperature)) {
            System.out.println("Temperature is out of range!");
            return false;
        } else if(!isSOCinRange(soc)) {
            System.out.println("State of Charge is out of range!");
            return false;
        } else if(!isChargeRateInRange(chargeRate)) {
            System.out.println("Charge Rate is out of range!");
            return false;
        }
        return true;
    }

	public static boolean isChargeRateInRange(float chargeRate) {
		Batterymodel batterymodel = new Batterymodel();
		return chargeRate < batterymodel.getChargeRateUpperRange();
	}

	public static boolean isSOCinRange(float soc) {
		Batterymodel batterymodel = new Batterymodel();
		return !(soc < batterymodel.getSocLowerRange() || soc > batterymodel.getSocUpperRange());
	}

	public static boolean isTempInRange(float temperature) {
		Batterymodel batterymodel = new Batterymodel();
		return !(temperature < batterymodel.getTemperatureLowerRange() || temperature > batterymodel.getTemperatureUpperRange());
	}

}
