public class Main {
    public static void main(String args[]) {
        Screen scrn = new Screen();
        boolean running = true;

        People p = new People();

        while (running) {
            String choice = scrn.showMenu();

            running = !choice.equalsIgnoreCase("X");

            if (!running) {
                break;
            }

            switch (choice) {
                case "1" -> {
                    int createdId = scrn.createUser(p);
                    scrn.showMessage("User has been created with id: " + createdId);
                }
                case "2" -> p.showPeople();
                case "3" -> {
                    int userId = scrn.getUserIdInput();
                    Person userFound = p.fetchPerson(userId);

                    if (userFound != null) 
                        scrn.showUser(userFound);
                    else
                        scrn.showMessage("User not found...");
                }
                default -> scrn.showMessage("Invalid key...");
            }
        }
    }
}