import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean answer = isPrime(n);
        System.out.println(answer);



    }
    static boolean isPrime(int num){
        int c = 2;

        if (num <= 1) {
            return false;
        }

        while( c*c <= num){
            if(num % c ==0 ){
                return false;
            }
            c++;
        }
        return true; // this is basically returning if c*c > num
    }
}
