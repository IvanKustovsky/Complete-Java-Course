package Collections;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Student1 st1 = new Student1("Zaur", 5);
        Student1 st2 = new Student1("Ivan", 3);
        Student1 st3 = new Student1("Misha", 1);
        Student1 st4 = new Student1("Sasha", 4);
        Student1 st5 = new Student1("Eugene", 2);

        PriorityQueue<Student1> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        priorityQueue.add(st5);
        System.out.println(priorityQueue); // course: 1 2 3 5 4 --- 5 після 4
        System.out.println("Peek: " + priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}

class Student1 implements Comparable<Student1> {
    String name;
    int course;

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return course == student1.course && Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    public Student1(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student1 other) {
        return this.course - other.course;
    }
}
