public class Snake extends Animal {
	private boolean poisonous;

	public Snake(String latinName, boolean poisonous) {
		super(latinName);
		this.poisonous = poisonous;

	}

	public String getInfo() {
		String snakeInfo = "";

		if (poisonous) {
			snakeInfo = "A Snake is named " + getFriendlyName()
					+ " Latin Name: " + getLatinName() + " and is poisonous ";
		}else{
			snakeInfo = "A Snake is named " + getFriendlyName()
					+ " Latin Name: " + getLatinName() + " and is not poisonous ";
			
		}
		return snakeInfo;
	}

	public boolean isPoisonous() {

		return this.poisonous;
	}

}
