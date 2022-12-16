public class Main {
    public static void main(String[] args) {

        //escape character
        String s = "\"Hello\" \"World\" \\ ";
        System.out.println(s);


        //create Person Class: name, age, ctor,  Override toString method
        //create 3 instances of Person
        //sout all of them with help of foreach method

        Person p1 = new Person(10, "Sarah");
        Person p2 = new Person(20, "Moshe");
        Person p3 = new Person(30, "Sarah");

        Person[] persons = {p1, p2, p3};


        for (Person person : persons) {
            System.out.println(person);
            if (person.age < 18) {
                System.out.println(person.name + " age is under 18");
            }
        }


//        String[] myArrayNames = {"Sarah", "Moshe", "David"};
//
//        //foreach
//        for (String element : myArrayNames) {
//            System.out.println(element);
//        }

//        for (int i = 0; i < myArrayNames.length; i++) {
//            System.out.println(myArrayNames[i]);
//        }

    }
}
