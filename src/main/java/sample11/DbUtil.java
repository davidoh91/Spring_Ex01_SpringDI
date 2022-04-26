package sample11;

import org.springframework.stereotype.Component;

@Component //<bean class="sample11.DbUtil" id="dbUtil"/>
public class DbUtil {
    public DbUtil(){
        System.out.println("DbUtil constructor invoked..");
    }
}
