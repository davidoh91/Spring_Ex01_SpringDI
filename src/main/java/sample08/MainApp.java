package sample08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample08/springDIAutowire.xml");

        //call controller's invoker
        BookController controller = context.getBean("controller", BookController.class);
        controller.invoker();
    }
}
