import java.util.ArrayList;

public class People {
    private ArrayList<Person> people = new ArrayList<>();
    private int id = 0;

    // append
    public int addPerson(String name, int age) {
        Person newPerson = new Person(name, age, this.id);
        this.people.add(newPerson);
        this.incrementId();

        return newPerson.getId();
    }

    // remove

    // search: one
    public Person fetchPerson(int id) {
        for (Person person : people) {
            if (person.getId() == id)
                return person;
        }

        return null;
    }

    // search: show all
    public void showPeople() {
        Screen scrn = new Screen(); // improvement: pass the width to the constructor...
        scrn.showAllUsers(this.people);
    }

    private void incrementId() {
        this.id++;
    }
}
