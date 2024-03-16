package Collections;

import java.util.*;

class DescendingStudentComparator implements Comparator<Student> {// Варто використовувати, якщо клас Student не
    // реалізував інтерфейс Comparable або якщо його реалізація не задовільняє ваші умови й ви хочете їх змінити
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

class StudentNameComparator implements Comparator<Student> {// Можна використовувати декілька компараторів одночасно
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}

public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Ivan"),
                new Student(100, "Adam"), new Student(22, "Vova"));
        List<Student> studentAL = new ArrayList<>(students);
        Collections.sort(studentAL);
        System.out.println(studentAL);
        // Collections.sort(studentAL,new DescendingStudentComparator());
        studentAL.sort(new DescendingStudentComparator());
        System.out.println("DescendingStudentComparator: " + studentAL);

        // TreeSet using with comparators
        Comparator<Student> studentComparator = new StudentNameComparator().thenComparing(new DescendingStudentComparator());
        TreeSet<Student> people = new TreeSet(studentComparator);
        people.add(new Student(1, "Tom"));
        people.add(new Student(12, "Clark"));
        people.add(new Student(37, "John"));
        people.add(new Student(24, "Tom"));
        System.out.println(people);


    }
}

