package model;

/**
 * Created by kollaps on 15.04.16.
 */
public class Contact {

    private final String name;

    private final String surname;

    private final String mail;

    private final String phone;

    private final String address;

    /*Когда у класса есть Builder, конструктор этого класса не должен быть доступен
    * никому кроме этого Builder-а*/
    Contact(ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.mail = contactBuilder.getMail();
        this.phone = contactBuilder.getPhone();
        this.address = contactBuilder.getAddress();
    }

}