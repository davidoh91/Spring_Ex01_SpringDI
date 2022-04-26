package sample07;

public class MemberVO {

    private String name;
    private int age;
    private String addr;

    public MemberVO() {
        System.out.println("MemberVO default constructor");
    }
    public MemberVO(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        System.out.println("MemberVO(String name, int age, String addr) constructor invoked..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("MemberVO setName invoked.. : " + name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("MemberVO setAge invoked.. : " + age);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
        System.out.println("MemberVO setAddr invoked.. : " + addr);
    }
}
