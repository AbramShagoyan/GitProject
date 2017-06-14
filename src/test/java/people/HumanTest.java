package people;

import org.junit.Test;
import people.Human;

import static junit.framework.TestCase.assertEquals;

public class HumanTest {
    @Test
    public void simpleTest(){
       Human human1 = new Human("King","Alex","Maykolovich",19);
       Human human2 = new Human(human1);
       assertEquals(human1.getAge(),18);
       assertEquals(human1.getFirstName(),"King");
       assertEquals(human1.getMiddleName(),"Alex");
       assertEquals(human1.getLastName(),"Maykolovich");
       assertEquals(human1.equals(human2),true);
    }
}
