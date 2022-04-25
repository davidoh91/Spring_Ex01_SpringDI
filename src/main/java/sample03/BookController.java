package sample03;

public class BookController {

    private BookDAO bookDAO;
    private BookVo bookVo;

    BookController() {
        System.out.println("BookController constructor invoked..");
    }
    BookController(BookDAO bookDAO, BookVo bookVo) {
        this.bookDAO = bookDAO;
        this.bookVo = bookVo;
    }

    public void bookInsert() {
        System.out.println("BookController bookInsert() method invoked..");
        bookDAO.insert(bookVo);
    }


}
