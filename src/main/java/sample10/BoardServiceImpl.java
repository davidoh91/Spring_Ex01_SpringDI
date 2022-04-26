package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component //<bean class="" id=boardServiceImpl"/>
@Service
public class BoardServiceImpl implements BoardService {

//(1)    use @Autowired //first search "byType" , and then "byName"

//(2)    or use @Resource(name="")
    @Resource(name="boardDAOImpl")
    private BoardDAO boardDAO;

    @Resource(name="myBatisDao")
    private BoardDAO boardMyBatisDAOImpl;


    public BoardServiceImpl() {}


    @Override
    public void select() {
        System.out.println("BoardServiceImpl() select() invoked...");
        System.out.println("boardDao = " + boardDAO);
        System.out.println("boardMyBatisDAOImpl = " + boardMyBatisDAOImpl);

        boardDAO.select();
        System.out.println("---------------------");
        boardMyBatisDAOImpl.select();
    }
}
