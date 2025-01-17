import java.util.*;
class LongestString{
    static String checkforlongest(String str){
	    String []words=str.split(" ");
		
		int longest=words[0].length();
		int longestIndex=0;
		for(int i=1;i<words.length;i++){
		   if(words[i].length()>longest){
		    longest=words[i].length();
			longestIndex=i;
			
			}
		}
		return words[longestIndex];
	}
    public static void main(String args[]){
	    Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		String longestString=checkforlongest(str);
		System.out.println(longestString);
	}
}
		
		