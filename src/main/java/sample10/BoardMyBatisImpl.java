package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("myBatisDao") //replaces default id boardMyBatisImpl with <bean class="" id="mybatisDao"/>
@Repository("myBatisDao")
public class BoardMyBatisImpl implements BoardDAO{
    @Override
    public void select() {
        System.out.println("BoardMyBatisImpl select() invoked...");
    }
}
