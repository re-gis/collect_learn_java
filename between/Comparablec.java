package between;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparablec {
    public static void main(String[] regs){
        Person Aime = new Person();
        Aime.setAge(9);
        Aime.setName("Aime");

        Person Regis = new Person();
        Regis.setAge(20);
        Regis.setName("Irumva");

        List<Person> li = new ArrayList<>();
        li.add(Regis);
        li.add(Aime);

        Collections.sort(li);

        for(Person p: li){
            System.out.println(p.getAge());
        }



    }
}

class Person implements Comparable<Person> {
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

    @Override
    public int compareTo(Person p) {
        if (this.age < p.getAge()) {
            return 1;
        }
        return -1;
    }
}