class Student {
    private String fName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    private String lName;

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    private String dob;

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private Address Address;

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address address) {
        Address = address;
    }

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Student(String fname, String lname, String dob, Address address, String gender, String cname) {
        this.lName = lname;
        this.fName = fname;
        this.Address = address;
        this.className = cname;
        this.dob = dob;
        this.gender = gender;

        count++;
    }
}

class Address {
    private String sector;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    private String cell;

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}

public class Count {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCell("Testing cell");
        address.setSector("Testing sector");

        // create a student
        Student stdnt = new Student("Irumva", "Regis", "12/03/2006", address, "Male", "Y2A");
        Student stdnt2 = new Student("Irumva", "Regis", "12/03/2006", address, "Male", "Y2A");
        Student stdnt3 = new Student("Irumva", "Regis", "12/03/2006", address, "Male", "Y2A");
        Student stdnt4 = new Student("Irumva", "Regis", "12/03/2006", address, "Male", "Y2A");
        Student stdnt5 = new Student("Irumva", "Regis", "12/03/2006", address, "Male", "Y2A");
        Student stdnt6 = new Student("Irumva", "Regis", "12/03/2006", address, "Male", "Y2A");
        System.out.println(Student.getCount());
    }
}