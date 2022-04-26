package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //<bean class="sample11.BookDAOImpl" id="bookDAOImpl"/>
public class BookDAOImpl implements BookDAO{

    @Autowired
    private DbUtil dbUtil;


    public BookDAOImpl(){
        System.out.println("BookDAOImpl constructor invoked..");
    }


    @Override
    public void save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2) {
        System.out.println("BookDAOImpl save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2) method invoked..");
        System.out.println("saved emailSender : " + emailSender);
        System.out.println("saved messageSender : " + messageSender);
        System.out.println("saved book1 : " + book1);
        System.out.println("saved book2 : " + book2);
    }
}
