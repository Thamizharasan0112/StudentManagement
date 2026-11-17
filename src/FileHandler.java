import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public static void saveStudents(ArrayList<Student> students) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter("students.txt"))) {

            for (Student s : students) {

                writer.write(
                        s.getId() + "," +
                                s.getName() + "," +
                                s.getAge() + "," +
                                s.getCourse()
                );

                writer.newLine();
            }

            System.out.println("Records saved successfully!");

        } catch (IOException e) {
            System.out.println("Error saving records: " + e.getMessage());
        }
    }

    public static void loadStudents(ArrayList<Student> students) {

        File file = new File("students.txt");

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",", -1);

                if (data.length != 4) {
                    continue;
                }

                Student student = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        data[3]
                );

                students.add(student);
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading records: " + e.getMessage());
        }
    }
}
