import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("\nStudent Management");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Students");
            System.out.println("5. Display All Students");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    addStudent(studentList, scanner);
                    break;
                case 2:
                    updateStudent(studentList, scanner);
                    break;
                case 3:
                    deleteStudent(studentList, scanner);
                    break;
                case 4:
                    searchStudents(studentList, scanner);
                    break;
                case 5:
                    displayAllStudents(studentList);
                    break;
                case 6:
                    // Save to file
                    break;
                case 7:
                    // Load from file
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }

    private static void addStudent(List<Student> studentList, Scanner scanner) {
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Mark: ");
        double mark = scanner.nextDouble();

        Student student = new Student(rollNumber, name, age, mark);
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    private static void updateStudent(List<Student> studentList, Scanner scanner) {
        System.out.print("Enter Roll Number of student to update: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                System.out.print("Enter new Name: ");
                String name = scanner.nextLine();
                student.setName(name);

                System.out.print("Enter new Age: ");
                int age = scanner.nextInt();
                student.setAge(age);

                System.out.print("Enter new Mark: ");
                double mark = scanner.nextDouble();
                student.setMark(mark);

                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    private static void deleteStudent(List<Student> studentList, Scanner scanner) {
        System.out.print("Enter Roll Number of student to delete: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getRollNumber() == rollNumber) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    private static void searchStudents(List<Student> studentList, Scanner scanner) {
        System.out.print("Enter Roll Number of student to search: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        for (Student student : studentList) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println("Student found:");
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    private static void displayAllStudents(List<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("List of all students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
