import java.io.Serializable;

public class GameCharacter implements Serializable{

	private int power;
	private String type;
	
	public void setPower(int pwr) {
		this.power = pwr;
	}
	
	public int getPower() {
		return power;
	}
	
	public void setType(String typ) {
		this.type = typ;
	}
	
	public String getType() {
		return type;
	}
	
	
	
}
