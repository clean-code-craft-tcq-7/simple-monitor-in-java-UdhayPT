package vitals;

public class Batterymodel {
	
	private float temperatureLowerRange = 0.0f;
	private float temperatureUpperRange = 45.0f;
	private float socLowerRange = 20.0f;
	private float socUpperRange = 80.0f;
	private float chargeRateUpperRange = 0.8f;
	
	public float getTemperatureLowerRange() {
		return temperatureLowerRange;
	}
	public void setTemperatureLowerRange(float temperatureLowerRange) {
		this.temperatureLowerRange = temperatureLowerRange;
	}
	public float getTemperatureUpperRange() {
		return temperatureUpperRange;
	}
	public void setTemperatureUpperRange(float temperatureUpperRange) {
		this.temperatureUpperRange = temperatureUpperRange;
	}
	public float getSocLowerRange() {
		return socLowerRange;
	}
	public void setSocLowerRange(float socLowerRange) {
		this.socLowerRange = socLowerRange;
	}
	public float getSocUpperRange() {
		return socUpperRange;
	}
	public void setSocUpperRange(float socUpperRange) {
		this.socUpperRange = socUpperRange;
	}
	public float getChargeRateUpperRange() {
		return chargeRateUpperRange;
	}
	public void setChargeRateUpperRange(float chargeRateUpperRange) {
		this.chargeRateUpperRange = chargeRateUpperRange;
	}

}
