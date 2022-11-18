package oops.encapsulation;

public class College {
    private int collegeId;
    private String collegeName;
    private Student studentDetails;


    public static void main(String[] args) {
        College jntu = new College();
        jntu.collegeId=2001;
        jntu.collegeName = "JNTU Hyderabad";

        Student ravinder = new Student();

        ravinder.setStudentId(201);
        ravinder.setStudentName("Ravinder");
        ravinder.setStudentBranch("CSE");
        ravinder.setStudentMarks(88.00);

        jntu.studentDetails = ravinder;

        System.out.println(jntu.collegeId);
        System.out.println(jntu.collegeName);
        System.out.println(jntu.studentDetails);
        System.out.println(jntu.studentDetails.getStudentId());
        System.out.println(jntu.studentDetails.getStudentName());
        System.out.println(jntu.studentDetails.getStudentMarks());
        System.out.println(jntu.studentDetails.getStudentBranch());
    }
}
