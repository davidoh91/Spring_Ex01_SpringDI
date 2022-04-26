package sample09;

import javax.annotation.Resource;

public class ResourceBean {

    /*
        in pom.xml :
        <!-- added to enable @resource annotation -->
        <dependency>
            <groupId>javax.annotation</groupId>
            <artifactId>javax.annotation-api</artifactId>
            <version>1.3.2</version>
        </dependency>
     */
    @Resource(name="dto")
    private EmpDTO emp1;

    @Resource(name="dto2")
    private EmpDTO emp2;

    @Resource(name="service")
    private EmpService service;

    @Resource(name="controller")
    private EmpController controller;

    public void test() {
        System.out.println( "emp1 = " + emp1 + " , emp1.getEmpno() = " + emp1.getEmpno() );

        System.out.println("service = " + service);

        System.out.println("controller = " + controller);
    }

}
