package Practical_11;


import java.util.*;




//creating class
class Module {
    //setting variables
    private String moduleID;
    private Student[] class_list;

    private int enrolled;

    //CREATING FUNCTION FOR MODULE
    public Module(String moduleID) {
        this.moduleID = moduleID;
        this.class_list = new Student[5];

        this.enrolled = 0;
        int b = this.class_list.length;
    }




    //CREATING FUNCTION FOR RETURN MODULE ID
    public String getModuleID() {
        return this.moduleID;
    }

    public String toString() {
        // CODE FOR TO STRING A MODULE
        String output = "Module " + this.getModuleID() + "\n";
        output += "Enrolled Student:\n";
        for (int i = 0; i < enrolled; i++) {
            output += "\t" + this.class_list[i] + "\n";
        }
        return output;
    }

    //CODE FOR ENROL
    public void enroll(Student s) {
        if (notContained(s)) {
            this.class_list[this.enrolled] = s;
            this.enrolled += 1;
        }
    }


    public Boolean notContained(Student s) {
        boolean Found = false;
        int FoundStudnetIndex = 0;

        //Finding Stundet from the list.
        for (int i = 0; i < enrolled; i++) {
            if (s.getStudentID() == class_list[i].getStudentID()) {
                Found = true;
                FoundStudnetIndex = i;
                break;
            }
        }
        //If Student is not Found
        if (Found == true) {
            System.out.println("Student Not found to be Deleted");
            return false;
        }
        else {
            return  true;
        }

    }

    public void unroll(Student s) {
        boolean Found = false;
        int FoundStudnetIndex = 0;

        //Finding Stundet from the list.
        for (int i = 0; i < enrolled; i++) {
            if (s.getStudentID() == class_list[i].getStudentID()) {
                Found = true;
                FoundStudnetIndex = i;
                break;
            }
        }
        //If Student is not Found
        if (!Found)
            System.out.println("Student Not found to be Deleted");
        else {
            //If Student is Found
            for (int i = FoundStudnetIndex; i < enrolled - 1; i++) {
                class_list[i] = class_list[i + 1];
            }
        }
        enrolled--;
    }
}

