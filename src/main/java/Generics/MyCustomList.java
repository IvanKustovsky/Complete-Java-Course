package Generics;

import java.util.ArrayList;

public class MyCustomList<TYPE> {

    ArrayList<TYPE> list = new ArrayList<>();

    public void addElement(TYPE element){
        list.add(element);
    }

    public void removeElement(TYPE element){
        list.remove(element);
    }

    public TYPE get(int index){
        return list.get(index);
    }

    @Override
    public String toString(){
        return list.toString();
    }
}
