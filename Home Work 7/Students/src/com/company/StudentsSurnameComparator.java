package com.company;

import java.util.Comparator;

public class StudentsSurnameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getSurname().compareTo(student2.getSurname());
    }
}
