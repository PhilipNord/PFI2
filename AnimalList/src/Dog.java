public class Dog extends Mammal {

	private boolean stupid;
	
	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName,  gestationTime);
		this.stupid = stupid;

	}
	
	public Dog(String friendlyName, String latinName, int gestationTime, boolean stupid) {
		super(latinName,  gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);

	}

	public String getInfo() {

		String dogInfo = "";

		if (stupid) {
			dogInfo += "A dog named " + getFriendlyName() + ", Latin Name: "
					+ getLatinName() + ", Gestation Time: " + getGestationTime()
					+ " month(s) and is stupid ";

		} else {
			dogInfo += "A dog named " + getFriendlyName() + ", Latin Name: "
					+ getLatinName() + ", Gestation Time: " + getGestationTime()
					+ " month(s) and is not stupid ";

		}

		return dogInfo;

	}

	public boolean isStupid() {

		return this.stupid;
	}

}
