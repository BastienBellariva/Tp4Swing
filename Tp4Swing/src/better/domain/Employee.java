package better.domain;

public abstract class Employee {

    private static String NAME_PATTERN = "%s %s %s";
    private String firstname;
    private String lastname;
    private String age;
    private String entryYear;


    public Employee(String firstname, String lastname, String age, String entryYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.entryYear = entryYear;
    }

    public abstract double calculerSalaire();
    public abstract String getPosition();

    public String getName() {
        return String.format(NAME_PATTERN, getPosition(), firstname, lastname);
    }

    public String getFirstname() {
        return firstname;
    }

    public String getAge() {
        return age;
    }

    public String getEntryYear() {
        return entryYear;
    }

    public String getType() {
        return getPosition();
    }

    public String getLastname() {
        return lastname;
    }
}
