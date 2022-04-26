package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component //id="boardController"
@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @Autowired
    private BoardDTO boardDTO1;
    @Autowired
    private BoardDTO boardDTO2;


    public BoardController(){}


    public void test() {
        System.out.println("BoardController test() invoked...");

        System.out.println("Checking if @Autowired has worked correctly");
        System.out.println("boardService = " + boardService);
        System.out.println("boardDTO = " + boardDTO1);
        System.out.println("boardDTO = " + boardDTO2);
    }
}
