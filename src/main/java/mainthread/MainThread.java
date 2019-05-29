package mainthread;

import controller.StudentController;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);
        StudentController studentController = new StudentController ( );
        while (true) {
            System.out.println ("================MENU=============");
            System.out.println ("1 thêm sinh viên");
            System.out.println ("2 Lưu");
            System.out.println ("3 hiển thị sinh viên ");
            System.out.println ("4 kết thúc");
            int choice = scanner.nextInt ( );

            switch (choice) {
                case 1:
                    studentController.addStudent ( );
                    break;
                case 2:
                    studentController.writeFile ();
                    break;
                case 3:
                    studentController.readFile ();
                    break;
                case 4:
                    break;
                    default:
                        System.out.println ("chọn lại số từ 1-4" );
            }
        }
    }
}