import java.util.*;
class AnagramString{
    private static boolean checkAnagram(char []input1Arr,char []input2Arr){
	    Arrays.sort(input1Arr);
		Arrays.sort(input2Arr);
		boolean isAnagram=true;
		if(input1Arr.length==input2Arr.length){
		  for(int i=0;i<input1Arr.length;i++){
		    if(input1Arr[i]!=input2Arr[i]){
			    isAnagram=false;
				break;
		    }
		  }
		}
		else if(input1Arr.length!=input2Arr.length){
		    isAnagram=false;
		}
		
	    return isAnagram;
		
			  
	}
    public static void main(String args[]){
	    Scanner sc =new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		char []input1Arr=input1.toCharArray();
		char []input2Arr=input2.toCharArray();
		boolean isAnagram=checkAnagram(input1Arr,input2Arr);
		System.out.println("Strings are Anagram :"+isAnagram);
		sc.close();
	}
}