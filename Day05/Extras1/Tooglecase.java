import java.util.*;
class Tooglecase{
    private static int checkCase(String input){
	    int isupper=1;
		int islower=2;
		int clower=0;
		int cupper=0;
		for(int i=0;i<input.length();i++){
		    if(Character.isUpperCase((input.charAt(i)))){
			   cupper+=1;
			}
			else{
			    clower+=1;
			}
		}
		if(cupper==input.length()){
		   return isupper;
		}
		else if(clower==input.length()){
			return islower;
		}
	    else{
			return 0;
		}
	}
    public static void main(String args[]){
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String Either in UpperCase or in LowerCase");
		String input=sc.next();
		int afterCheck=checkCase(input);
		if(afterCheck==1){
		   String lower=input.toLowerCase();
		   System.out.println("String in UpperCase: "+input+" "+"String in LowerCase: "+lower);
		}
		else if(afterCheck==2){
		    String upper=input.toUpperCase();
			System.out.println("String in LowerCase: "+input+" "+"String in UpperCase: "+upper);
		}
		else{
			System.out.println("Please Enter a Valid String");
		}
		sc.close();
	}
}