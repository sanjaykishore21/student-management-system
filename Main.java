import java.util.*;

class Student {

    List<String> list = new ArrayList<>();

    public void createStudent(int rollno, String name) {
        list.add(rollno + " " + name);
        System.out.println("Student detail created successfully");
    }

    public void removeStudent(int index) {

        if (index < 0 || index >= list.size()) {
            System.out.println("Index out of bound");
            return;
        }

        list.remove(index);
        System.out.println("Student detail removed successfully");
    }

    public void displayStudent() {

        if (list.isEmpty()) {
            System.out.println("No student records found");
            return;
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {

            System.out.println("\n1. Create Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollno = sc.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    s.createStudent(rollno, name);
                    break;

                case 2:
                    System.out.print("Enter Index: ");
                    int index = sc.nextInt();

                    s.removeStudent(index);
                    break;

                case 3:
                    s.displayStudent();
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}