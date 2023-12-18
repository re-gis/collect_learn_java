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

}


class Staff extends Person {
    // method to return hello I am staff
    public void displayIndentification () {
        System.out.println("Hello I am staff...");
    }
}


class Employee extends Staff {
    @Override 
    public void displayIndentification() {
        System.out.println("Hello I am an employee");
    }

    // method to print the employee type
    public void displayEmployeeType () {
        super.displayIndentification();
    }
}


public class Inherit {
    public static void main(String [] args) {
        Employee emp = new Employee();
        emp.displayEmployeeType();
        emp.displayIndentification();
    }
}