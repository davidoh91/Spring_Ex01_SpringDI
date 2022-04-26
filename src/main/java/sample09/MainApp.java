package sample09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample09/springDIAnnotation.xml");
        EmpController controller = context.getBean("controller", EmpController.class);
        controller.test();

        System.out.println("==================================================");
        ResourceBean rb = context.getBean("resourceBean", ResourceBean.class);
        rb.test();
    }
}
