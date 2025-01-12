import java.util.*;
class CheckNumberFun{
    public int checkNumber(int num){
	    int check;
	    if(num>0){
		   check=1;
		}
		else if(num<0){
		    check=-1;
		}
		else{
		    check=0;
		}
		return check;
	}  
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number=sc.nextInt();
		CheckNumberFun check=new CheckNumberFun();
		int checknum= check.checkNumber(number);
		if(checknum==-1){
		   System.out.println("Entered Number is Negative");
		}
		else if(checknum==1){
		    System.out.println("Entered Number is Positive");
		}
		else{
		    System.out.println("Entered Number is Zero");
		}
		sc.close();
	}
}
		
		
		
		
		