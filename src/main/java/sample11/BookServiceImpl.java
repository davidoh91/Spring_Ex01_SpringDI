package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //<bean class="sample11.BookServiceImpl" id="bookServiceImpl"/>
public class BookServiceImpl implements BookService{
    @Autowired
    EmailSender emailSender;
    @Autowired
    MessageSender messageSender;


    public BookServiceImpl() {
        System.out.println("BookServiceImpl constructor invoked..");
    }


    @Override
    public void save(BookDTO book1, BookDTO book2) {
        System.out.println("BookServiceImpl save(BookDTO book1, BookDTO book2) invoked..");
    }
}
