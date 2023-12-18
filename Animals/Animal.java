package Animals;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    public static <T> void main(String[] args) {
        // Farm<Car> c = new Farm();
        // Farm<Dog> d = new Farm<Dog>("This is a dog");
        // Farm<Cat> ca = new Farm<Cat>("This is a cat");
        // d.toString();
        // ca.toString();

        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("there");
        list1.add("Java");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        displayList(list1);
        displayList(list2);

    }

    public static <T> void displayList(List<?> list){
        for(Object item: list) {
            System.out.println(item);
        }
    } 
}

class AnimalClass {
    private String name;

    public AnimalClass(String name) {
        this.name = name;
    }

    public void myIdentification() {
        System.out.println("I am an animal");
    }
}

class Dog extends AnimalClass {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void myIdentification() {
        System.out.println("It is a dog");
    }
}

class Cat extends AnimalClass {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void myIdentification() {
        System.out.println("It is a cat");
    }
}

class Car {
    String color;

    public Car(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("This is a color: " + color);
    }
}

class Farm<T extends AnimalClass> {
    public Farm(String string) {
        System.out.println(string);
    }

}