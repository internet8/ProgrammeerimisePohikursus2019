import java.util.ArrayList;
import java.util.Arrays;

public class Exercise {
	
	public String readFile (String filename) {
		return readFile(filename);
	}
	
	public ArrayList<String> stringToList (String str) {
		return (ArrayList<String>) Arrays.asList(str.split("\\s+|,\\s*|\\.\\s*"));
	}

}
