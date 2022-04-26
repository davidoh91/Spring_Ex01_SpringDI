package sample09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {

    @Autowired //byType or byName injection
    private EmpDTO empDTO;

    @Autowired
    @Qualifier("aa") //to autowire multiple EmpDTO instances, @Qualifier( <qualifier value="aa"/> ) annotation
    private EmpDTO dto;

    @Autowired
    private EmpService service;

    public void test() {
        System.out.println("service = " + service);

        System.out.println("empDTO = " + ", empDTO.getEmpno() = " + empDTO.getEmpno());
        System.out.println("dto = " + dto + ", dto.getEmpno() = " + dto.getEmpno());

        service.test();
    }


}
