package hw6;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(50);
        dog.barking();
        dog.look();

        System.out.println();
        Husky husky = new Husky();
        husky.barking();
        husky.look();

        System.out.println();
        Owl owl = new Owl(0);
        owl.fly(2, "white");
        owl.look();

        System.out.println();
        Tytonidae ginger = new Tytonidae();
        ginger.fly(1);
        ginger.look();



    }
}

abstract class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    Animal() {
    }

    abstract void   look();


}


class Dog extends Animal {

    private int height;


    Dog(int height) {
        super("Chappi", 5);
        this.height = height;

    }


    public void barking() {
        System.out.println("Dog is barking");

    }


    public void look() {
        System.out.println("Dog is looking");

    }



}

class Husky extends Dog {
    Husky() {
        super(80);

    }

    @Override
    public void barking() {
        System.out.println("Husky is barking");

    }

    @Override
    public void look() {
        System.out.println("Husky is looking");

    }



}


class Owl extends Animal {

    int countOfEars;

    Owl(int countOfEars) {
        this.countOfEars = countOfEars;

    }


    public void fly(int countOfWings) {
        System.out.println("Owl has " + countOfWings + "wings and owl is flying");

    }

    public void fly(int countOfWings, String colorOfBird) {
        System.out.println("Owl  is "   + colorOfBird  + " it has " + countOfWings + " wings  " + " and it's flying");

    }


    public void look() {
        System.out.println("Owl is looking");

    }
}


class Tytonidae extends Owl {
    Tytonidae() {
        super(2);
    }

    @Override
    public void fly(int countOfWings) {
        System.out.println("Tytonidae has " + countOfWings + " wing");

    }

    public void fly(int countOfWings, String colorOfBird) {
        System.out.println("Tytonidae  is "   + colorOfBird  + " it has " + countOfWings + " wings  " + " and it's flying");

    }

    @Override
    public void look() {
        System.out.println("Tytonidae is looking");

    }


}


