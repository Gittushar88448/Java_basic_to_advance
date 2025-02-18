
//. Define a Student class with fields like name and age, and user toString to print student details
public class Student {
    String name;
    int age;

    int rollNumber;

    String house;

    public Student(String name, int age, int rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student { name:" + name +
                ", age:" + age + "," +
                " roll number:" + rollNumber + ", " +
                "house:" + house  +
                " }";
    }

    public static void main(String[] args) {
        Student stu = new Student("Tushar", 20 , 32, "Gandhi");
        System.out.println(stu.toString());
    }

}
