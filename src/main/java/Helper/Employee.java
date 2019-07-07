package Helper;

public class Employee {
  private  String Firstname;
   private String Lastname;
   private String Gender;
    private String Age;

    public Employee(String firstname, String lastname, String gender, String age) {
        Firstname = firstname;
        Lastname = lastname;
        Gender = gender;
        Age = age;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                '}';
    }
}
