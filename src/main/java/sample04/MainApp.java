package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample04/springDISetter.xml");

        System.out.println("==============================================");
        StudentController controller = context.getBean("controller", StudentController.class);

        controller.insert();

    }
}
