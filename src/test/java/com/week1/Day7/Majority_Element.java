package com.week1.Day7;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;

public class Majority_Element {
	
	/* 
	1.Understanding the problem to detailed level (clarity on input and output, constraints)
	Yes/No - Yes
	Input - int[] 
	Output - int
	
	2.Frame Test data (valid, invalid, complex and edge cases)
	
	Valid TestCase Data : Input: nums = [3,2,3] Output: 3
	Invalid TestCase Data : Input nums = [2,1,3] Output : Exception
	Edge TestCase Data : Input nums = [4]  Output : 4
			
	3.Do you know the Solution?
	Yes/No  - Yes
	
	4.Do you have any alternate approaches? (Thing of alternate approaches)
	Yes/No - No as of now
	
	5. Derive Pseudo code in paper (for the best chosen approach)
	 Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
	
	 Initialize map to store the values  // [3,2,3]
	  for each loop to iterate array //  
	    add elements to map // 3=2,2=1 
	  for loop to iterate the elements using entry set //3=2
	    if the value of key is greater than or equal to n/2 // 3=2>= 3/2 -- 1.5 --> 2
	      return the key //3
	  return runtime Exception //    
	 
	6.Dry run the pseudo code with all test data from step #2
	Done/Not Done - Done
	
	7.Write the code on note pad
	Done/Not Done - Done
	
	8. Dry run the code with all test data from step #2
	Done/Not Done - Done
	
	9. Write code on IDE (remember to add comments and practice coding standards)
	Done/Not Done - 
	
	10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
	Done/Not Done - 
	
	11. Check for any gaps of code optimization (if not optimized already in Step #9)
	Done/Not Done - 
	*/
    @Test
	public void tc1() {
		Assert.assertEquals(3, majorityElement(new int[] {3,2,3}));
	}
    @Test
	public void tc2() {
		Assert.assertEquals(2, majorityElement(new int[] {2,2,1,1,1,2,2}));
	}
	
	public int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int each_num : nums) {
			map.put(each_num, map.getOrDefault(each_num, 0) + 1);
		}
		for (Entry<Integer, Integer> each_numfrommap : map.entrySet()) {
			if (each_numfrommap.getValue() > nums.length / 2)
				return each_numfrommap.getKey();
		}
		return 0;
	}
}
