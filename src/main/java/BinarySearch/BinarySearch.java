package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(8);
        list.add(15);
        list.add(0);
        list.add(-331);
        list.add(-92);
        list.add(187);
        list.add(23);
        list.add(12);
        list.add(5);
        Collections.sort(list);
        int index = Collections.binarySearch(list, -92);
        System.out.println(index);

        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);


        Employee emp1 = new Employee(12, "Ivan", 99650);
        Employee emp2 = new Employee(-10, "Sergey", 9500);
        Employee emp3 = new Employee(2, "Misha", 71000);
        Employee emp4 = new Employee(89, "Liza", 45870);
        Employee emp5 = new Employee(-10, "Marina", 15670);
        Employee emp6 = new Employee(-192, "Natalya", 5660);
        Employee emp7 = new Employee(44, "Andriy", 8900);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(-10, "Sergey", 0));
        System.out.println(index2);


        ///////////////
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 5);
        System.out.println(index3);


    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee that) {
        int result = this.id - that.id;
        if (result == 0) {
            result = this.name.compareTo(that.name);
        }
        return result;
    }
}
