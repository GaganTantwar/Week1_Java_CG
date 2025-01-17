import java.util.*;
class ReverseString{
    static char[] reverseString(String str){
	    char []reverseStr=new char[str.length()];
	    for(int i=0;i<str.length();i++){
		   reverseStr[i]=str.charAt((str.length()-1-i));
		}
		return reverseStr;
	}
	
		
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter a String");
		char []reverseStr=reverseString(str);
		System.out.print("Reverse of given string: ");
		for(int i=0;i<reverseStr.length;i++){
			System.out.print(reverseStr[i]);
		}
	}
}