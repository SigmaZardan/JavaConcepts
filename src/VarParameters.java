import java.util.Arrays;

public class VarParameters {

    public static void main(String[] args){

        fun(13,412,4,124,12,4,2,234,6456,456,456,345);
        fun2("bibek","kapil","Sujan","learning","making","things","work");



    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v
        ));
    }

    static void fun2(String ...v){

        System.out.println(Arrays.toString(v));
    }
}
