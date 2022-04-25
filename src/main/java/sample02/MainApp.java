package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        /*
        ///////////////////////////////////////////////////////////////////////////
        //1. 기존방식 : service 호출 -> dao 호출해서 결과를 확인
        MemberDAO dao = new MemberDAO();
        Member member = new Member("dave", "1234", 30, "Korea");

        MemberService service = new MemberService(dao, member);
        service.serviceInsert();
        */


        ///////////////////////////////////////////////////////////////////////////
        //2. xml 활용한 방식
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample02/springDIConstructor.xml");

        System.out.println("------------------------------------------");
        MemberService service = context.getBean("service", MemberService.class);
        service.serviceInsert();

    }



    

}
