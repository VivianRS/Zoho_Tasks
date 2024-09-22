package stringtestrunner;

import stringexamplestask.StringTask;
import java.util.Scanner;

public class StringRunner{
	
	public static void main(String[] args){
		
		//Object creation for class StringTask
		StringTask st = new StringTask();
		
		
		//Exercise 1
		String input = st.readString(args);
		int len = st.stringLength(input);
		System.out.println("The given string is "+input+" and its length is "+len);
		
		
		//Exercise 2
		String strInput = st.inputString();
		char[] charArray = st.charArrayConvert(strInput);
		st.charDisplay(charArray);
		
		
		
		//Exercise 3
		String result = st.penUltimateChar(strInput);
		System.out.println(result);
		
		
		//Example 4
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to find the number of occurrences: ");
		String strRepeat = scan.nextLine();
		System.out.println("Enter the character to be found: ");
		char repeatChar = scan.next().charAt(0);
		int repCount = st.numberOfOccurrences(strRepeat,repeatChar);
		System.out.println("The number of occurrences of the given character are: "+repCount);
		
		//Example 5
		int repPosition = st.greatestPosition(strRepeat,repeatChar);
		System.out.println("The greatest position of that character is: "+repPosition);
		
		//Example 6
		System.out.println("The last 5 letters of the given String are: "+st.lastFiveChar(strRepeat));
		
		//Example 7
		System.out.println("The first 3 letters of the given String are: "+st.firstThreeChar(strRepeat));
		
		//Example 8
		System.out.println("The first 3 replaced words of the given String are: "+st.xyzAtBegining(strRepeat));
	
		//Example 9
		System.out.println("Is the String starting with 'ent'?  "+st.entStartCheck(strRepeat));
		
		//Example 10
		System.out.println("Is the String ending with 'le'?  "+st.leEndCheck(strRepeat));
		
		//Example 11
		System.out.println("The upper case converted String is:  "+st.convertLowerToUpper(strRepeat));
		
		//Example 12
		System.out.println("The lower case converted String is:  "+st.convertUpperToLower(strRepeat));
		
		//Example 13
		System.out.println("The reversed String is:  "+st.reverseString(strRepeat));
		
		//Example 14
		System.out.println("Enter the multiple Strings in multiple lines: ");
		System.out.println("The multiple line Strings are: "+st.multipleLine());
		
		//Example 15
		System.out.println("Enter the multiple Strings for concatenation: ");
		System.out.println("The multiple line Strings concatenated are: "+st.multiLineConcat());
		
		
		//Example 16
		System.out.println("Enter the multiple Strings for String Array: ");
		String[] loopArr = st.stringArrayConvert();
		System.out.print("{");
		for (int i = 0; i<loopArr.length;i++){
			System.out.print("\""+loopArr[i]+"\"");
			if(i<loopArr.length - 1){
				System.out.print(",");
			}
		}
		System.out.print("}");
		
		//Example 17
		System.out.println("");
		System.out.println("Enter the multiple Strings for seperation using dash: ");
		String[] mergeStrLoop = st.mergeStringDash();
		for (int i=0; i<mergeStrLoop.length;i++){
			System.out.print(mergeStrLoop[i]);
			if(i<loopArr.length - 1){
				System.out.print("-");
			}
		}
		System.out.print(".");
		
		
		//Example 18
		System.out.println("");
		System.out.println("Enter the first string for comparision: ");		
		Scanner firstScan = new Scanner(System.in);
		String firstString = firstScan.nextLine();
		System.out.println("Enter the second string for comparision: ");		
		Scanner secondScan = new Scanner(System.in);
		String secondString = secondScan.nextLine();
		System.out.println("Whether the given 2 Strings are equal? "+st.compareTwoString(firstString,secondString));
		
		
		//Example 19
		System.out.println("Enter the first string for comparision: ");		
		Scanner firstInsensitiveScan = new Scanner(System.in);
		String firstInsensitiveString = firstInsensitiveScan.nextLine();
		System.out.println("Enter the second string for comparision: ");		
		Scanner secondInsensitiveScan = new Scanner(System.in);
		String secondInsensitiveString = secondInsensitiveScan.nextLine();
		System.out.println("Whether the given 2 Strings are equal while ignoring case? "+st.compareTwoStringInsensitive(firstInsensitiveString,secondInsensitiveString));
	
	
		//Example 20
		System.out.println("Enter the String with spaces: ");		
		Scanner spaceStrScan = new Scanner(System.in);
		String spaceStr = spaceStrScan.nextLine();
		System.out.println("The Trimmed version of Original String is "+"\""+st.trimSpace(spaceStr)+"\"");
	}
}
