public class SwappingStrings {

    public static void main(String[] args){

        String name = "Bibek";
        changeString(name);
        System.out.println(name); // here the value is not changed because strings are immutable.
    }

    static void changeString(String naam){
        naam = "Sanzeena"; // the value that is passed is only changed in this scope
        System.out.println(naam);
    }
}
