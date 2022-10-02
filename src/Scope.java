public class Scope {


    // defining global variables
   static int a = 123;


    public static void main(String[] args){
        int a = 12; // this is local to the block

        System.out.println(a);

        showValues();


    }
    static void showValues(){
        a =234223;
        System.out.println(a);
    }
}
