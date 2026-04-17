import java.util.*;

class Student {
    String name;
    int roll;
    String grade;

    Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }

    void display() {
        System.out.println(name + " " + roll + " " + grade);
    }
}

public class StudentManagementSystem {
    static ArrayList<Student> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Remove 3.Search 4.Display 5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Grade: ");
                    String grade = sc.nextLine();

                    list.add(new Student(name, roll, grade));
                    break;

                case 2:
                    System.out.print("Enter roll to remove: ");
                    int r = sc.nextInt();
                    list.removeIf(s -> s.roll == r);
                    break;

                case 3:
                    System.out.print("Enter roll to search: ");
                    int search = sc.nextInt();
                    for (Student s : list) {
                        if (s.roll == search) {
                            s.display();
                        }
                    }
                    break;

                case 4:
                    for (Student s : list) {
                        s.display();
                    }
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}