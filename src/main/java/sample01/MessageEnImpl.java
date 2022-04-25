package sample01;

public class MessageEnImpl implements MessageBean {

    public MessageEnImpl() {
        System.out.println("MessageEnBeanImpl constructor invoked");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello there i'm " + name);
    }

}
