package sample08;

                                                    //use autowire="byType" because you need to use constructor-arg ref="dao2" as well
public class BookServiceImpl implements BookService {//<bean class="BookServiceImpl" autowire="byType">
    private BookDAO bookDAO;
    private MessageSender messageSender;
    private EmailSender emailSender;


    public BookServiceImpl(){}
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }


    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void setEmailSender(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void save(BookDTO book1, BookDTO book2) {
        bookDAO.save(emailSender, messageSender, book1, book2);
    }
}
