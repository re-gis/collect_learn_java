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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age = "+ age + "]";
    }
}

class Student extends Person {
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    private int stId;

    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    @Override
    public String toString(){
        return "Student [name=" + getName() + ", age=" + getAge() + ", school=" + school + ", stId=" + stId + "]";
    }
}

public class UpCast{
    public static void main(String[] args) {
        Student std = new Student();
        std.setAge(20);
        std.setName("D Regis");
        std.setSchool("RCA");
        std.setStId(23456789);

        // upp casting
        Person prsn = std;
        System.out.println(prsn);

        
    }
} 