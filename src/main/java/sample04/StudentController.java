package sample04;

public class StudentController {

    private StudentService studentService;
    private Student student;


    public StudentController(){
        System.out.println("StudentService constructor invoked...");
    }


    public void setStudent(Student student) {
        this.student= student;
        System.out.println("StudentController 의 setStudent(Student student) 호출됨, student = " + student);
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
        System.out.println("StudentController 의 setStudentService(StudentService studentService) 호출됨, studentService = " + studentService);
    }


    public void insert() {
        System.out.println("StudentController insert() method invoked...");

        //call service's insert method
        studentService.insert(student);


    }

}
