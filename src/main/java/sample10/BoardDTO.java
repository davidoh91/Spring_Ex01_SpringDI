package sample10;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
these lombok annotation will create the default/all args constructors , getters/setters , and toSTring method

additionally, use @Component springframework annotation to use it as a component
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Component //id="boardDTO"
@Scope("prototype") // prototype scope will allow DTO1 and DTO2 to be constructed as different instances instead of a shared single instance
public class BoardDTO { //교제 34 page 참조해볼것

    // use springframework @Value() annotation
    @Value("10")
    private int no;

    @Value("Spring Dependency Injection")
    private String subject;

    @Value("Spring is concise but could seem complex for beginners")
    private String content;

}
