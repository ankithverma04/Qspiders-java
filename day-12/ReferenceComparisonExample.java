class Student {

    String name;

}

public class ReferenceComparisonExample {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Ankit";
        s2.name = "Ankit";

        if (s1 == s2) {
            System.out.println("Both references point to the same object");
        } else {
            System.out.println("References point to different objects");
        }

        Student s3 = s1;

        if (s1 == s3) {
            System.out.println("s1 and s3 refer to the same object");
        } else {
            System.out.println("s1 and s3 refer to different objects");
        }

    }
}
