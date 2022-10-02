public class Swap {

    public static void main(String[] args){

        int a = 10;
        int b = 20;

        swap(a,b); // while calling this the values are changed only on the
        // scope of the function

        System.out.println("the value of original a" + a); // these values are not changes
        System.out.println("The value of original b" + b);
    }

    static void swap(int a, int b){
        // the values are changed only in this scope
        int temp = b;
        b = a;
        a = temp;
        System.out.println("The value of a" + a);
        System.out.println("The value of b" + b);

    }
}
