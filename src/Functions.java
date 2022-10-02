import java.util.Scanner;

public class Functions {

    public static void main(String[] args){

         // calling function sum() that returns an integer value
      int ans = sum();
      System.out.println(ans);

      // calling function sum2() that does not return integer value
     sum2();

     // calling the third function
       int ans2 =   sum3(54,45); // here the arguments can be different as our input
       System.out.println(ans2);



    }

    // scanner function
    static Scanner scanner(){ // there is return type of class type
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }

    // this function has a return type int without parameters
    static int sum(){
        int num1 = scanner().nextInt();
        int num2 = scanner().nextInt();
        int sum = num1 + num2;
        return sum;


    }

    // this is a function that does not have a return type and parameters
    static void sum2(){
        int num1 = scanner().nextInt();
        int num2 = scanner().nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

    }

    // this is a function with return type and also with parameters passed
    static int sum3(int a, int b){
        return a + b;
    }

}
