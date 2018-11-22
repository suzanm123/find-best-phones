import java.util.*;
import java.io.*;

public class FindBestPhones {
	
	public static String PHONES_FILE = "phone-data.txt";

	public static void main(String[] args) throws IOException {
		// TODO: use the parseFile method to get the phone data from the file
		try {
		PhoneParser phoneData = new PhoneParser();
		
		PhoneList storedData = phoneData.parseFile(PHONES_FILE);
		// TODO: print the model names of all the best phones
		// !!!!!!!11!
		
		Collection<Phone> bestPhones = storedData.getBestPhones();
		for(Phone bestPhone : bestPhones) {
			System.out.println(bestPhone.getModel());
		}
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
		// TODO: handle I/O failures by printing an error message
	}
}
//illegal state ?