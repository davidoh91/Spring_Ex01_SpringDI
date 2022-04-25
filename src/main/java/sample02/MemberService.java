package sample02;

public class MemberService {

    private MemberDAO memberDAO;
    private Member member;

    public MemberService() {
        System.out.println("MemberService() consturctor invoked..");
    }

    public MemberService(MemberDAO memberDAO, Member member) {
        this.memberDAO = memberDAO;
        this.member = member;
    }

    public void serviceInsert() {
        System.out.println("MemberService() serviceInsert 호출됨..");
        memberDAO.insert(member);
    }

}
