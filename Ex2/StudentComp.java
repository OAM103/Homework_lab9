package com.metanit.Ex2;

import java.util.Comparator;

public class StudentComp implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Student) o1).getGPA() - ((Student) o2).getGPA();
    }
}
