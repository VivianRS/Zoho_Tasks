package stringexamplestask;

import java.util.Scanner;

public class StringTask{
	
	
	//Example1 
	public String readString(String args[]){
		if (args.length > 0){
			return args[0];
		}
		
		else{
			return "";
		}
	}
	
	public int stringLength(String str){
		return str.length();
	}
	
	//Example2
	public String inputString(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string that is to be converted to a character array: ");
		return scan.nextLine();
	}
	
	public char[] charArrayConvert(String strInput){
		return strInput.toCharArray();
	}
	
	public void charDisplay(char[] charArr){
		for (char c : charArr){
			System.out.println(c+" ");
		}
	}
		
	
	//Example3
	public String penUltimateChar(String strInput){
		if(strInput.length()<2){
			return "There must be atleast 2 letters to find penultimate letter";
		}
		else{
			return "The penultimate character is: "+strInput.charAt(strInput.length()-2);
		}
	}
	
	//Example4
	public int numberOfOccurrences(String strRepeat,char repeatChar){
		int count=0;
		strRepeat = strRepeat.toLowerCase();
		repeatChar = Character.toLowerCase(repeatChar);
		
		for(int i=0; i<strRepeat.length();i++){
			if(strRepeat.charAt(i)== repeatChar){
				count++;
			}
		}
		return count;
	}
	
	//Example5
	public int greatestPosition(String strRepeat, char repeatChar){
		int position = -1;
		
		for (int i = strRepeat.length()-1;i>0;i--){
			if(strRepeat.charAt(i)==repeatChar){
				position = i+1;
			}
		}
		return position;
	}
	
	//Example6
	public String lastFiveChar(String strRepeat){
		String lastFive = strRepeat.substring(strRepeat.length()-5,strRepeat.length());
		return lastFive;
	}
	
	//Example7
	public String firstThreeChar(String strRepeat){
		String firstThree = strRepeat.substring(0,3);
		return firstThree;
	}
	
	//Example8
	public String xyzAtBegining(String strRepeat){
		if(strRepeat.length()<3){
			return "XYZ";
		}
		else{
			return "XYZ"+strRepeat.substring(3);
		}
	}
	
	//Example9
	public boolean entStartCheck(String strRepeat){
		String entCheck = strRepeat.substring(0,3);
		if (entCheck.equals("ent")){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Example10
	public boolean leEndCheck(String strRepeat){
		String leCheck = strRepeat.substring(strRepeat.length()-2,strRepeat.length());
		if (leCheck.equals("le")){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Example11
	public String convertLowerToUpper(String strRepeat){
		strRepeat=strRepeat.toUpperCase();
		return strRepeat;
	}
	
	//Example12
	public String convertUpperToLower(String strRepeat){
		strRepeat=strRepeat.toLowerCase();
		return strRepeat;
	}
	
	//Example13
	public String reverseString(String strRev){
		String revStr="";
		char ch;
		for(int i=0;i<strRev.length();i++){
			ch=strRev.charAt(i);
			revStr=ch+revStr;
		}
		return revStr;
	}
	
	//Example14
	public String multipleLine(){
		Scanner mulScan = new Scanner(System.in);
		String mulInput = mulScan.nextLine();
		return mulInput;
	}
	
	//Example15
	public String multiLineConcat(){
		String multiConcat = multipleLine();
		String concatStr = "";
		String[] concatStrArr = multiConcat.split(" ");
		for (String word : concatStrArr){
			concatStr+=word;
		}
		return concatStr;
	}
	
	//Example16
	public String[] stringArrayConvert(){
		Scanner arrScan=new Scanner(System.in);
		String arrString = arrScan.nextLine();
		String[] stringArray = arrString.split(" ");
		return stringArray;
	}
	
	//Example17
	public String[] mergeStringDash(){
		Scanner mergeScan=new Scanner(System.in);
		String mergeString = mergeScan.nextLine();
		String mergeStr = "";
		String[] mergeStrArr = mergeString.split(" ");
		return mergeStrArr;
	}
	
	//Example18
	public boolean compareTwoString(String firstString,String secondString){
		if(firstString.equals(secondString)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Example19
	public boolean compareTwoStringInsensitive(String firstInsensitiveString,String secondInsensitiveString){
		if(firstInsensitiveString.equalsIgnoreCase(secondInsensitiveString)){
			return true;
		}
		else{
			return false;
		}
	}
	
	//Example20
	public String trimSpace(String spaceStr){
		String trimmedString = spaceStr.trim();
		return trimmedString;
	}
		
		
	
}