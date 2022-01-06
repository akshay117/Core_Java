package generateDocument;

import java.util.*;

class Solution2 {

  public boolean generateDocument(String characters, String document) {
		
		Set<Character> alreadyCounted = new HashSet<Character>();
 
		for(int idx=0;idx<document.length();idx++){
		char character = document.charAt(idx);
			if(alreadyCounted.contains(character)) {
				continue;
			}	
				
		int documentFrequency   =countCharFrequency(character,document);
		int charactersFrequency =	countCharFrequency(character,characters);
		if(documentFrequency>charactersFrequency){
			return false;
		}
			alreadyCounted.add(character);
	}
		return true;

}

public int countCharFrequency(char character,String target){
	int frequency = 0;
	for(int idx=0;idx<target.length();idx++){
		char charRec = target.charAt(idx);
		if (charRec==character ){
			frequency += 1;
		}
	}
	return  frequency;
}
	
}
