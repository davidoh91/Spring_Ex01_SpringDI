package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        //1. 기존방식
        /*
        MessageBean bean = new MessageEnImpl();
        bean.sayHello("david");

        bean = new MessageKoImpl();
        bean.sayHello("다윗");
        */

        //2. Spring container 방식 :
        /* ApplicationContext = Spring Container
         (IoC - Inversion of Control)
         는 meta data 라는 설정 정보가 필요하다 (applicationContext.xml 파일)

         -container 의 종류:
         1)BeanFactory : 객체 생성 + 소멸 등에 해당하는 객체의 라이프사이클을 관리
         2)ApplicationContext : BeanFactory 의 확장개념으로 BeanFactory의 기능 + 다국어지원, 메시지 처리
         3)WebApplicationContext : Spring Web MVC Container

            * container는 객체들 (beans)을 사전초기화 한다 (singleton 으로 미리 메모리에 생성)

         */


         ////////////////////////////////// init beans using applicationContext.xml //////////////////////////////////
         // (1)
        //ApplicationContext context = new ClassPathXmlApplicationContext("sample01/applicationContext.xml");
        // (2) use filesystem to get the applicationContext.xml file to init beans
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample01/applicationContext.xml");


        ////////////////////////////////// instantiate the right bean using the id / use the bean method
        MessageBean bean = context.getBean("ko", MessageBean.class);
        bean.sayHello("다윗");
        System.out.println("bean 주소 : " + bean);


        System.out.println("---------------------");
        bean = context.getBean("en", MessageBean.class);
        bean.sayHello("david");
        System.out.println("bean 주소 : " + bean);


        ////////////////////////////////// spring only create one bean object (Singleton) to save memory
        System.out.println("---------------------");
        bean = context.getBean("en", MessageBean.class);
        bean.sayHello("HJHJHJ");
        System.out.println("bean 주소 : " + bean);

        System.out.println("---------------------");
        bean = context.getBean("en2", MessageBean.class);
        bean.sayHello("created from bean id en2");
        System.out.println("bean 주소 : " + bean);


    }

}
