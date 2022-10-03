import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args){

        /// if the cube of the individual numbers of a given number is
        // equal to the number then it is called an Armstrong Number.
        System.out.print("Enter a number to be checked:");
        int number = scanner().nextInt();

        boolean result = isArmstrongOrNot(number);
        System.out.println(result);

    }

    static Scanner scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }


    static boolean isArmstrongOrNot(int num){
        int result = 0;
        int originalValue = num;

        while(num > 0){

            int remainder= num % 10;
            result = result +(int) Math.pow(remainder, 3);
            num = num / 10;

        }
       return originalValue == result;
    }
}
