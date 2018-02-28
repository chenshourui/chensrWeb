import com.chensr.HelloWorld;
import com.chensr.test.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chensr on 2018/2/26.
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-context.xml");
        Person singer = (Person)ac.getBean("singer");
        singer.perform();
    }
}
