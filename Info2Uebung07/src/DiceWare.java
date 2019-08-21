import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map;
public class DiceWare {
	private List<String> lines = new ArrayList<>();

	private Map<String, String> map ;

	public DiceWare() throws FileNotFoundException {
		String fileName = "/users/mcflu/IdeaProjects/Info2Uebung07/src/diceware_german.txt";
		FileInputStream fis = new FileInputStream(fileName);
		Scanner scanner = new Scanner(fis);
		while (scanner.hasNextLine()) {
			lines.add(scanner.nextLine());
		}
		// =================================
		// putting the lines into a map
		// this could also be done in the method generatePassword
		// but doing it here is more efficient
		map = new HashMap<>();
		for (String line : lines) {
			String[] words = line.split(" "); //CHEAT SHEET
			map.put(words[0], words[1]);
		}
	}

	//Step 2: find your 5 digit number
	public String generateRandomNumber() {
	/*Random rn = new Random(); //CHEAT SHEET
	int range = maximum - minimum + 1;
	int randomNum =  rn.nextInt(range) + minimum;*/
		Random rn = new Random(); //dice Number
		int range = 6 - 1 + 1;
		String myNumber = "";

		for (int i = 0; i < 5; i++) {
			myNumber = myNumber + (rn.nextInt(range) + 1); //wir addieren an einen leeren String eine Zahl
		}
		return myNumber;
	}

	public String generatePassword() {
		// your code goes here
		String myPassword = "";
		for (int i = 0; i < 6; i++ ){ //we need 6 random words from the list
			//Step 2: find your 5 digit number
			//do that 6 times
			String numberAfter5Throws = generateRandomNumber(); //wir rufen 6 Mal die Methode auf
			//Step 3: find the Word belonging to your number
			//do that 6 times
			myPassword = myPassword + map.get(numberAfter5Throws) + " "; //immer plus Leerzeichen
		}
		return myPassword;
	}

	public static void main(String[] args) throws FileNotFoundException {
		DiceWare diceWare = new DiceWare();
		//System.out.println("Anzahl Zeilen: " + diceWare.lines.size());
		System.out.println("Mein Passwort:" + diceWare.generatePassword());
		System.out.println("Hallo"+12334); //String Concatenation CHEAT SHEET !!
	}
}