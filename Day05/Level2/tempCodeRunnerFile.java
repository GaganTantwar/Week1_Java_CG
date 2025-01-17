import java.util.*;
class StringsAndLength{
    private static String[] stringArray(String str){
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
	private static boolean stringCompare(String []words1,String []words2){
        System.out.println(words1.length+" "+words2.length);
        boolean isTrue=false;
		if(words1.length==words2.length){
            for(int i=0;i<words1.length;i++){
                if(words1[i].equals(words2[i])){
					isTrue=true;
			    }
                else{
                    isTrue=false;
                    break;
                }
            
			}
		}
		
		return isTrue;
	}
	public static void main(String args[]){
	    Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String for Execution ");
		
		String input=sc.nextLine();
		
		String []words1=stringArray(input);
		String []words2=input.split(" ");
        for(int i=0;i<words1.length;i++){
                System.out.println("Words of String: "+words1[i]);
                System.out.println("Words of String: "+words1[i]);
        }
		boolean isTrue=stringCompare(words1,words2);

		System.out.println("String are equal: "+isTrue);
	}
}
