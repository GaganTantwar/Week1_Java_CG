import java.util.*;
class Fibonacci{
    public static int getCount(int number){
        int first=0;
        int second=1;
        int count=0;
        int next=first+second;
        while(next<=number){
            first=second;
            second=next;
            next=first+second;
            count+=1;
        }
        return count;
    }
    public static int [] getFibonacci(int count){
        int []fibonacci=new int[count+2];
        fibonacci[0]=0;
        fibonacci[1]=1;
        fibonacci[2]=1;
        for(int i=3;i<=count+1;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];

        }
        return fibonacci;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number=sc.nextInt();
        int count=getCount(number);
        int fibonacci[]=getFibonacci(count);
        for(int i=0;i<fibonacci.length;i++){
            System.out.print(fibonacci[i]+" ");
        }

    }
}