package vitals;

public class Batterywarnings {

	public static void printWarning(float temperature, float soc, float chargeRate) {
		Batterywarningmodel batterywarningmodel = new Batterywarningmodel();
		printTempWarning(temperature, batterywarningmodel);
    	printSOCWarning(soc, batterywarningmodel);
    	printChargeRateWarning(chargeRate, batterywarningmodel);
		
	}
	
	private static void printChargeRateWarning(float chargeRate, Batterywarningmodel batterywarningmodel) {
		if(chargeRate >= batterywarningmodel.getChargeRateUpperWarning()) {
			System.out.println("High Charge Rate Warning");
		}
		
	}

	private static void printSOCWarning(float soc, Batterywarningmodel batterywarningmodel) {
		if(soc >= batterywarningmodel.getSocUpperWarning()) {
			System.out.println("High SOC Warning");
		} else if (soc < batterywarningmodel.getSocLowerWarning()) {
			System.out.println("Low SOC Warning");
		}	
	}

	private static void printTempWarning(float temperature, Batterywarningmodel batterywarningmodel) {
		if(temperature >= batterywarningmodel.getTempUpperWarning()) {
			System.out.println("High Temperature Warning");
		} else if (temperature < batterywarningmodel.getTempLowerWarning()) {
			System.out.println("Low Temperature Warning");
		}	
	}

}
