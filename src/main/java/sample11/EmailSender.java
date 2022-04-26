package sample11;

import org.springframework.stereotype.Component;

@Component //<bean class="sample11.EmailSender" id="emailSender"/>
public class EmailSender {
    public EmailSender(){
        System.out.println("EmailSender constructor invoked..");
    }
}
