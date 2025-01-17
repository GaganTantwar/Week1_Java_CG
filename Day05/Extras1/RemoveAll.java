import java.util.*;
class RemoveAll{
    public static void main(String args[]){
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter String and Index of Character to remove: ");
		String input=sc.next();
		int index=sc.nextInt();
		char remove=input.charAt(index);
		String afterRemove=input.replace(String.valueOf(remove),"");
		System.out.println("String After Removing: "+afterRemove);
	}
}