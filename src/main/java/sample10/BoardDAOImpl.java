package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component //it replaces <bean class="sample10.BoardDAOImpl" id="boardDAOImpl" /> in applicationContext.xml  ,  the default id is camel-typed classname
@Repository
public class BoardDAOImpl implements BoardDAO{

    @Override
    public void select() {
        System.out.println("BoardDAOImpl select() invoked...");
    }
}
