public class Overloading {
    public static void main(String[] arg){

        // Overloading means using functions with same name but having different parameters
         // if we pass two arguments it will call the first function with two parameters
       int answer =  sum(123,34);
        System.out.println(answer);
        // if we pass three arguments it will call the second function with three parameters

        int answer2 = sum(23,99,83);
        // this is how function overloading is done
        System.out.println(answer2);
        String answer3 = sum("Bibek");
        System.out.println(answer3);

    }

    static int sum(int a, int b){

        return a + b;
    }

    static int sum(int a, int b, int c){

        return a + b + c;
    }

    static String sum( String a){ // the name seems weird but the concept
        // is same

        return a;
    }
}
