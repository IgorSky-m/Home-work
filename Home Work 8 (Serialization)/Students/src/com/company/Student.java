package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

public class Student implements Serializable {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String sex;
    private int course;
    private String specialization;


    public Student (int id, String name, String surname, int age, String sex,int course, String specialization) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.specialization = specialization;
    }
    public Student () {}


    public void generateRandomStudent() {
        GenerateLists generateList = new GenerateLists();
        try {
            generateList.initializeLists();
        } catch (IOException e) {
            return;
        }
        Random random = new Random();
//@ 0 ==  female , 1 == male
        if (random.nextInt(2) == 1) {
// Generate Male student name and surname
            this.sex = "M";
            this.name = generateList.getRandomMaleName();
            this.surname = generateList.getRandomSurname();
        } else {
// Generate Female student name and surname
            this.sex = "F";
            this.name = generateList.getRandomFemaleName();
            this.surname = generateList.getRandomSurname().concat("а");
        }
        this.age = 16 + Math.abs(random.nextInt(12));
        this.course = 1 + Math.abs(random.nextInt(5));
        this.id = 1_000_000 + Math.abs(random.nextInt(8_999_999));
        this.specialization = generateList.getRandomSpec();


    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", course=" + course +
                ", specialization='" + specialization + '\'' +
                '}';
    }
    public String toStringJournal(int number) {
        return "Студент" +
                " №=" + number +
                ", Студенческий билет №=" + id +
                ", Имя=" + name +
                ", Фамилия=" + surname +
                ", Возраст=" + age +
                ", Пол=" + sex +
                ", Курс=" + course +
                ", Специальность=" + specialization
                ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getCourse() {
        return course;
    }

    public String getSpecialization() {
        return specialization;
    }
}
