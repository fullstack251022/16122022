import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

       Animal a1 = new Ponny();
       Animal a2 = new Horse();
       // Animal a3 = new Animal(); //CANNOT create instances of abstract class

        animals.add(a1);
        animals.add(a2);

        for (Animal animal:
             animals) {
            animal.poo();
            animal.eat();
        }

    }
}



abstract public class Animal {

    int age;

    abstract public void eat();

    public void poo(){
        System.out.println("Pooweopp mlksdfmkl");
    }

}


public class Horse extends Animal{
    @Override
    public void eat() {
        System.out.println("Nyommm hrrr");
    }
}



public class Ponny extends Horse implements Zoo, PonnyActivites{

    @Override
    public void poo() {
        System.out.println("poower pwerpwoerpew");
    }


    @Override
    public void eatAt18() {

    }

    @Override
    public void cleaning() {

    }

    @Override
    public void veterenarCheck() {

    }

    @Override
    public void eatMothersMilk() {

    }
}



public interface Zoo {

    public void eatAt18();

    public void cleaning();

    public void veterenarCheck();
}


public interface PonnyActivites {

    public void eatMothersMilk();
}

