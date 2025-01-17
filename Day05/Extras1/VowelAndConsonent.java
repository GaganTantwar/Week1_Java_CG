import java.util.*;
class VowelAndConsonent{
    public static void main(String args[]){
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String text=sc.nextLine();
		int vowelCount=0;
		int consonentCount=0;
		for(int i=0;i<text.length();i++){
		    char ch=text.charAt(i);
			if((ch=='A' || ch=='a')||(ch=='i' || ch=='I')||(ch=='o' || ch=='O')|| (ch=='u'||ch=='U')||(ch=='e'||ch=='E')){
			    vowelCount+=1;
			}
			else{
			     consonentCount+=1;
		    }
		}
		System.out.println("Vowel in the give String: \""+vowelCount+"\"");
		System.out.println("Consonent in the given String: \""+consonentCount+"\"");
	}
}
			   