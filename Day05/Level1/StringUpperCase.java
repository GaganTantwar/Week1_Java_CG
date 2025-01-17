import java.util.*;
class StringUpperCase{
    private static String StringToUpper(String text){
	    int n=text.length();
		String upperCase="";
		for(int i=0;i<n;i++){
		   int charInt=(int)text.charAt(i);
		  
		   if(charInt>=97 && charInt<=122){
			  charInt=charInt-32;
		      char tempc=(char)charInt;
			  
		      upperCase=upperCase+tempc;
		   }
		   else{
		       upperCase=upperCase+text.charAt(i);
		   }
		}
		
		return upperCase;
	}
		        
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String upperCase1=StringToUpper(input);
		String upperCase2=input.toUpperCase();
		if(upperCase2.equals(upperCase1)){
		   System.out.println("Strings are equal by both functions: "+upperCase1+"=="+upperCase2);
		}
		else{
		     System.out.println("Strings are not equal by both functions: "+upperCase1+"!="+upperCase2);
	    }
		sc.close();
	}
	
}
		