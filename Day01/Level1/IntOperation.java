import java.util.*;
class IntOperation{
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int w = a + b *c;
		int x = a * b + c;
		int y = c + a / b; 
		int z = a % b + c;
		System.out.println("W: "+w+" X: "+x+" Y: "+y+" Z: "+z);
	}
}