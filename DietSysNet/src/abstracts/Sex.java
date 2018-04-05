package abstracts;

public abstract class Sex {

	char character;

	public Sex(char character) {
		super();
		this.character = character;
	}

	char getText() {
		char temp = character;
		return temp;
	}
	
}
