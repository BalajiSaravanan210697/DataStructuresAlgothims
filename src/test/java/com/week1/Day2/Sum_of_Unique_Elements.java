package com.week1.Day2;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Test;


public class Sum_of_Unique_Elements {
/* 
1.Understanding the problem to detailed level (clarity on input and output, constraints)
Yes/No - Yes
Input -  int[]
Output - int

2.Frame Test data (valid, invalid, complex and edge cases)

Valid TestCase Data : nums = {1,2,2,3,3,4}  output = 5
Invalid TestCase Data : nums = {}  output = exceptions
Edge TestCase Data : nums = {1,1} output = 0 
		
3.Do you know the Solution?
Yes/No  - Yes

4.Do you have any alternate approaches? (Thing of alternate approaches)
Yes/No  - No

5. Derive Pseudo code in paper (for the best chosen approach)
     Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!

 * Initialize the Hash map to with Integer,Integer data type and sum to zero  set = {}   sum = 0  nums = {1,2,2,3,3,4}
 * if the length of array is zero than throws exception
 *  for each loop to iterate the array nums  1,2,2,3,3
 *   add into Hash Map {1-1,2-2,3-2,4-1}
 *  for each to iterate the Hash Map values using entry set 1-1,2-2,3-2,4-1 
 *    if the value is one the add the values  sum = 1+4
 *   return sum 5
 
 
6.Dry run the pseudo code with all test data from step #2
Done/Not Done - Done

7.Write the code on note pad
Done/Not Done - Done

8. Dry run the code with all test data from step #2
Done/Not Done - Done

9. Write code on IDE (remember to add comments and practice coding standards)
Done/Not Done - Done

10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
Done/Not Done - 

11. Check for any gaps of code optimization (if not optimized already in Step #9)
Done/Not Done - 
*/
	public int sumOfUnique(int[] nums){
		
		if(nums.length == 0) throw new RuntimeException("it's not a valid Input");
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer each_element : nums) {
			map.put(each_element, map.getOrDefault(each_element, 0) + 1);
		}
		for (Entry<Integer, Integer> each_value : map.entrySet()) {
			if (each_value.getValue() == 1) {
				sum += each_value.getKey();
			}
		}
		return sum;
	}

	public void charactercount(String str) {
	
		HashMap<Character,Integer> map  = new HashMap<Character,Integer>(); // O(n)
		
		for (char each_element : str.toCharArray()) { // O(N)
			map.put(each_element, map.getOrDefault(each_element, 0)+1);
		}
		
		System.out.println(map);
		
	}
	
	
	@Test
	public void tc4() {
		charactercount("comcast");
	}
	@Test
	public void tc1() {
		Assert.assertEquals(5, sumOfUnique(new int[] { 1, 2, 2, 3, 3, 4 }));
	}

	@Test
	public void tc2() {
		Assert.assertEquals(0, sumOfUnique(new int[] {}));
	}

	@Test
	public void tc3() {
		Assert.assertEquals(0, sumOfUnique(new int[] { 1, 1, 1 }));
	}
}
