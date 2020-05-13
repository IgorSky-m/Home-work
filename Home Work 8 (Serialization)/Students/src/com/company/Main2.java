package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main2 {

    public static void main(String[] args)  {
        long start = System.currentTimeMillis();
        Random random = new Random();
        List<Student> studentsList = new ArrayList<>();
        List<Student> studentsListNew = new ArrayList<>();
        //Создаем List студентов
        try(ObjectOutputStream writeObject = new ObjectOutputStream(new FileOutputStream("WriteObjectList.bin"))){
            for (int i = 0; i <100_100 ; i++) {
                Student student = new Student();
                student.generateRandomStudent();
                studentsList.add(student);
            }
         //Записываем List в файл
            writeObject.writeObject(studentsList);
            writeObject.flush();

        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
        }
        // достаем List из файла и записывам в новый List
        try(ObjectInputStream readObj = new ObjectInputStream(new FileInputStream("WriteObjectList.bin"))){

            studentsListNew = (List<Student>)readObj.readObject();

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        // Печатаем для проверки первый и второй List's
//        for (Student student1 : studentsList) {
//            System.out.println(student1.toString());
//        }
//        System.out.println("-----------------------------------------------------");
//
//        for (Student student2 : studentsListNew) {
//            System.out.println(student2.toString());
//        }
        // Создаем Комаратор с сортировкой по фамилии, сортируем и выводим отсортированный список
        StudentsSurnameComparator comparator = new StudentsSurnameComparator();
        studentsListNew.sort(comparator);

//        System.out.println("-----------------------------------------------------");
//
//        for (Student student3 : studentsListNew) {
//            System.out.println(student3.toString());
//        }

        //Записываем по полям

        try(ObjectOutputStream writeObject = new ObjectOutputStream(new FileOutputStream("SortedStudentsField.txt"))) {
            for (int i = 0; i <studentsListNew.size() ; i++) {

                writeObject.writeInt(studentsListNew.get(i).getId());
                writeObject.writeUTF(studentsListNew.get(i).getName());
                writeObject.writeUTF(studentsListNew.get(i).getSurname());
                writeObject.writeInt(studentsListNew.get(i).getAge());
                writeObject.writeUTF(studentsListNew.get(i).getSex());
                writeObject.writeInt(studentsListNew.get(i).getCourse());
                writeObject.writeUTF(studentsListNew.get(i).getSpecialization());
                writeObject.flush();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        



    }
}
