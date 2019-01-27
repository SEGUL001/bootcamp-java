import com.test.lucas.app.Person;
import com.test.lucas.app.Student;
import com.test.lucas.app.Teacher;
import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    @Test
    public void heritageTest(){
        Person a = new Teacher();
        Person b = new Student();

        Assert.assertEquals("Hello, im a teacher",a.sayHello());
        Assert.assertEquals("hi, im a student.",b.sayHello());
    }



}
