import java.util.*;
class LCM_HCF{
    public static int findGcd(int first,int second){
        int min;
        if(first>second){
            min=second;
        }
        else{
            min=first;
        }
        int res=min;
        while(res>0){
            if(first%res==0 && second%res==0){
              break;
            }
            res--;
        }
        return res;
        
    }
    public static int findLcm(int first,int second,int gcd){
        int lcm=(first*second)/gcd;
        return lcm;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int first=sc.nextInt();
        int second=sc.nextInt();
        
        int gcd=findGcd(first,second);
        System.out.println("GCD is :"+gcd);
        int lcm=findLcm(first,second,gcd);
        System.out.println("LCM is: "+lcm);
    }

}