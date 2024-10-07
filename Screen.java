import java.util.ArrayList;
import java.util.Scanner;

public class Screen {
    final private int WIDTH = 120;
    private Scanner sn = new Scanner(System.in);

    public String showMenu() {
        clearScreen();

        System.out.println("USER MANAGEMENT SYSTEM");
        System.out.println("[1] Create Record");
        System.out.println("[2] Show All Users");
        System.out.println("[3] Find User");
        System.out.println("[X] Exit Program");
        System.out.println("");
        System.out.print("Enter your choice: ");

        String choice = sn.nextLine();

        return choice;
    }

    public void showAllUsers(ArrayList<Person> people) {
        clearScreen();

        // print the headers
        String[] headers = { "* ID", "* NAME", "* AGE" };
        createBorder();
        createRow(headers);
        createBorder();

        // print the rows
        for (Person person : people) {
            String name = "* " + person.getName();
            String age = "* " + person.getAge();
            String id = "* " + person.getId();
            String[] row = { id, name, age };

            createRow(row);
        }

        createBorder();

        System.out.println("");
        System.out.println("Press Enter to return to the menu...");
        sn.nextLine();
    }

    public int getUserIdInput() {
        clearScreen();

        System.out.println("USER MANAGEMENT SYSTEM");
        System.out.println("Find User");
        System.out.println("");
        System.out.print("Enter User ID: ");
            
        int inputId = Integer.parseInt(sn.nextLine());

        return inputId;
    }

    public void showUser(Person person) {
        clearScreen();

        // print the headers
        String[] headers = { "* ID", "* NAME", "* AGE" };
        createBorder();
        createRow(headers);
        createBorder();

        String name = "* " + person.getName();
        String age = "* " + person.getAge();
        String id = "* " + person.getId();
        String[] row = { id, name, age };

        createRow(row);
        createBorder();

        System.out.println("");
        System.out.println("Press Enter to return to the menu...");
        sn.nextLine();
    }

    public int createUser(People people) {
        clearScreen();

        System.out.println("USER MANAGEMENT SYSTEM");

        System.out.print("Name: ");
        String inputName = sn.nextLine();

        System.out.print("Age: ");
        int inputAge = Integer.parseInt(sn.nextLine());

        return people.addPerson(inputName, inputAge);
    }

    public void showMessage(String message) {
        clearScreen();

        System.out.println("USER MANAGEMENT SYSTEM");
        System.out.printf("Message: %s\n", message);
        System.out.println("");
        System.out.print("Press any key to continue...");

        sn.nextLine();
    }

    static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    void createRow(String[] row) {
        StringBuilder newRow = new StringBuilder();
        int baseWidth = this.WIDTH / row.length;

        for (int i = 0; i < row.length; i++) {
            int columnWidth = baseWidth;

            newRow.append(padBlanks(row[i], columnWidth, i == row.length - 1));
        }

        System.out.println(newRow);
    }

    StringBuilder padBlanks(String val, int colWidth, Boolean lastCol) {
        StringBuilder str = new StringBuilder(val);
        int spacesToAdd = colWidth - str.length();

        if (spacesToAdd > 0) {
            for (int i = 0; i < spacesToAdd; i++) {
                str.append((lastCol && i == (spacesToAdd - 2)) ? "*" : " ");
            }
        }

        return str;
    }

    void createBorder() {
        StringBuilder border = new StringBuilder();
        for (int i = 0; i < this.WIDTH; i++) {
            border.append((i % 2 == 0 ? "*" : " "));
        }

        System.out.println(border);
    }
}