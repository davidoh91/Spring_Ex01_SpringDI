package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //<bean class="" id="bookController"/>
public class BookController {
    @Autowired
    private BookDTO book1;
    @Autowired
    private BookDTO book2;
    //or use @Resource(name="bookService") .. then simpler name can be switched for the field name, like "service"
    @Autowired
    private BookService bookService;


    public BookController() {

        System.out.println("BookController constructor invoked..");
    }


    public void invoker() {
        System.out.println("BookController invoker() invoked..");
        System.out.println("BookController field member book1 : " + book1);
        System.out.println("BookController field member book2 : " + book2);

        bookService.save(book1, book2);
    }


}
