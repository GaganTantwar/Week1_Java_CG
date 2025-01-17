import java.util.*;
class GuessingNumber{
    public static int randomGuess(){
        int randomNumber=(int)((Math.random()*99)+1);
        return randomNumber;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number for execution:");
        int chances=sc.nextInt();
        while(chances!=0){

            int inputNumber=sc.nextInt();
            int randomNumber=randomGuess();
            if(inputNumber>randomNumber){
                System.out.println("Guessed Number is Less than Inputed Number: "+randomNumber);
            }
            else if(inputNumber<randomNumber){
                System.out.println("Guessed Number is Greater than Inputed Number: "+randomNumber);

            }
            else{
                System.out.println("Guessed Number is Equal to Inputed Number: "+randomNumber);
                break;
            }
            chances-=1;
        }
        if(chances>0){
            System.out.println("You Win");
        }
        else{
            System.out.println("You Loss");
        }

    }
}