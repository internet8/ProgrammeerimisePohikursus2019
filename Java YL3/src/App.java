import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Exercise e = new Exercise ();
		String textString = e.readFile("artiklikogumik.txt");
		ArrayList<String> wordList = new ArrayList();
		wordList = e.stringToList(textString);
		wordList = e.wordsToLowercase (wordList);
		System.out.println(e.wordsInList(wordList, 100));
	}

}
