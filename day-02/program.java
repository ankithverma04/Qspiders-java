public class StudentGradeSystem {

    public static void main(String[] args) {

        int marks = 78;

        String grade = (marks >= 90) ? "A" :
                       (marks >= 75) ? "B" :
                       (marks >= 60) ? "C" :
                       (marks >= 50) ? "D" : "Fail";

        System.out.println("Student Marks: " + marks);
        System.out.println("Grade: " + grade);

        if(marks >= 50) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }
    }
}
