import java.util.*;
class MaximumIn3{
    int first;
    int second;
    int third;
    public MaximumIn3(int first,int second,int third){
        this.first=first;
        this.second=second;
        this.third=third;
    }
    public  int findMaximum(){
        int maxi;
        if(first>second && first>third){
            maxi=first;
        }
        else if(second>first && second>third){
            maxi=second;
        }
        else{
            maxi=third;
        }
        return maxi;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number:");
        int first=sc.nextInt();
        int second=sc.nextInt();
        int third=sc.nextInt();
        MaximumIn3 max=new MaximumIn3(first,second,third);
    
        int maximum=max.findMaximum();
        System.out.println("Maximum in 3: "+maximum);
    }
}