package lesson3.phonebook;

public class Person {
    private String phone;
    private String eMail;

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return eMail;
    }

    public Person(String phone, String eMail) {
        this.phone = phone;
        this.eMail = eMail;
    }
}
