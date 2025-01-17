import java.util.*;
class PalindromeCheck{
    public static boolean checkPalindrome(String input){
        boolean isTrue=true;
        int tempn=input.length();
        for(int i=0;i<=tempn/2;i++){
            if(input.charAt(i)!=input.charAt(tempn-1-i)){
                isTrue=false;
                break;
            }
        }
        return isTrue;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input=sc.next();
        boolean check=checkPalindrome(input);
        System.out.println("String is Palindrome: "+check);
    }
}