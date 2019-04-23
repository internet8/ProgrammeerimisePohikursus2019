import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise implements Exercise3 {
	
	public String readFile (String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new FileReader(filename));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		while(in.hasNext()) {
		    sb.append(in.next());
		}
		in.close();
		return sb.toString();
	}
	
	public ArrayList<String> stringToList (String str) {
		return new ArrayList<String>(Arrays.asList(str.split("\\s+|,\\s*|\\.\\s*")));
	}

	public ArrayList<String> wordsToLowercase (ArrayList<String> listIn) {
		ArrayList<String> result = new ArrayList();
	    for (String word : listIn) {
	        word = word.toLowerCase();
	        result.add(word);
	    }
	    return result;
	}
	
	public int wordsInList (ArrayList<String> listIn, int letters) {
		int counter = 0;
		for (String word : listIn) {
			if (word.length() > letters) {
				counter++;
			}
	    }
	    return counter;
	}
}


