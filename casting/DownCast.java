class Animal {
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

}

class Dog extends Animal {

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String sound() {
        return "Barks";
    }
}

public class DownCast {
    public static void main(String[] args) {
        Animal animal = new Dog();

        if (animal instanceof Dog) {

            // downcasting
            Dog dog = (Dog) animal;
            dog.setAge(3);
            dog.setName("Puppy");
            dog.setOwner("D Regis");
            String dogSound = dog.sound();

            System.out.println("Dog " + dog.getName() + " has " + dog.getAge() + " years " + " && Owner = " + dog.getOwner()
                    + " && it's sound is: " + dogSound);
        }

    }
}
