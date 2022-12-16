import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        // int x = 5;

        // Integer x = new Integer(5);

        //System.out.println(x);


        ArrayList <Integer> s = new ArrayList<>();

        //{key: value}
        // {"Beni":"Franklin"}
        // {"Sarah":"Conor"}


//        HashMap<String, String> myHashMap = new HashMap();
//        myHashMap.put("England","London");
//        myHashMap.put("Germany", "Berlin");
//        myHashMap.put("Norway", "Oslo");
//        myHashMap.put("USA", "Washington DC");
//
//        System.out.println(myHashMap.get("USA"));


//        HashMap<Integer, String> myHashMap = new HashMap();
//        myHashMap.put(1,"London");
//        myHashMap.put(2, "Berlin");
//        myHashMap.put(3, "Oslo");
//        myHashMap.put(4, "Washington DC");

        // System.out.println(myHashMap.get("USA"));
//        System.out.println(myHashMap.get(1));


        HashMap<Integer,Person> intPersonMap = new HashMap<>();

        Person p1 = new Person(10,"Sarah");
        Person p2 = new Person(15,"Moshe");
        Person p3 = new Person(20,"David");

        intPersonMap.put(33312345,p1);
        intPersonMap.put(84657578,p2);
        intPersonMap.put(65498784,p3);

        System.out.println(intPersonMap.get(65498784));



    }
}
