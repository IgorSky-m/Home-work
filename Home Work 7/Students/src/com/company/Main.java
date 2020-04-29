package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        System.out.println(random.nextInt(2));
        Student student = new Student();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("StudentsList.txt"))) {
            for (int i = 0; i < 100; i++) {
                student.generateRandomStudent();
                writer.append(student.toString());
                writer.newLine();
                writer.flush();

            }
        }
    }
}
