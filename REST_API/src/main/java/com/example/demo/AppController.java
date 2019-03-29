package com.example.demo;

import java.util.ArrayList;

import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@GetMapping("/input")
    @ResponseBody
    public InputText getInput(@RequestParam(name="text", required=true) String text) throws JSONException {
    	
    	String[] words = text.split(" ");
    	ArrayList<Integer> detectedWords = new ArrayList<Integer>();
    	int upperCase = 0;
    	String result = "[";
    	Integer count;
    	
    	for (int i = 0; i < words.length; i++) {
			if (Character.isUpperCase(words[i].charAt(0))) {
				upperCase ++;
			}
			count = 0; 
				if (!detectedWords.contains(i)) {
				for (int j = 0; j < words.length; j++) {
					if (words[i].equals(words[j])) {
						count ++;
						detectedWords.add(j);
					}
				}
				result += "{" + "\'" + words[i] + "\'" + ":" + count.toString() + "}, ";
			}
		}
    	result = result.substring(0, result.length()-2) + "]";
    	
        return new InputText(result, words.length, upperCase);
    }

}