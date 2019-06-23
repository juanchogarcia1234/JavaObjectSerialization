import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Inicio {
	
	public void write() {
		

		GameCharacter player1 = new GameCharacter();
		GameCharacter player2 = new GameCharacter();
		
		player1.power = 5;
		player1.type = "Elfo";
		
		player2.power = 10;
		player2.type = "Unicornio";
		
		try {
			FileOutputStream fos = new FileOutputStream("characters.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(player1);  //instance variables are saved + class info for the JVM
			oos.writeObject(player2);
			
			oos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		
	}
	
	public void read() {			
			
			try {
				FileInputStream fis = new FileInputStream("characters.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				

				
				GameCharacter jugatore1 = (GameCharacter) ois.readObject();
				GameCharacter jugatore2 = (GameCharacter) ois.readObject();

				
				System.out.print(jugatore1.power);
				
				ois.close();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inicio init = new Inicio();
		init.write();
		init.read();
	}

}
