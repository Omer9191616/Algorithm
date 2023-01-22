package Practical_17;

import java.util.HashMap;
//main class where user can do any function
public class User {
    public static void main(String[] args) {
//creating phonebook
        PhoneBook pb = new PhoneBook();
        //inserting elements in phonebook
        pb.insertPBE("umer","Munir","07934921761","564 huddersfield road dewsbury","umermunir@gmail.com");
        pb.insertPBE("masif","Muhammad","055767361","168 lee street huddersfield","masif143@hotmail.com");
        pb.insertPBE("abdul","Wahid","0879866556","13 north valley road rochdale  ","abddul89@gmail.com");
//printing entry from phonebook
        pb.printPBE("umer");
        //update entry from phonebook
pb.updatePBE("umer","Munir","07934921761"," 21 pan valley road dewsbury","umermunir786786@gmail.com");
//again printing  to check the changes
        pb.printPBE("umer");
        //delete entry from phonebook
        pb.deletePBE("abdul");
        //printing all entries
pb.getPhoneBookMap();
    }
}
