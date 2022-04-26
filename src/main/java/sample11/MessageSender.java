package sample11;

import org.springframework.stereotype.Component;

@Component //<bean class="sample11.MessageSender" id="messageSender" />
public class MessageSender {
    public MessageSender() {
        System.out.println("MessageSender constructor invoked..");
    }
}
