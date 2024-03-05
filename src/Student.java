import java.util.Arrays;

public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    // Constructor
    public Student(String studentID, String studentName, int numActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numActivities];
    }

    // Getters and setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    // Method to add extra activities
    public void addExtraActivity(int numActivities) {
        for (int i = 0; i < numActivities; i++) {
            System.out.println("Enter extra activity " + (i + 1) + ": ");
            Object scanner;
            extraActivities[i] = (String) ((Object) scanner);
        }
    }

    private Object scanner() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'scanner'");
    }

    // toString method to display student details
    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", extraActivities=" + Arrays.toString(extraActivities) +
                '}';
    }
}
