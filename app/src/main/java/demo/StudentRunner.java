package demo;

public class StudentRunner{
    public void studentMark(){
        int[] marks = {99,98,100};

        Student student = new Student("Ranga", marks);
        student.printStudentResult();
    }                
}