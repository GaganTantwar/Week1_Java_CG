import java.util.*;
class StringsAndLength{
    private static String[] StringArray(String str){
		int count=0;
		for(int i=0;i<str.length();i++){
		    if((str.charAt(i))==' '){
			   count+=1;
			   continue;
			}
			else if((i==(str.length()-1)) && str.charAt(i)!=' '){
				count+=1;
			}
			
		}
		String []words=new String[count];
		String temp="";
		int j=0;
		for(int i=0;i<str.length();i++){
		    if((str.charAt(i))==' '){
			   words[j]=temp;
			   j+=1;
			   temp="";
			   continue;
			}
			else if((i==(str.length()-1)) && str.charAt(i)!=' '){
				temp=temp+str.charAt(i);
				words[count-1]=temp;

			}
			else{
				temp=temp+str.charAt(i);
			}
			
		}
        return words;
		
	}
    private static int lengthOfString(String str){
		int length=0;
        for (char c1 : str.toCharArray()){
			length++;
		}
		return length;
	}
    private static  String[][] twoDarrayofString (String words[], int length[]){
        String [][] twoDarray=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            twoDarray[i][0]=words[i];
            String temp=String.valueOf(length[i]);
			twoDarray[i][1]=temp;
		}
		return twoDarray;
	}
    public static void main(String args[]){
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String for Execution ");
		
		String input=sc.nextLine();
		
		
		String []words=StringArray(input);
		int []length= new int[words.length];
		
		for(int i=0;i<words.length;i++){
			length[i]=lengthOfString(words[i]);
			
		}
		String [][]twoDarray=twoDarrayofString(words,length);
		for(int i=0;i<words.length;i++){
			
			System.out.println("Words "+ twoDarray[i][0]+" Length: "+twoDarray[i][1]);
		}
		
		sc.close();
	
		
	}
}