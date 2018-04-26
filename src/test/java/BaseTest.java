import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.Test;

@Test
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/spring-config.xml", "classpath:spring/spring-service.xml" })
public class BaseTest {
}
