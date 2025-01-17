import java.util.*;
class StringLowerCase{
    private static String StringToLower(String text){
	    int n=text.length();
		String lowerCase="";
		for(int i=0;i<n;i++){
		   int charInt=(int)text.charAt(i);
		  
		   if(charInt>=65 && charInt<=90){
			  charInt=charInt+32;
		      char tempc=(char)charInt;
			  
		      lowerCase=lowerCase+tempc;
		   }
		   else{
		       lowerCase=lowerCase+text.charAt(i);
		   }
		}
		
		return lowerCase;
	}
		        
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input=sc.nextLine();

		String lowerCase1=StringToLower(input);
		String lowerCase2=input.toLowerCase();
		if(lowerCase2.equals(lowerCase1)){
		   System.out.println("Strings are equal by both functions: "+lowerCase1+"=="+lowerCase2);
		}
		else{
		     System.out.println("Strings are not equal by both functions: "+lowerCase1+"!="+lowerCase2);
	    }
		sc.close();
	}
	
}
		