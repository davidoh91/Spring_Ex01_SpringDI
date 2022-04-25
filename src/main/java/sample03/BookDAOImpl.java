package sample03;

public class BookDAOImpl implements BookDAO {

    public BookDAOImpl(){
        System.out.println("BookDAOImpl constructor invoked..");
    }


    @Override
    public void insert(BookVo bookVo) {
        System.out.println("BookDAOImpl insert(BookVo bookVo) method invoked..");

        System.out.println("subject" + bookVo.getSubject());
        System.out.println("writer" + bookVo.getWriter());
        System.out.println("price" + bookVo.getPrice());
        System.out.println("date" + bookVo.getDate());
    }

}
