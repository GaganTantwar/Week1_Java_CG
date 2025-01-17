import java.util.*;
class PalindromeString{
    static boolean checkPalindromeString(String str){
	    for(int i=0;i<str.length()/2;i++){
		    char ch1=str.charAt(i);
			char ch2=str.charAt((str.length()-1-i));
			if(ch1!=ch2){
			   return false;
			}
		}
 		return true;
    }	 
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
		boolean checkPalindrome=checkPalindromeString(str);
		System.out.println("String is Palindrome: \""+checkPalindrome+"\"");
	}
}