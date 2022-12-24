package vitals;

public class Batterywarningmodel {
	
	Batterymodel batterymodel = new Batterymodel();
	
	float warningTolerance = 5.0f;
	float tempLowerWarning = batterymodel.getTemperatureLowerRange() + (batterymodel.getTemperatureUpperRange() * warningTolerance/100);
	float tempUpperWarning = batterymodel.getTemperatureUpperRange() - (batterymodel.getTemperatureUpperRange() * warningTolerance/100);
	float socLowerWarning = batterymodel.getSocLowerRange() + (batterymodel.getSocUpperRange() * warningTolerance/100);
	float socUpperWarning = batterymodel.getSocUpperRange() - (batterymodel.getSocUpperRange() * warningTolerance/100);
	float chargeRateUpperWarning = batterymodel.getChargeRateUpperRange() - (batterymodel.getChargeRateUpperRange() * warningTolerance/100);
	public float getTempLowerWarning() {
		return tempLowerWarning;
	}
	public void setTempLowerWarning(float tempLowerWarning) {
		this.tempLowerWarning = tempLowerWarning;
	}
	public float getTempUpperWarning() {
		return tempUpperWarning;
	}
	public void setTempUpperWarning(float tempUpperWarning) {
		this.tempUpperWarning = tempUpperWarning;
	}
	public float getSocLowerWarning() {
		return socLowerWarning;
	}
	public void setSocLowerWarning(float socLowerWarning) {
		this.socLowerWarning = socLowerWarning;
	}
	public float getSocUpperWarning() {
		return socUpperWarning;
	}
	public void setSocUpperWarning(float socUpperWarning) {
		this.socUpperWarning = socUpperWarning;
	}
	public float getChargeRateUpperWarning() {
		return chargeRateUpperWarning;
	}
	public void setChargeRateUpperWarning(float chargeRateUpperWarning) {
		this.chargeRateUpperWarning = chargeRateUpperWarning;
	}	

}
