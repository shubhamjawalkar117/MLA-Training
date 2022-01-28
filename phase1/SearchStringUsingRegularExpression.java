package phase1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchStringUsingRegularExpression {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String stringToSearch = "Four score and seven years ago our fathers ...";

		    Pattern p = Pattern.compile("score");   // the pattern to search for
		    Matcher m = p.matcher(stringToSearch);
		    
		    // now try to find at least one match
		    if (m.find())
		      System.out.println("Found a match");
		    else
		      System.out.println("Did not find a match");

	}

}
