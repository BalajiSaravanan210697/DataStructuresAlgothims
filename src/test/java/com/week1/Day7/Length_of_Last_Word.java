package com.week1.Day7;

import org.junit.Assert;
import org.junit.Test;

public class Length_of_Last_Word {
	
	/* 
	1.Understanding the problem to detailed level (clarity on input and output, constraints)
	Yes/No - Yes
	Input - String
	Output -  int
	
	2.Frame Test data (valid, invalid, complex and edge cases)
	
	Valid TestCase Data :  Input: s = "Hello World" Output: 5
	Invalid TestCase Data : Input s = ""  Output: Exception Message
	Edge TestCase Data : Input  s = " oneword " Output : 7
			
	3.Do you know the Solution?
	Yes/No  - Yes
	
	4.Do you have any alternate approaches? (Thing of alternate approaches)
	Yes/No - Yes
	
	5. Derive Pseudo code in paper (for the best chosen approach)
	 Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	trim the string using trim method  // s = "Hello World"   // " oneword "  --> "oneword"
	  using regex split method to split a string by space //  Hello   World//s+
	  store the splitted words to array // {"Hello","World"}  -- length - 2 length-1 
	     get the last word in the array // "World"
	     return the length of the word  // 5
	 
	6.Dry run the pseudo code with all test data from step #2
	Done/Not Done - Done
	
	7.Write the code on note pad
	Done/Not Done - Done
	
	8. Dry run the code with all test data from step #2
	Done/Not Done - Done
	
	9. Write code on IDE (remember to add comments and practice coding standards)
	Done/Not Done - Done
	
	10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	Done/Not Done - Done
	
	11. Check for any gaps of code optimization (if not optimized already in Step #9)
	Done/Not Done - Not Done need to work on optimal Solution
	*/
	@Test
	public void tc1() {
		Assert.assertEquals(5, lastWordLength("Hello World"));
	}
	
	@Test
	public void tc2() {
		Assert.assertEquals(4, lastWordLength( "   fly me   to   the moon  "));
	}
	@Test
	public void tc3() {
		Assert.assertEquals(7, lastWordLength( "oneword"));
	}
	
	@Test
	public void tc4() {
		Assert.assertEquals(0, lastWordLength(""));
	}
	
	
	public int lastWordLength(String s) {
		// "Hello World"
		if(s.length() <= 0) throw new RuntimeException("Not having atleast one character");
		String[] splitedarray = s.split("\\s+");// {"Hello","World"}
		return splitedarray[splitedarray.length - 1].length();// 5
	}

}
