import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneParser {
	/*
	 * Parses a phone data string, in the following format:
	 * 
	 * model screenSize batteryCapacity
	 * 
	 * The model name is encoded with underscores instead of spaces.
	 */
	public static Phone parse(String data) {
	// TODO: parse the phone data string, and return a Phone object.
		String[] parts = data.split(" ");
		String model = parts[0];
		
		
		double screenSize = Double.parseDouble(parts[1]);
		
		int batteryCapacity = Integer.parseInt(parts[2]);
		
		
		return new Phone(model, screenSize, batteryCapacity);
		
	}
	/*
	* Returns a PhoneList by parsing a text file containing the phone data.
	*/
	public static PhoneList parseFile(String filename) throws IOException {
		// TODO: create a PhoneList
		PhoneList phoneList = new PhoneList();
		// TODO: create a BufferedReader to read from the file
		try {
			BufferedReader file = new BufferedReader(new FileReader(filename));
			// TODO: for each line, parse it as a Phone and add it to the list
			while (true) {
				String eachLine = file.readLine();
				if (eachLine == null) {
					// reached end of file
					file.close();
					break;
				}
				phoneList.addPhone(parse(eachLine));
				
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File not found: " + filename);
		} catch (IOException ex) {
			System.out.println("Error while reading the file:");
			// tells us the actual error of IOException?
			System.out.println(ex.getMessage());
		}
	
		return phoneList;
	}
}

