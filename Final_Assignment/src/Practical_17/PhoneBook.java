package Practical_17;//adding libraries
import java.util.*;

public class PhoneBook {
   //introducing map

      Map<String, PhoneBookEntry> phoneBookMap;
//method create a hash map entry
     public PhoneBook(){
          this.phoneBookMap = new HashMap();
     }
//function use for inserting entry in  phonebook
     public void insertPBE(String name,String surname ,String phone_number, String address,String email){
          PhoneBookEntry pbe = new PhoneBookEntry(name,surname, phone_number, address,email);
//to check that the user is already in the phonebook or not
          if (!this.phoneBookMap.containsKey(name))
               this.phoneBookMap.put(name, pbe);
          else
          {
               System.out.println("Duplicate name detected");
               System.out.println("This name is already in the  phonebook");
          }

     }
//user to overwrite an entry
     public void updatePBE(String name,String surname ,String phone_number, String address,String email){
          PhoneBookEntry pbe = new PhoneBookEntry(name,surname, phone_number, address,email);
//to check that the user is already in the phonebook or not
          if (this.phoneBookMap.containsKey(name)) {
               this.phoneBookMap.replace(name, pbe);
          }
          else
          {
               System.out.println("Unable to find the name ");
               System.out.println("This name is not in the  phonebook");
          }


     }
     //function use for delete an entry

     public void deletePBE(String name){

//to check that the user is already in the phonebook or not
          if (this.phoneBookMap.containsKey(name)) {

               this.phoneBookMap.remove(name);
          }
          else
          {
               System.out.println("Unable to find the name ");
               System.out.println("This name is not in the  phonebook");
          }

     }



     //function use to print the entry
     public void printPBE(String name){

//to check that the user is already in the phonebook or not
          if (this.phoneBookMap.containsKey(name)) {
               System.out.println(this.phoneBookMap.get(name));
          }
          else
          {
               System.out.println("Unable to find the name ");
               System.out.println("This name is not in the  phonebook");
          }

     }
     //function use to print the phonebook



     public void getPhoneBookMap() {
          for (Map.Entry<String, PhoneBookEntry> entry: this.phoneBookMap.entrySet()){
          System.out.println(" " + entry.getValue());
     }
     }

     @Override
     public String toString() {
          return "PhoneBook{" +
                  "phoneBookMap=" + phoneBookMap +
                  '}';
     }


}

