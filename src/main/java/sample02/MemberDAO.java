package sample02;

public class MemberDAO {

    public MemberDAO() {
        System.out.println("MemberDAO constructor invoked..");
    }

    public void insert(Member member) {
        System.out.println("MemberDAO insert(Member member) invoked..");
        System.out.println("member = " + member);
    }

}
