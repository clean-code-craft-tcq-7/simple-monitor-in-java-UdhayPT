package vitals;

public class Batterychecker {
	
	static Messagelogger messagelogger = new Messagelogger();
	
    public static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
    	
    	boolean tempFlag = isTempInRange(temperature);
    	boolean socFlag = isSOCinRange(soc);
    	boolean chargeRateFlag = isChargeRateInRange(chargeRate);
    	
        if(!isParamsInRange(tempFlag, socFlag, chargeRateFlag)) {  	
        	printError(tempFlag);
            return false;
        }
        Batterywarnings.printWarning(temperature, soc, chargeRate);
        return true;
    }

	private static boolean isParamsInRange(boolean tempFlag, boolean socFlag, boolean chargeRateFlag) {
		return tempFlag && socFlag && chargeRateFlag;
	}

	private static void printError(boolean tempFlag) {
		
		if (!tempFlag) {
			System.out.println(messagelogger.print_language("temp_out_of_range"));
		} else {
			System.out.println(messagelogger.print_language("soc_out_of_range"));
		}
		
	}

	public static boolean isChargeRateInRange(float chargeRate) {
		Batterymodel batterymodel = new Batterymodel();
		if (chargeRate < batterymodel.getChargeRateUpperRange()) {
			return true;
		}
		System.out.println(messagelogger.print_language("cr_out_of_range"));
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
