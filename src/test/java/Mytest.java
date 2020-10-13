import com.yang.pojo.Books;
import com.yang.pojo.User;
import com.yang.service.BookService;
import com.yang.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*BookService bookServiceimpl = (BookService)context.getBean("BookServiceImpl");
        for (Books books : bookServiceimpl.queryBookByName("如何")) {
            System.out.println(books);
        }*/
        UserService userServiceimpl = (UserService)context.getBean("UserServiceImpl");
        User bubu = userServiceimpl.getLoginUser("bubu");
        System.out.println(bubu);
    }
}
