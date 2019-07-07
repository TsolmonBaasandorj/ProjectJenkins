package Helper;

public class Contacter {
    private String FirstName;
    private String LastName;
    private String Phone ;
    private String Email    ;
    private String Subject;
    private String Message;

    public Contacter(String firstName, String lastName, String phone, String email, String subject, String message) {
        FirstName = firstName;
        LastName = lastName;
        Phone = phone;
        Email = email;
        Subject = subject;
        Message = message;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }


    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "Contacter{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", Subject='" + Subject + '\'' +
                ", Message='" + Message + '\'' +
                '}';
    }

}
