/*
13. Roman to Integer

Roman numerals are represented by seven different symbols: , , , , , and .IVXLCDM

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example,  is written as  in Roman numeral, just two ones added together. is written as , which is simply . The number is written as , which is .2II12XIIX + II27XXVIIXX + V + II

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not . Instead, the number four is written as . Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as . There are six instances where subtraction is used:IIIIIVIX

I can be placed before (5) and (10) to make 4 and 9. VX
X can be placed before (50) and (100) to make 40 and 90. LC
C can be placed before (500) and (1000) to make 400 and 900.DM
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters .('I', 'V', 'X', 'L', 'C', 'D', 'M')
It is guaranteed that is a valid roman numeral in the range .s[1, 3999]
 

*/


class Solution {
    public int romanToInt(String s) {
        char ch, nextChar;
	    int result = 0, romanValue = 0, romanNext = 0;
	   
        Map<Character,Integer> roman = new HashMap<>();
        
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
            
        int length = s.length();
        //s = s.toUpperCase();
        for (int i=0;i<length;i++){
            ch = s.charAt(i);
            
	       if (i+1<length){
	           nextChar = s.charAt(i+1);
    	       if (ch == 'I' && (nextChar == 'X' || nextChar == 'V')){
    	           romanValue = roman.get(nextChar);
    	           romanNext = romanValue - roman.get(ch);
    	           result = result + romanNext;
    	           i++;
    	       } 
    	       else if (ch == 'X' && (nextChar == 'L' || nextChar == 'C')){
    	           romanValue = roman.get(nextChar);
    	           romanNext = romanValue - roman.get(ch);
    	           result = result + romanNext;
    	           i++;
    	       }
    	       else if (ch == 'C' && (nextChar == 'D' || nextChar == 'M')){
    	           romanValue = roman.get(nextChar);
    	           romanNext = romanValue - roman.get(ch);
    	           result = result + romanNext;
    	           i++;
    	       }
    	       else{
    	           romanValue = roman.get(ch);
    	           result = result + romanValue;
    	       }
	       }
	       else{
	           romanValue = roman.get(ch);
    	       result = result + romanValue;
	       }
	    } 
        return result;
    }
}





/*


import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main
{
	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   //String s = input.nextLine();
	   String s = "MCMXCIV";
	   
	   char ch, nextChar;
	   int result = 0, romanValue = 0, romanNext = 0;
	   
	   Map<Character,Integer> roman = new HashMap<>();
	   
	   roman.put('I',1);
	   roman.put('V',5);
	   roman.put('X',10);
	   roman.put('L',50);
	   roman.put('C',100);
	   roman.put('D',500);
	   roman.put('M',1000);
        
	   int length = s.length();
	   //s = s.toUpperCase();
	   for (int i=0;i<length;i++){
	       ch = s.charAt(i);
	       
	       if (i+1<length){
	           nextChar = s.charAt(i+1);
    	       if (ch == 'I' && (nextChar == 'X' || nextChar == 'V')){
    	           romanValue = roman.get(nextChar);
    	           romanNext = romanValue - roman.get(ch);
    	           result = result + romanNext;
    	           i++;
    	       } 
    	       else if (ch == 'X' && (nextChar == 'L' || nextChar == 'C')){
    	           romanValue = roman.get(nextChar);
    	           romanNext = romanValue - roman.get(ch);
    	           result = result + romanNext;
    	           i++;
    	       }
    	       else if (ch == 'C' && (nextChar == 'D' || nextChar == 'M')){
    	           romanValue = roman.get(nextChar);
    	           romanNext = romanValue - roman.get(ch);
    	           result = result + romanNext;
    	           i++;
    	       }
    	       else{
    	           romanValue = roman.get(ch);
    	           result = result + romanValue;
    	       }
	       }
	       else{
	           romanValue = roman.get(ch);
    	       result = result + romanValue;
	       }
	   } 
	   System.out.println(result);
	   
	}
}

*/
