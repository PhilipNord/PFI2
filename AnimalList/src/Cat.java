public class Cat extends Mammal {

	private int numberOfLifes;

	public Cat(String latinName, int gestationTime,
			int numberOfLifes) {
		super(latinName, gestationTime);
		this.numberOfLifes = numberOfLifes;
	}

	public String getInfo() {

		String catInfo = "A cat named " + getFriendlyName() + ", Latin name: "
				+ getLatinName() + ", Gestation time " + getGestationTime()
				+ " Month(s) and has " + getNumberOfLifes() + " lives";

		return catInfo;
	}

	public int getNumberOfLifes() {

		return this.numberOfLifes;
	}

	public void setNumberofLifes(int numberOfLifes) {

		this.numberOfLifes = numberOfLifes;

	}

}
