package people;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static people.ReflectionDemo.findCountOfHuman;
import static people.ReflectionDemo.showPedigrees;

public class ReflectionDemoTest {
    @Test
    public void findCountOfHumanTest(){
        ArrayList<Object> list = new ArrayList<Object>();
        Human human1 = new Human("King","Alex","Maykolovich",19);
        list.add(human1);
        Integer i1 = 1;
        list.add(i1);
        Human human2 = new Human("Belova","Katerina","Alexandrovna",18);
        list.add(human2);
        String s = "I'm human";
        list.add(s);
        Human human3 = new Human("King","Andrey","Anatolievich",51);
        list.add(human3);
        ListDemo listDemo = new ListDemo();
        list.add(listDemo);
        assertEquals(findCountOfHuman(list),3);
    }

    @Test
    public void showMethodsTest(){
        class A{}
        class B extends A{}
        class C extends B{
            public C(){}
        }
        C c = new C();
        ArrayList<String> res = (ArrayList<String>) showPedigrees(c);
        ArrayList<String> list = new ArrayList<String>();
        list.add("C");
        list.add("B");
        list.add("A");
        list.add("Object");
        assertEquals(res,list);
    }
}
