package model;

/**
 * Created by kollaps on 15.04.16.
 */
public class ContactBuilder {

    private String name;

    private String surname;

    private String mail;

    private String phone;

    private String address;

    public ContactBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder surname(final String surname) {
        this.surname = surname;
        return this;
    }

    public ContactBuilder mail(final String mail) {
        this.mail = mail;
        return this;
    }

    public ContactBuilder phone(final String phone) {
        this.phone = phone;
        return this;
    }

    public ContactBuilder address(final String address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Contact build() {
        return new Contact(this);
    }
}
