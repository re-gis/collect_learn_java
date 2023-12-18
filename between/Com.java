package between;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Com {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<>();
        li.add(new Student("Lidvine", "Bizimana", 89, 19));
        li.add(new Student("Jean", "Mugabe", 85, 11));
        li.add(new Student("Clarisse", "Uwineza", 80, 13));
        // Collections.sort(li, new CompareGrades());
        // Collections.sort(li, new CompareAges());

        Collections.sort(li);


        for (Student s : li) {
            System.out.println(s.lname);
        }
    }

}

// class Student implements Comparablec<Student> {
//     String fname;
//     String lname;
//     int age;
//     int grade;

//     public Student(String fname, String lname, int grade, int age) {
//         super();
//         this.lname = lname;
//         this.fname = fname;
//         this.grade = grade;
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return super.toString();
//     }

//     @Override
//     public int compareTo(Student o) {
//         if(this.age > o.age ){
//             return 1;
//         }
//         return -1;
//     }
// }

class CompareGrades implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.grade > s2.grade) {
            return 1;
        }
        return -1;
    }
}

class CompareAges implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age > o2.age) {
            return 1;
        }
        return -1;
    }
}