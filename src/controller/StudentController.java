package controller;

import student.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    private ArrayList<Student> list = new ArrayList<Student> ( );

    public void addStudent() {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("nhập ID");
        String EnrolID = scanner.nextLine ( );
        System.out.println ("nhập tên sinh viên");
        String FirtName = scanner.nextLine ( );
        System.out.println ("nhập họ sinh viên");
        String LastName = scanner.nextLine ( );
        System.out.println ("nhập tuổi sinh viên");
        String Age = scanner.nextLine ( );
        Student student = new Student (EnrolID, FirtName, LastName, Age);
        list.add (student);

    }

    public void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter ("src/main/resources/students.dat");
        fileWriter.write ("EnrolID" +"|"+ "FullName" +"|"+ "Age"+"\n");
        for (Student student :
                list
        ) {
            fileWriter.write (student.getEnrolID ( )+"|" + student.getFirstName ( ) +student.getLastName ()+"|"+ student.getAge ()+"\n");

        }
        System.out.println ("Lưu thành công" );
        fileWriter.close ( );
    }

    public void readFile() throws IOException {
        FileReader fileReader = new FileReader ("src/main/resources/students.dat");
        BufferedReader bufferedReader = new BufferedReader (fileReader);
        String line;
        while ((line = bufferedReader.readLine ( )) != null) {
            System.out.println (line);
        }
    }
}