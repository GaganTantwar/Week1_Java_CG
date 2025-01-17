import java.util.*;
class PrimeCheck{
    public static boolean primeChecker(int number){
        if(number==2 || number==3 || number==1){
            return true;
        }
        else{
            int tempn=(int)Math.sqrt(number);
            for(int i=2;i<=tempn;i++){
                if(number%i==0){
                  return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number=sc.nextInt();
        boolean checkPrime=primeChecker(number);
        System.out.println("Number is Prime: "+checkPrime);
    }
}