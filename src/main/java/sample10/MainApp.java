package sample10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample10/springDIAnnotation.xml");

        BoardController boardController = context.getBean("boardController", BoardController.class);
        boardController.test();

        System.out.println("=======================================================================");

        BoardServiceImpl boardService = context.getBean("boardServiceImpl", BoardServiceImpl.class);
        boardService.select();

    }
}
