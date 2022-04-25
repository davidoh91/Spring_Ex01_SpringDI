package sample04;

public class StudentDAOImpl implements StudentDAO{

    @Override
    public void insert(Student student) {
        System.out.println("StudentDAOImpl 의 insert 호출됨...");
        System.out.println("Student : " + student);
    }
}
