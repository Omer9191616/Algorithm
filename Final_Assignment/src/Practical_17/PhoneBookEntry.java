package Practical_17;

import java.util.*;
public class PhoneBookEntry {

//setting variable
   private String name;
    private String surname;
   private String phone_number;
 private String address;
    private String email;
//method to store the phonebook entry
    public PhoneBookEntry(String name,String surname ,String phone_number, String address,String email) {

        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
        this.email=email;
        this.surname=surname;
    }

//get methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }
    //print entry


    @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
