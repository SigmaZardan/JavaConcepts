public class Shadowing {
   static int x = 90; // here this vlue is shadowed in line number 7s

    public static void main(String[] args){

        System.out.println(x);
        int x = 19;
        System.out.println(x);
        printNumber();


    }
    static void printNumber(){

        System.out.println(x);
    }
}
