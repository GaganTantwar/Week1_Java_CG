import java.util.*;
class EvenOddArr{
    public static void main(String args[]){
		// Scanner class object
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");

		int number = sc.nextInt();
		if(number<=0){
			System.out.println("Error Number is not natural");
			System.exit()
		}
		else{
			
		    int size=number/2+1; //size of even and odd array
            // Even array declaration
		    int evenarr[]=new int[size];
            // Odd array decleration
            int oddarr[]=new int[size];
		    int k=0,j=0;
            for(int i=1;i<=number;i++){
               if(i%2==0){
                 evenarr[k]=i;
                 k++;
               }
               else{
                   oddarr[j]=i;
                   j++;
               }
            }
            for(int i=0;i<k;i++){
               // printing even array
               System.out.println("Even Numbers are "+ evenarr[i]);
	        }
		    for(int i=0;i<j;i++){
                // printing odd array
		        System.out.println("Odd Numbers are "+ oddarr[i]);
		    }
            // closing scanner class object
		}
		    sc.close();
			
	}
}
