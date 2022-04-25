package sample01;

public class MessageKoImpl implements MessageBean{

    public MessageKoImpl() {
        System.out.println("MessageKoImpl 기본 생성자 호출");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("안녕 나는 " + name);
    }
}
