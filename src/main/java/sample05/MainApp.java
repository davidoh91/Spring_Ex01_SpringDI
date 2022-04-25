package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/sample05/applicationContext.xml");
        OrderMessageImpl orderMessage = context.getBean("orderMessage", OrderMessageImpl.class);


        System.out.println("orderId : " + orderMessage.getOrderId()); //orderId : 90
        
        UserBean userBean = orderMessage.getUserBean();
        System.out.println("name : " + userBean.getName()); //name : John Smith
        System.out.println("phone : " + userBean.getPhone()); //phone : 1234-1234
        
        ProductBean productBean = orderMessage.getProductBean();
        System.out.println("productName : " + productBean.getProductName()); //productName : MongShell
        System.out.println("productPrice : " + productBean.getProductPrice()); //productPrice : 5000

        orderMessage.getOrderMessage(); //message : 주문되었습니다
    }
}
