import java.util.Objects;

public class Entry {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String emailAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Entry(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return """
                |------------|
                |   Entry    |
                |------------|
                |First Name: %s
                |Last Name: %s
                |Phone Number: %s
                |Email Address: %s
                """.formatted(firstName, lastName, phoneNumber, emailAddress);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || getClass() !=o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(firstName, entry.firstName) && Objects.equals(lastName, entry.lastName) &&
                Objects.equals(phoneNumber, entry.phoneNumber) && Objects.equals(emailAddress, entry.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumber, emailAddress);
    }
}
