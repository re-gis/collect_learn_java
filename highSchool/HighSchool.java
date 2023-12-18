abstract class HighSchoolEntity {
    private String highSchoolName;

    public String getHighSchoolName() {
        return highSchoolName;
    }

    public void setHighSchoolName(String highSchoolName) {
        this.highSchoolName = highSchoolName;
    }

    public void sayHighSchoolName() {
        System.out.println("School name is: " + getHighSchoolName());
    }

    public abstract void highSchoolLocation();
}

public class HighSchool {
    public static void main(String[] args){
        HighSchoolEntity highSchool = new HighSchoolEntity() {

            @Override
            public void highSchoolLocation() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'highSchoolLocation'");
            }
            
        };
    }
}