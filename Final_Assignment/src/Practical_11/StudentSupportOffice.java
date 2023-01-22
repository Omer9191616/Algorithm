package Practical_11;

public class StudentSupportOffice {
    public static void main(String[] args) {
        //creating students

        Student s1 = new Student("U0000001");
        Student s2 = new Student("U0000002");
        Student s3 = new Student("U0000003");
        Student s4 = new Student("U0000004");
        Student s5 = new Student("U0000005");

        System.out.println(s1);
//creating module and assigning students
        //assigning license for CIS2206
        Module cis2206 = new Module("CIS2206");
        System.out.println(cis2206);

        cis2206.enroll(s1);
        cis2206.enroll(s5);


        System.out.println(cis2206);
//creating new module
        Module cis2360 = new Module("CIS2360");

        cis2360.enroll(s1);
        cis2360.enroll(s3);

        cis2360.enroll(s4);
        System.out.println(cis2360);
        //creating new module
        Module cis2205 = new Module("CIS2205");


        cis2205.enroll(s2);
        cis2205.enroll(s4);
        cis2205.enroll(s5);

        System.out.println(cis2205);

        System.out.println("The students after changing modules\n");
        //changing students for module CIS2206
        cis2360.enroll(s2);
        cis2206.enroll(s3);
        cis2206.enroll(s4);
        cis2206.unroll(s5);
        cis2360.enroll(s2);
        //changing students for module CIS2360
        cis2360.enroll(s5);
        cis2205.enroll(s1);
        cis2205.enroll(s3);
//changing students for module CIS2205
        cis2205.unroll(s2);
        cis2205.unroll(s5);
//printing students for all module
        System.out.println(cis2206);
        System.out.println(cis2360);
        System.out.println(cis2205);
    }
}



