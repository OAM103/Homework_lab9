package com.metanit.Ex2;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[]{

                new Student(1, 23),
                new Student(2, 130),
                new Student(3, 82),
                new Student(4, 323),
                new Student(5, 78)
        };

        System.out.println();
        Sort(students, students.length-1);
        for (Student s : students) {
            System.out.println(s);
        }

    }


    private  static StudentComp comp = new StudentComp();

    public static void Sort(Object[] array, int size){

        Object middle = array[size/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();

        for(int i = 0; i <= size; i++){
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            Sort(leftArr, left.size() - 1);
            System.arraycopy(leftArr, 0, array, 0, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            Sort(rightArr, right.size() - 1);
            System.arraycopy(rightArr, 0, array, left.size() + eq.size(), right.size());

        }

    }
}
