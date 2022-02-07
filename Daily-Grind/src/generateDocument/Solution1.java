package generateDocument;

import java.util.*;

class Solution1 {

  public boolean generateDocument(String characters, String document) {
  for(int idx=0;idx<document.length();idx++){
		char character = document.charAt(idx);
		int documentFrequency   =countCharFrequency(character,document);
		int charactersFrequency =	countCharFrequency(character,characters);
		if(documentFrequency>charactersFrequency){
			return false;
		}
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
