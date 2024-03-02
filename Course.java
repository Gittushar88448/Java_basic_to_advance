import java.util.Objects;

public class Course {
    static  int maxCapacity = 50;

    String courseName;
    int enrollment;

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    String[] enrollmentsArr ;

    Course(String courseName){
         this.courseName = courseName;
         enrollment = 0;
         this.enrollmentsArr = new String[maxCapacity];
    }


    void enrolledStudents(String studentName ){

        enrollmentsArr[enrollment] = studentName;
        enrollment++;
        System.out.println("Congratulations! "+ studentName +" you are now enrolled");

    }
    void unenrolledStudents(String studentName){
        int i = 0, j = 0;
        while (i < enrollmentsArr.length){
            if(!Objects.equals(enrollmentsArr[i], studentName)){
                enrollmentsArr[j] = enrollmentsArr[i];
                j++;
            }
            i++;
        }

        enrollment--;
        System.out.println(studentName +" you have now unenrolled in this course");
    }
    void checkEnrollment( String courseName){
        System.out.println(courseName + " enrolled course student is : "+this.enrollment);
    }


    public static void main(String[] args) {
        setMaxCapacity(50);
        Course webDev = new Course("WebDevelopment");
        Course softEngineering = new Course("SoftwareEngineering");
        webDev.enrolledStudents("Vatika");
        webDev.enrolledStudents("Radhika");
        webDev.enrolledStudents("Kamlesh");
        webDev.enrolledStudents("john");
        webDev.enrolledStudents("Folks");

        webDev.checkEnrollment("webDev");

        softEngineering.enrolledStudents("Dhruv");
        softEngineering.enrolledStudents("Dharam");

        softEngineering.checkEnrollment("softEngineering");

        webDev.unenrolledStudents("Vatika");

        webDev.checkEnrollment("webDev");
    }
}
