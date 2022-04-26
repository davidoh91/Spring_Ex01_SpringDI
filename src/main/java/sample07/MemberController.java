package sample07;

public class MemberController {
    private MemberVO memberVO;
    private MemberVO member;

    MemberController(){
        System.out.println("MemberController() default constructor invoked..");
    }

    public MemberController(MemberVO memberVO, MemberVO member) {
        this.memberVO = memberVO;
        this.member = member;
        System.out.println("MemberController(MemberVO memberVO, MemberVO member) constructor invoked.. : ");
        System.out.println("memberVO : " + memberVO + ", memberVO.getName() : " + memberVO.getName());
        System.out.println("member : " + member + ", member.getname() : " + member.getName());
    }

    public void setMemberVO(MemberVO memberVO) {
        this.memberVO = memberVO;
        System.out.println("setMemberVO(MemberVO memberVO) constructor invoked.. :");
        System.out.println(" setMemberVO(MemberVO memberVO) invoked.. , memberVO : " + memberVO + "memberVO.getName() : " + memberVO.getName() );
    }

    public void setMember(MemberVO member) {
        this.member = member;
        System.out.println("setMemberVO(Member member) constructor invoked.. :");
        System.out.println(" setMemberVO(Member member) invoked.. , member : " + member + "member.getName() : " + member.getName() );
    }
}
