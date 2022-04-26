package sample11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample11/springDIAnnotation.xml");
        BookController controller = context.getBean("bookController", BookController.class);

        controller.invoker();

    }
}
