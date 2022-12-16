import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        // String [] myStringArray = new String[5];
        String[] myStringArray = {"Honda", "Skoda", "BMW"};

        // System.out.println(Arrays.toString(myStringArray));

        ArrayList<String> names = new ArrayList();
        names.add("Sarah");
        names.add("Moshe");
        names.add("David");

        ArrayList<String> test = new ArrayList();

//        System.out.println(names.size());
//        names.add("Eden");
//        System.out.println(names.size());
//
//        System.out.println(names.get(0));
//        System.out.println(names);

//        names.add(2,"Beni");

//        for (int i = 0; i < names.size(); i++) {
//            // System.out.println(names[i]); //instead we call method .get()
//            System.out.println(names.get(i));
//        }

        for (String name : names) {
            System.out.println(name);
            test.add(name);
        }

        //System.out.println(test);
        // names.add("test");



    }


}
