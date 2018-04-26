import com.alibaba.fastjson.JSON;
import com.hj.dao.BookDao;
import com.hj.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;


@ContextConfiguration({ "classpath:spring/spring-config.xml", "classpath:spring/spring-service.xml" })
public class BookDaoTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private BookDao bookDao;


    @org.testng.annotations.Test
    public void testQueryById() throws Exception {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(JSON.toJSONString(book));
    }
}
