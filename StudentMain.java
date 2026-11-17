import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        // Load existing records
        FileHandler.loadStudents(service.students);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    service.addStudent(
                            new Student(id, name, age, course)
                    );

                    FileHandler.saveStudents(service.students);

                    break;

                case 2:

                    service.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();

                    Student s = service.searchStudent(id);

                    if (s != null) {
                        System.out.println(s);
                    } else {
                        System.out.println("Student not found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    course = sc.nextLine();

                    service.updateStudent(id, name, age, course);

                    FileHandler.saveStudents(service.students);

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");
                    id = sc.nextInt();

                    service.deleteStudent(id);

                    FileHandler.saveStudents(service.students);

                    break;

                case 6:

                    System.out.println("Thank you for using the application!");

                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
