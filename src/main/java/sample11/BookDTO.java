package sample11;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Component //<bean class="sample11.BookDTO" id=bookDTO />
@Scope("prototype") // prototype scope will allow DTO1 and DTO2 to be created separately (different instances instead of one shared instance)
public class BookDTO {

    @Value("subject-Spring") // use springframework @Value() annotation
    private String subject;

    @Value("writer-Java Programmer")
    private String writer;

    @Value("1200")
    private int price;

    @Value("22.04.26")
    private String date;

}
