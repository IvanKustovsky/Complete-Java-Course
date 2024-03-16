package PrimitiveDataTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Student {
    private final String name;
    private final ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int... marks){
        this.name = name;
        for(int mark:marks){
            this.marks.add(mark);
        }
    }

    public void print(int... values){
        System.out.println(Arrays.toString(values));
    }

    public int getMaximumMark(){
        return Collections.max(marks);
    }

    public void addNewMark(int mark){
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index){
        marks.remove(index);
    }

    public String toString(){
        return name + marks;
    }
}
