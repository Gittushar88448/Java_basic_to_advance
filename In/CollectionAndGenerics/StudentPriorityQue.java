package In.CollectionAndGenerics;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQue {

    public static void main(String[] args) {
        PriorityQueue<Student> stud = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });
        stud.offer(new Student("Tushar" , 'B'));
        stud.offer(new Student("Anil" , 'C'));
        stud.offer(new Student("Trupalli" , 'A'));
        stud.offer(new Student("Mohan" , 'D'));
        stud.offer(new Student("Shyam" , 'A'));
        System.out.printf("Oueue is: %s ", stud );
    }

    public static class Student{
        private final String name;
        private final  char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return
                    "name='" + name + '\'' +
                    ", grade=" + grade ;
        }
    }

}
