import java.util.Arrays;

public class ChangingValuesOfArrays {

    public static void main(String[] args){

        int[] arr = {12,343,524,2,234,24,2};

        changeFirstIndexValue(arr);
        System.out.println(Arrays.toString(arr
        )); // here we can see that the value of first index is changed
        // this is because both the reference variables are pointing to the
        // same object in the heap


    }

    static void changeFirstIndexValue( int[] array){
        array[0]= 1;

    }


}
