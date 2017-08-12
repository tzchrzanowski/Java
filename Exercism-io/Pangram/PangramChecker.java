public class PangramChecker {
    public boolean isPangram(String str) {
       // throw new UnsupportedOperationException("Method has not been implemented yet.");
       /*
	   if(input == "") return false;
       return true;
	   */
	  String newStr = str.toLowerCase();
	  if(newStr.chars().filter(i -> i >= 'a' && i <= 'z').distinct().count() == 26) return true; return false;
	}
}
