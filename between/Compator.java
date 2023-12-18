package between;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compator {
    public static void main(String[] args) {
        Person Aime = new Person();
        Aime.setAge(9);
        Aime.setName("Aime");
        Aime.setHeight(30);

        Person Regis = new Person();
        Regis.setAge(20);
        Regis.setHeight(20);
        Regis.setName("Irumva");

        List<Person> li = new ArrayList<>();
        li.add(Regis);
        li.add(Aime);

        Collections.sort(li, new CompareHeights());

        for(Person p:li){
            System.out.println(p.getHeight());
        }
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

class CompareAge implements Comparator<Person> {
    /**
     * 
     * @author D Regis
     * @see https://github.com/re-gis
     * @see #compare
     * @see Class.Person
     */
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getAge() > p2.getAge()) {
            return 1;
        }

        return -1;
    }
}


class CompareHeights implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2){
        if(p1.getHeight() < p2.getHeight()){
            return 1;
        }
        return -1;
    }
}