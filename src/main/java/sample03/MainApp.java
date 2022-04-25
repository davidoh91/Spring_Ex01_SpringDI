package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample03/applicationContext.xml");
        BookController controller = context.getBean("bookController", BookController.class);

        controller.bookInsert();
    }
}
