package vitals;

public class Batterychecker {
	
	float temperatureLowerRange = 0.0f;
	float temperatureUpperRange = 45.0f;
	float socLowerRange = 20.0f;
	float socUpperRange = 80.0f;
	float chargeRateUpperRange = 0.8f;
	
    public static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
    	
    	boolean tempFlag = isTempInRange(temperature);
    	boolean socFlag = isSOCinRange(soc);
    	boolean chargeRateFlag = isChargeRateInRange(chargeRate);
    	
        if(!tempFlag || !socFlag || !chargeRateFlag) {  	
        	printError(tempFlag);
            return false;
        }
        return true;
    }

	private static void printError(boolean tempFlag) {
		
		if (!tempFlag) {
			System.out.println("Temperature is out of range!");
		} else {
			System.out.println("State of Charge is out of range!");
		}
		
	}

	public static boolean isChargeRateInRange(float chargeRate) {
		Batterymodel batterymodel = new Batterymodel();
		if (chargeRate < batterymodel.getChargeRateUpperRange()) {
			return true;
		}
		System.out.println("Charge Rate is out of range!");
		return false;
	}

	public static boolean isSOCinRange(float soc) {
		Batterymodel batterymodel = new Batterymodel();
		return (batterymodel.getSocLowerRange() < soc && soc < batterymodel.getSocUpperRange());
	}

	public static boolean isTempInRange(float temperature) {
		Batterymodel batterymodel = new Batterymodel();
		return !(temperature < batterymodel.getTemperatureLowerRange() || temperature > batterymodel.getTemperatureUpperRange());
	}

}
