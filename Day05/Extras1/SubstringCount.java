import java.util.*;
class SubstringCount{
    private static int countOfString(String input,String substr){
	    int n=substr.length();
		int N=input.length();
		int count=0;
		String temp="";
		for(int i=0;i<=(N-n);i++){
		  temp=input.substring(i,i+n);
		  if(temp.equals(substr)){
		    count+=1;
		  }
		}
		return count;
	}
		     
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String and Substring of it");
		String input=sc.next();
		String substr=sc.next();
		int countOfsubstring=countOfString(input,substr);
		System.out.println("Sub String: "+countOfsubstring);
    }
}	
