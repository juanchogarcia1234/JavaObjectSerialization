import java.io.Serializable;

public class GameCharacter implements Serializable{

	private int power;
	private String type;
	
	public int setPower(int pwr) {
		this.power = pwr;
		return power;
	}
	
	public int getPower() {
		return power;
	}
	
	public String setType(String typ) {
		this.type = typ;
		return type;
	}
	
	public String getType() {
		return type;
	}
	
	
	
}
