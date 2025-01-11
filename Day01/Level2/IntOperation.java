import java.util.*;
class IntOperation{
    public static void main(String args[]){
        // Scanner Class Object
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Values");
        // First Input Variable
		int a = sc.nextInt();
        // Second Input Variable
		int b = sc.nextInt();
        // Third Input Variable
		int c = sc.nextInt();
           
		int w = a + b *c;
		int x = a * b + c;
		int y = c + a / b; 
		int z = a % b + c;
		System.out.println("W: "+w+" X: "+x+" Y: "+y+" Z: "+z);
        sc.close();
	}
}

