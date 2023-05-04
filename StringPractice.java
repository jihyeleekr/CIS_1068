public class StringPractice {
  /* returns true if c is a punctuation mark or false otherwise
   * 
   * Punctuation mark is defined as:
   * apostrophe '
   * comma ,
   * period .
   * semicolon ;
   * colon :
   * exclamation point !
   * question mark ? 
   * 
   * (You don't have to worry about any others)
   */
  public static boolean isPunct(char c) {
			
	  if (c == '\'' || c == ',' || c == '.' || c == ';' || c == ':' || c == '!' || c == '?') {
		  return true;
	  } else {
		  return false;
	  }
  }

  /*
   * returns the number of punctuation marks
   * found in s.
   *
   * call your isPunct( ) method. Do not compy and paste
   * the same logic into this function */
  public static int numPunct(String s) {
	  int num_punct = 0;
	  
	  for (int i = 0; i < s.length(); i++) {
		  char letter = s.charAt(i);
		  if (isPunct(letter) == true) {
			  num_punct += 1;
		  } 
	  }
    return num_punct;
  }
  
  /*
   * returns the number of punctuation marks
   * found in s starting at the given index.
   *
   * call your isPunct( ) method. Do not compy and paste
   * the same logic into this function */
  
  public static int numPunct(String s, int startIndex) {
	  int num_punct = 0;
	  if(s.length() > startIndex) {
	  	String word = s.substring(startIndex);
	  	for (int i = 0; i < word.length(); i++) {
	  		char letter = word.charAt(i);
	  		if (isPunct(letter) == true) {
	  			num_punct += 1;
	  		}
	  	}
	  	return num_punct;
	  }
	  return 0;
  }


  /*
   * returns the index of the first punctuation mark in s or
   * -1 if s contains no punctuation marks
   *
   * use your solution to indexOfFirstPunct(String s, int startPosition)
   * in this function. Do not repeat the same logic.
   * 
   * Notice that this method has the same name as the
   * previous one, but that it takes a different number of arguments. This is
   * perfectly legal in Java. It's called "method overloading"
   *
   */
  
  public static int indexOfFirstPunct(String s, int startPosition) {
	  int punct_index = -1;
	  String word = s.substring(startPosition);
	  for (int i = 0; i < s.length(); i++) {
		  char letter = s.charAt(i);
		  if (isPunct(letter) == true) {
			  punct_index = s.indexOf(letter);
			  return punct_index;
			  
		  }
	  }
	return punct_index;
  }
  
  public static int indexOfFirstPunct(String s) {
	  if (numPunct(s) > 0) {
		  return indexOfFirstPunct(s, 0);
		  
	  } 
	return -1;
	  
  }

  /*
   * returns the index of the last occurrence of a punctuation
   * mark in s or -1 if s contains no punctuation
   * 
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfLastPunct(String s) {
	  int punct_index = -1;
	  for (int i = 0; i <s.length();i++) {
		  char c = s.charAt(i);
		  if (isPunct(c)) {
			 punct_index = s.indexOf(c);
		  }
	  }
	  
    return punct_index;
  }

  /*
   * returns a new String which is the same as s but with
   * each instance of oldChar replaced with newChar
   */
  public static String substitute(String s, char oldChar, char newChar) {
	  
	  String new_str = s.replace(oldChar, newChar);
      
    return new_str;
  }

  /*
   * returns a new String which is the same as s, but
   * with each instance of a punctuation mark replaced
   * with a single space character
   *
   * Use at least one of your other functions in your
   * solution to this.
   *
   */
  public static String substitutePunct(String s) {
	  String newstr ="";
	  if (numPunct(s) > 0) {
		  for (int i = 0; i < s.length(); i++) {
			  char letter = s.charAt(i);
			  if (isPunct(letter)) {		  
				  newstr = newstr + " ";
			  } else {
				  newstr = newstr + letter;
			  }
		  }
	  }else {
		  newstr = s;
	  }
	  return newstr;
  }
  
  /*
   * returns a new String which is the same as s,
   * but with all of the punctuation
   * marks removed.
   *
   * Use at least one of your other functions
   * in your solution to this one.
   * 
   */
  public static String withoutPunct(String s) {
	  String newstr ="";
	  for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (isPunct(c)) {
			  newstr = newstr + "" ;
		  } else {
			  newstr = newstr + c;
		  }
	  }
	  return newstr;
  }

  /* returns true if c is found in s or false otherwise */
  public static boolean foundIn(String s, char c) {
	  for (int i =0; i < s.length();i++) {
		  char letter = s.charAt(i);
		  if (letter == c) {
			  return true;
		  }
	  }
    return false;
  }

  /*
   * returns the number of times that a punctuation mark
   * immediately follows a character that's not a
   * punctuation mark
   */
  public static int numPunctAfterNonPunct(String s) {
	  int numPunctAfterNonPunct = 0;
	  for (int i = 0; i < s.length()-1;i++){
		  char letter = s.charAt(i);
		  char nextLetter = s.charAt(i+1);
		  if (isPunct(letter) != isPunct(nextLetter)) {
			  numPunctAfterNonPunct += 1;
		  }
	  }
    return numPunctAfterNonPunct;
  }
  
  /*
   * Returns true of s is comprised of only punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean onlyPunct(String s) {
	  if (numPunct(s) == s.length()) {
		  return true;
	  }
    return false;
  }

  /*
   * Returns true of s contains no punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean noPunct(String s) {
	  if (numPunct(s) == 0) {
		  return true;
	  }
    return false;
  }

  /*
   * returns true if s has two punctuation marks
   * right next to each other or false otherwise
   *
   * use at least one of your other methods
   * in your solution to this method
   */
  public static boolean consecutivePuncts(String s) {
	  
	  boolean punctNextPunct = false;
	  for (int i = 0; i < s.length()-1;i++){
		  char letter = s.charAt(i);
		  char nextLetter = s.charAt(i+1);
		  if (isPunct(letter) && isPunct(nextLetter)) {
			  return punctNextPunct = true;
		  } 
	  }
    return punctNextPunct;
    
  }
}
