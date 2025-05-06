package ch.fhnw.bit.collections.exercises.solutions;

import java.util.LinkedList;
import java.util.List;

public class LinkedListRemoveAll {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<String>();
        ll.add("Roger");
        ll.add("Boris");
        ll.add("Adam");
        ll.add("Claudia");
        ll.add("Adam");
        ll.add("Rainer");
        ll.add("Stefan");

        removeAllAdam(ll, "Adam");
    }

    private static void removeAllAdam(List<String> list, String name){
        System.out.println("Delete all: "+ name);
        for(String s : list){
            if(s.equals(name)){
                list.remove(s);
            }
        }
    }
}
