package people;


public class Human {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Human(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public Human(Human human){
       this.firstName = human.getFirstName();
       this.middleName = human.getMiddleName();
       this.lastName = human.getLastName();
       this.age = human.getAge();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (firstName != null ? !firstName.equals(human.firstName) : human.firstName != null) return false;
        if (middleName != null ? !middleName.equals(human.middleName) : human.middleName != null) return false;
        return lastName != null ? lastName.equals(human.lastName) : human.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }


}
