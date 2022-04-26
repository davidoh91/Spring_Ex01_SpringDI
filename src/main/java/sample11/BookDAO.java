package sample11;

public interface BookDAO {
    public abstract void save(EmailSender emailSender, MessageSender messageSender, BookDTO book1, BookDTO book2);
}
