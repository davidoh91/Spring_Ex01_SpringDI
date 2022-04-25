package sample04;

public class StudentServiceImpl implements StudentService{

    private StudentDAO studentDAO;

    public StudentServiceImpl() {
        System.out.println("StudentServiceImpl constructor invoked..");
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
        System.out.println("StudentServiceImpl setStudentDAO(StudentDAO studentDAO) method invoked..");
    }

    @Override
    public void insert(Student student) {
        System.out.println("StudentServiceImpl insert(Student student) method invoked..");

        //calling DAO
        studentDAO.insert(student);
    }
}
