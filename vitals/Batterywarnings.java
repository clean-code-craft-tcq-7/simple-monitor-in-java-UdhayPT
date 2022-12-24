package vitals;

public class Batterywarnings {
	
	static Messagelogger messagelogger = new Messagelogger();

	public static void printWarning(float temperature, float soc, float chargeRate) {
		Batterywarningmodel batterywarningmodel = new Batterywarningmodel();
		printTempWarning(temperature, batterywarningmodel);
    	printSOCWarning(soc, batterywarningmodel);
    	printChargeRateWarning(chargeRate, batterywarningmodel);
		
	}
	
	private static void printChargeRateWarning(float chargeRate, Batterywarningmodel batterywarningmodel) {
		if(chargeRate >= batterywarningmodel.getChargeRateUpperWarning()) {
			System.out.println(messagelogger.print_language("high_charge_rate_warn"));
		}
		
	}

	private static void printSOCWarning(float soc, Batterywarningmodel batterywarningmodel) {
		if(soc >= batterywarningmodel.getSocUpperWarning()) {
			System.out.println(messagelogger.print_language("high_soc_warn"));
		} else if (soc < batterywarningmodel.getSocLowerWarning()) {
			System.out.println(messagelogger.print_language("low_soc_warn"));
		}	
	}

	private static void printTempWarning(float temperature, Batterywarningmodel batterywarningmodel) {
		if(temperature >= batterywarningmodel.getTempUpperWarning()) {
			System.out.println(messagelogger.print_language("high_temp_warn"));
		} else if (temperature < batterywarningmodel.getTempLowerWarning()) {
			System.out.println(messagelogger.print_language("low_temp_warn"));
		}	
	}

}
