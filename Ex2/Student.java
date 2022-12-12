package com.metanit.Ex2;

public class Student{

    private int idNum;
    private int GPA;

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Student(int idNum, int GPA) {
        this.idNum = idNum;
        this.GPA = GPA;
    }

    public String toString() {
        return "Student{" + "idNum=" + idNum + ", GPA=" + GPA + "}";
    }

}
