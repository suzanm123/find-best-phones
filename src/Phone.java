public class Phone {
	private final String model;
	private final double screenSize;
	private final int batteryCapacity;

	public Phone(String model, double screenSize, int batteryCapacity) {
		// TODO: ensure the screenSize and batteryCapacity are positive
		// by throwing an IllegalArgumentException otherwise
		this.model = model;
		this.screenSize = screenSize;
		this.batteryCapacity = batteryCapacity;
		
	}

	/*
	 * Gets the phone's model name.
	 */
	public String getModel() {
		return model;
	}

	/*
	 * Gets the phone's diagonal screen size (in inches).
	 */
	public double getScreenSize() {
		return screenSize;
	}

	/*
	 * Gets the phone's battery capacity (in mAh).
	 */
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	/*
	 * Determines whether this phone "dominates" another phone, meaning this phone
	 * is better in one criterion, and at least as good in the other criterion.
	 */
	public boolean dominates(Phone other) {
		// TODO: implement this method
		boolean itDominates;
		if (this.screenSize > other.screenSize && this.batteryCapacity >= other.batteryCapacity) {
			// you have to set a variable that is true if the condition is met
			itDominates = true;
		} else if(this.screenSize == other.screenSize && this.batteryCapacity > other.batteryCapacity) {
			itDominates = true;
		}
		else {
			itDominates = false;
		}
		return itDominates;
	}
}